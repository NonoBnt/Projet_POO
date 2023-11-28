package characters;

import java.util.Map;

import Actions.*;
import items.*;
import locations.*;

public class Hero extends Characters implements Attack, Use, Talk{
    private static final int MIN_HP = 50;
    private static final int MAX_HP = 400;
    private int HP;
    private final String name = "Hero";
    private final int damage = 10;
    private Locations pos;
    private Weapon weapon;
    private Armor shield;
    private Inventory backpack;


    public Hero(Locations loc){
        this.HP = (MIN_HP + (int)(Math.random() * (( MAX_HP- MIN_HP )+1)));
        this.weapon = null;
        this.shield = null;
        this.backpack = null;
        this.pos = loc;
    }
    public boolean theirIskey(){
        return backpack.isKey();
    }

    public void attack(Characters ennemi){
        if(ennemi.getHP() <= 0){
            System.out.println("You try to fight against " + ennemi.getClass().getSimpleName() + "but he has no hp.");
            System.out.println("Your attack has choke.");
        } else {
            System.out.println("You are fighting against " + ennemi.getClass().getSimpleName() + ".");
            int Newdamage = ((this.weapon.getDamage() + this.damage) - ennemi.getShield().getDamageReduction());
            System.out.println("You hit and hurt him. It cause" + Newdamage + "damage to him.");
            ennemi.setHP(ennemi.getHP() - Newdamage);
            if(ennemi.getHP() <=0){
                System.out.println("You beat " + ennemi.getClass().getSimpleName() + "!");
            }
        }

    }
    public void enter(String location){
        Map<String,Exits> exits = this.pos.getExits();
        if(pos.getState() == false){
            if(exits.containsKey(location)){
                Exits exit = exits.get(location);
                if(exit.getkey() == true){
                    if(theirIskey() == true){
                        exit.useKey();
                        this.backpack.delFirstKey();
                        pos.delChar(this);
                        this.pos = exit.getNextloc();  
                        pos.addChar(this);
                        System.out.println(pos.getDes());
                    }
                    else{
                        System.out.println("You don’t have the key, you can’t go in! Maybe there’s one in another room ");
                    }
                }
                else {
                    pos.delChar(this);
                    this.pos = exit.getNextloc();  
                    pos.addChar(this);
                    System.out.println(pos.getDes());
                }
            }
            else {
            System.out.println("error, please enter a valid exit, use LOOK to know the different exits");
            } 
        }
        else {
            System.out.println("! There’s a monster! You can’t change rooms until you defeat it");
        }   
    }
	
    @Override
	public void attack(String ennemy) {
        Characters vilain = pos.getTargetInRoom(ennemy);
        if (vilain == null){
            System.out.println("Aucune cible dans la pièce");
        }else{
            attack(vilain);
        } 
	}
    @Override
    public void use(String item) {
       if (this.backpack.getFirstInstanceItems(item) instanceof Apple){
            this.HP += 10;
            this.backpack.delItems(this.backpack.getFirstInstanceItems(item));
       }else-if(this.backpack.getFirstInstanceItems(item) instanceof HealPotion){
            this.HP += 30;
            this.backpack.delItems(this.backpack.getFirstInstanceItems(item));
       }else-if(this.backpack.getFirstInstanceItems(item) instanceof Weapon){
            if (this.weapon != null){
                this.weapon.use();
                if (this.weapon.isBroke()){
                    this.weapon = null;
                }
            }else{
                
            }
       }
    }
    @Override
    public void talk(String pnj) {
       if (this.pos.isHumanInLoc(pos, pnj)){
            Human human = this.pos.getHumanInLoc(pos);
            human.interact();
       }
       if (this.pos.isChestInLoc(pos, pnj)){
            Chest chest = this.pos.getChestInLoc(pos);
            chest.interact(); 
       }
    }
}

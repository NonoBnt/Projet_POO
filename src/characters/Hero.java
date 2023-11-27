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

    public void attack(Items item, Characters ennemi){
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
        if(exits.containsKey(location)){
            Exits exit = exits.get(location);
            if(exit.getkey() == true){
                if(theirIskey() == true){
                pos.delChar(this);
                this.pos = exit.getNextloc();  
                pos.addChar(this);
                

                }
                else{
                    System.out.println("You don’t have the key, you can’t go in! Maybe there’s one in another room ");
                }



            }
            else {

            }

        }
        else {
            System.out.println("error, please enter a valid exit, use LOOK to know the different exits");
        }

         
    }
    }
	@Override
	public void attack(String ennemy) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'attack'");
	}
    @Override
    public void use(String item) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'use'");
    }
    @Override
    public void talk(String pnj) {
       if (this.pos.isHumanInLoc(pos)){
            Characters human = this.pos.getHumanInLoc(pos);
       }
    }
}

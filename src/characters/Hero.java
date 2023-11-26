package characters;

import items.*;
import locations.*;

public class Hero extends Characters{
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
    public void theirIskey(){
        backpack.isKey();
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
}

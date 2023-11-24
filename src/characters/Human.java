package characters;

import items.*;
import locations.*;

public class Human extends PNJ{
    private static final int MIN_HP = 5;
    private static final int MAX_HP = 25;
    private static final int MIN_DAMAGE = 5;
    private static final int MAX_DAMAGE = 25;
    private int HP;
    private final String name;
    private final int damage;
    private Locations pos;
    private Weapon weapon;
    private Armor shield;
    private Inventory backpack;

    public Human(String n, Locations loc){
        this.name = n;
        this.HP = (MIN_HP + (int)(Math.random() * ((MAX_HP - MIN_HP )+1)));
        this.damage = ( MIN_DAMAGE + (int)(Math.random() * ((MAX_DAMAGE - MIN_DAMAGE )+1)));
        this.pos = loc;
    }

    public Human(String n, Locations loc, Weapon w){
        this.name = n;
        this.HP = (MIN_HP + (int)(Math.random() * ((MAX_HP - MIN_HP )+1)));
        this.damage = ( MIN_DAMAGE + (int)(Math.random() * ((MAX_DAMAGE - MIN_DAMAGE )+1)));
        this.pos = loc;
        this.weapon = w;
    }

    public void attack(Items item, Characters ennemi){
        if(ennemi.getHP() > 0){
            int Newdamage = ((this.weapon.getDamage() + this.damage) - ennemi.getShield().getDamageReduction());
            System.out.println(ennemi.getClass().getSimpleName() + "hit you and cause" + Newdamage + "damage to you.");
            ennemi.setHP(ennemi.getHP() - Newdamage);
            if(ennemi.getHP() <=0){
                System.out.println(ennemi.getClass().getSimpleName() + " beat you!\n");
            }
        }

    }
}


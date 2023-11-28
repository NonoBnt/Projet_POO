package characters;

import items.*;
import locations.*;

public class Boss extends Characters{
    private static final int MIN_HP = 50;
    private static final int MAX_HP = 200;
    private static final int MIN_DAMAGE = 20;
    private static final int MAX_DAMAGE = 60;
    private int HP;
    private final String name = "Boss";
    private int damage;
    private Locations pos;
    private Weapon weapon;
    private Armor shield;


    public Boss(Locations loc){
        this.HP = (MIN_HP + (int)(Math.random() * ((MAX_HP - MIN_HP )+1)));
        this.damage = ( MIN_DAMAGE + (int)(Math.random() * ((MAX_DAMAGE - MIN_DAMAGE )+1)));
        this.pos = loc;
    }

    public void attack(Characters ennemi){
        int Newdamage = ((this.weapon.getDamage() + this.damage) - ennemi.getShield().getDamageReduction());
        System.out.println(ennemi.getClass().getSimpleName() + "hit you and cause" + Newdamage + "damage to you.");
        ennemi.setHP(ennemi.getHP() - Newdamage);
        if(ennemi.getHP() <=0){
            System.out.println(ennemi.getClass().getSimpleName() + " beat you!\n");
        }

    }
    public void Heroattack(Characters ennemi){
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

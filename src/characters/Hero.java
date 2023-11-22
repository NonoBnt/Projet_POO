package characters;

import items.*;
import locations.*;

public class Hero extends Characters{
    private final int HP = 100;
    private final String name = "Hero";
    private final int damage = 10;
    private Locations pos;
    private Weapon weapon;
    private Armor shield;
    private Inventory backpack;
    public Hero(){
        this.weapon = null;
        this.shield = null;
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

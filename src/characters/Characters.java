package characters;

import items.*;
import locations.*;

public abstract class Characters {
    private int HP;
    private String name;
    private int damage;
    private Locations pos;
    private Weapon weapon;
    private Armor shield;
    

    public abstract int getHP();

    public abstract void setHP(int i);

    public abstract void printChar();

    public Armor getShield() {
        return this.shield;
    }
    public void setShieldNull(){
        this.shield = null; 
    }

    public int getDamage() {
        return this.damage;
    }

    /*public int getFullDamage(){
        return this.damage + this.weapon.getDamage();
    }*/
    
    public String getName(){
        return this.name;
    }
}

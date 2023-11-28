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
    

    public int getHP() {
        return this.HP;
    }

    public void setHP(int i){
        this.HP = i;
    }

    public Armor getShield() {
        return this.shield;
    }
    public void setShieldNull(){
        this.shield = null; 
    }

    public int getDamage() {
        return this.damage;
    }
    
    public String getName(){
        return this.name;
    }
}

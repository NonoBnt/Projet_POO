package characters;

import items.*;
import locations.Locations;

public abstract class Characters {
    private int HP;
    private String name;
    private int damage;
    private Locations pos;
    private Weapon weapon;
    private Shield shield;
    private Inventory backpack;

    public void attack(Items item, Characters ennemi){
        ennemi.HP = ennemi.HP - ((this.weapon.damage + this.damage) - ennemi.shield.damage);
    }

    public void special(){                                              // a faire
        //a faire
    }

}

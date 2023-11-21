package characters;

import locations.Locations;

public class Hero extends Characters{
    private int HP = 100;
    private String name = "Hero";
    private int damage = 10;
    private Locations pos;
    private Weapon weapon;
    private Shield shield;
    private Inventory backpack;
    public Hero(){
        this.weapon = null;
        this.shield = null;
    }
}

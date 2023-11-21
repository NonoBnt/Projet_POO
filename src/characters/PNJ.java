package characters;

import locations.Locations;

public abstract class PNJ extends Characters{
    private int HP;
    private String name;
    private int damage;
    private Locations pos;
    private Weapon weapon;
    private Shield shield;
    private Inventory backpack;

    public void talk(){
        //a faire
    }
}

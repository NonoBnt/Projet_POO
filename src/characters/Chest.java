package characters;

import items.*;
import locations.*;

public class Chest extends PNJ{
    private final int HP = 2000;
    private final String name = "Chest";
    private final int damage = 0;
    private Locations pos;
    private final Weapon weapon = null;
    private final Armor shield = null;
    private Inventory backpack;

    public Chest (Locations loc,  Inventory items){
        this.pos = loc;
        this.backpack = items;
    }

    public void exchange(){
        // a faire
    }
}

package characters;

import items.*;
import locations.*;

public class Chest extends PNJ{
    private int HP = 2000;
    private String name = "Chest";
    private int damage = 0;
    private Locations pos;
    private Weapon weapon = null;
    private final Armor shield = null;
    private Inventory backpack;

    public Chest (){

    }

    public void exchange(){
        // a faire
    }
}

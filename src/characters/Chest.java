package characters;

import Actions.Talk;
import items.*;
import locations.*;

public class Chest extends PNJ implements Talk{
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

	@Override
	public void talk(String pnj) {
		System.out.println("Cling Cling(Traduction : this item is yours only if you want!)");
	}
}

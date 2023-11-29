package characters;

import items.*;
import locations.*;

public class Chest extends PNJ {
    private final int HP = 2000;
    private final String name = "Chest";
    private final int damage = 0;
    private Locations pos;
    private final Weapon weapon = null;
    private final Armor shield = null;
    private Items chestitItems;

    public Chest (Locations loc,  Items items){
        this.pos = loc;
        this.chestitItems = items;
    }

    public Items getItem(){
        if (this.chestitItems == null){
            System.out.println("coffre vide");
            return this.chestitItems;
        }
        else{
            return this.chestitItems;
        }
    }

	public void interact() {
		System.out.println("Cling Cling(Traduction : this item is yours only if you want!)");
	}
}

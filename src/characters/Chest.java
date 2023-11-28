package characters;

import Actions.Talk;
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

    public void exchange(){
        // a faire
    }

	public void interact() {
		System.out.println("Cling Cling(Traduction : this item is yours only if you want!)");
	}
}

package characters;

import items.*;
import locations.*;

public class Chest extends PNJ {
    private int HP = 2000;
    private final String name = "Chest";
    private Locations pos;
    private Items chestitItems;

    public Chest (Locations loc,  Items items){
        this.pos = loc;
        this.chestitItems = items;
    }
    @Override
    public int getHP() {
        return this.HP;
    }
    @Override
    public void setHP(int i) {
        this.HP = i;
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
    @Override
    public String toString(){
        String s;
        if(this.HP <= 0){
            s = "DEAD ";
        }else{
            s = this.name + " : " + this.HP + " HP ";
        }
        return s;
    }
}

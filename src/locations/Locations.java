package locations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import characters.Boss;
import characters.Characters;
import characters.Human;
import characters.Monster;
import items.*;

public class Locations {
    private static final boolean DEFAULT_STATE = true;
    private final String Name;
    private Map<String,Exits> exits = new HashMap<>();
    private List<Characters> peoples ;
    private boolean State;

    public Locations(String name,int loc){
        this.Name = name;
        this.State = DEFAULT_STATE;
        this.peoples = new ArrayList<>(2);
    }

    public void addChar(Characters people){
        if(people instanceof Monster || people instanceof Human || people instanceof Boss){
            peoples.add(1,people);
        } else peoples.add(0, people);
    }
    public void delChar(Characters people){
        if(people instanceof Monster || people instanceof Human || people instanceof Boss){
            peoples.remove(1);
        } else peoples.remove(0);
    }
    public String getName(){
        return this.Name;
    }
    
    public void addExits(Locations loc,Exits exit){
        exits.put(loc.getName(),exit);
    }

    public Map<String,Exits> getExits(){
        return exits;
    }
    public List<Characters> getCharacters(){
        return this.peoples;
    }
    public List<Characters> getHero(){
        return this.peoples;
    }
    public boolean isHumanInLoc(Locations loc){
        boolean ret = false;
		for (int i = 0; i < peoples.size(); i++){
            if (peoples.get(i) instanceof Human){
                ret = true;
            }
        }
        return ret;
    }

    public Characters getHumanInLoc(Locations loc){
        Characters ret = null;
		for (int i = 0; i < peoples.size(); i++){
            if (peoples.get(i) instanceof Human){
                ret = peoples.get(i);
            }
        }
        return ret;
    }

    public boolean isChestInLoc(Locations loc){
        boolean ret = false;
		for (int i = 0; i < peoples.size(); i++){
            if (peoples.get(i) instanceof Chest){
                ret = true;
            }
        }
        return ret;
    }

   

    public void enter (int val){
        Inventory Inv = this.peoples.get(0).getInv();
        for (int i = 0; i < s;i++) {
            if (val == i) {
                if(exits.get(i).getkey() == 0){ 
                    (numLoc) = (i); 
                    addChar(peoples.get(0));
                }
                if(exits.get(i).getkey() == 1){
                    if(peoples.get(0).Hero.theirIskey() == false){
                        System.out.println("you need a key to open this door");                    
                    }
                    else {
                        exits.get(i).usekey();
                        Inventory.delItems()
                    }
                }
            }
        }
    }
}

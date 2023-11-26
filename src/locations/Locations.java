package locations;

import java.util.ArrayList;
import java.util.List;

import characters.Boss;
import characters.Characters;
import characters.Human;
import characters.Monster;
import items.*;

public class Locations {
    private static final boolean DEFAULT_STATE = true;
    private static final boolean Inventory = false;
    private final String Name;
    private  int numLoc;
    private List<Exits> exits;
    private List<Characters> peoples ;
    private boolean State;

    public Locations(String name,int loc){
        this.Name = name;
        this.numLoc = loc;
        this.State = DEFAULT_STATE;
        this.peoples = new ArrayList<>(2);
        this.exits = new ArrayList<>();
    }
    public void addChar(Characters people){
        if(people instanceof Monster || people instanceof Human || people instanceof Boss){
            peoples.add(1,people);
        } else peoples.add(0, people);
    }
    public void addExits(Exits sortie){
        exits.add(sortie);
    }

    public List<Exits> getExits(){
        return this.exits;
    }
    public List<Characters> getCharacters(){
        return this.peoples;
    }
    public List<Characters> getHero(){
        return this.peoples;
    }
   
    public void enter (int val){
        int s = exits.size();
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

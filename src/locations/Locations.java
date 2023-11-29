package locations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import characters.Boss;
import characters.Characters;
import characters.Chest;
import characters.Human;
import characters.Monster;


public class Locations {
    private static final boolean DEFAULT_STATE = true;
    private final String Name;
    private final String Description;
    private Map<String,Exits> exits = new HashMap<>();
    private List<Characters> peoples ;
    private boolean state;

    public Locations(String name){
        this.Name = name;
        this.Description ="You’re in "+name+", what do you want to do?";
        this.state = DEFAULT_STATE;
        this.peoples = new ArrayList<>(2);
    }

    public Locations(String name, boolean state){
        this.Name = name;
        this.Description ="You’re in "+name+", what do you want to do?";
        this.state = state;
        this.peoples = new ArrayList<>(2);
    }

    // Les fonctions add/del 
    //----------------------------------------------------------------------------------
    public void addChar(Characters people){
        if(people instanceof Monster || people instanceof Human || people instanceof Boss){
            this.peoples.add(people);
        } else this.peoples.add(0, people);
    }
    public void delChar(Characters people){
        if(this.exits.size() > 0){
            if(people instanceof Monster || people instanceof Human || people instanceof Boss){
                this.peoples.remove(1);
            } else this.peoples.remove(0);
        }
    }
    public void addExits(Locations loc,Exits exit){
        exits.put(loc.getName(),exit);
    }

    //Les fonctions getter
    //----------------------------------------------------------------------------------
    public String getName(){
        return this.Name;
    }
    public String getDes(){
        return this.Description;
    }
    public boolean getState(){
        return this.state;
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
    public Human getHumanInLoc(Locations loc){
        Human ret = null;
		for (int i = 0; i < this.peoples.size(); i++){
            if (peoples.get(i) instanceof Human){
                ret = (Human) peoples.get(i);
            }
        }
        return ret;
    }
    public Chest getChestInLoc(Locations loc){
        Chest ret = null;
		for (int i = 0; i < this.peoples.size(); i++){
            if (peoples.get(i) instanceof Chest){
                ret = (Chest) peoples.get(i);
            }
        }
        return ret;
    }
    public Characters getTargetInRoom(String name){
        Characters ret = null;
        for(int i = 0; i < this.peoples.size();i++){
            if (this.peoples.get(i).getName() == name){
                ret = this.peoples.get(i);
            }
        }
        return ret;
    }


    // Les autres fonctions
    //----------------------------------------------------------------------------------
    public boolean isHumanInLoc(){
        boolean ret = false;
		for (int i = 0; i < this.peoples.size(); i++){
            if (peoples.get(i) instanceof Human ){
                ret = true;
            }
        }
        return ret;
    }
    public boolean isChestInLoc(){
        boolean ret = false;
		for (int i = 0; i < this.peoples.size(); i++){
            if (peoples.get(i) instanceof Chest ){
                ret = true;
            }
        }
        return ret;
    }
    public void setState(){
        this.state = false;
    }

    public Boolean isClear(Locations loc){
        if(loc.state == true){
            return false;
        } else {return true;}
    }
    
}

package locations;

import java.util.ArrayList;
import java.util.List;

import characters.Boss;
import characters.Characters;
import characters.Human;
import characters.Monster;

public class Locations {
    private static final boolean DEFAULT_STATE = true;
    private final String Name;
    private List<Exits> exits;
    private List<Characters> peoples ;
    private boolean State;

    public Locations(String name){
        this.Name = name;
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
    public void enter (int val){

        size.listExit
                for i<size
                if val = i
                then setcharpos(exit.nextloc)

    }
}

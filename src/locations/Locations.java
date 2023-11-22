package locations;

import java.util.List;
import java.util.ArrayList
import characters.Characters;
public abstract class Locations {
    private static final boolean DEFAULT_STATE = true;
    private String Name;
    private List<Exits> exits;
    private List<Characters> people ;
    private boolean State;

    public void addChar(people P){
        this.people.add(P)
    }
    public void addExits(exits E){
        this.exits.add(E)
    }

    public List<Exits> getExits(){
        return this.exits;
    }
    public List<Characters> getCharacters(){
        return this.people;
    }
}
    public void  enter (int val){

        size.listExit
                for i<size
                if val = i
                then setcharpos(exit.nextloc)

    }
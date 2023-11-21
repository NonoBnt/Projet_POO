package locations;

import java.util.List;
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

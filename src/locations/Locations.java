package locations;

import java.util.List;
import characters.Characters;
public abstract class Locations {
    private static final boolean DEFAULT_STATE = true;
    private String Name;
    private List<Exits> exits;
    private List<Characters> people ;
    private boolean State;

    public void addChar(){
        //a faire
    }
    public void addExits(){
        //a faire
    }

    public List<Exits> getExits(){
        return this.exits;
    }
    public List<Characters> getCharacters(){
        return this.people;
    }
    public void  enter (int val){

        size.listExit
                for i<size
                if val = i
                then setcharpos(exit.nextloc)

    }
}

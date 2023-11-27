package locations;

public class Exits {
    private String name;
    private Locations nextLoc;
    private boolean key;

    public Exits(String name,boolean key,int loc) {
        this.name = name;
        this.key = key;
        this.nextLoc = loc;
    }
    public Locations getNextloc(){
        return this.nextLoc;
    }
    public boolean getkey(){
        return this.key;
    }
    public void useKey(){
        if(key == true){
            this.key = false; 
        }
    }
}

package locations;

public class Exits {
    private String name;
    private int nextLoc;
    private boolean key;

    public Exits(String name,boolean key,int loc) {
        this.name = name;
        this.key = key;
        this.nextLoc = loc;
    }
    public int getkey(){
        return this.key;
    }
    public void useKey(){
        if(key == true){
            this.key = false; 
        }
    }
}

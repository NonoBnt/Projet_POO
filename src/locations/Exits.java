package locations;

public class Exits {
    private String name;
    private int nextLoc;
    private int key;

    public Exits(String name,int key,int loc) {
        this.name = name;
        this.key = key;
        this.nextLoc = loc;
    }
    public void useKey(){
        if(this.key >= 0 ){

        }
    }
}

package items;

public class Key extends Consumable{
    private final static String NAME = "Key";
    private final static int WEIGHT = 10;
    private int durability;
    private final int identifier;

    public Key(int id){
        this.identifier = id;
    }
    public boolean isUsed(){
        return durability == 0;
    }
    @Override
    public void use(){
        durability = 0;
    }

    @Override
    public int getWeight() {
        return this.WEIGHT;
    }

    @Override
    public String getName() {
        return this.NAME;
    }
}
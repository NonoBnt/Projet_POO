package items;

public class Apple extends Consumable{
    private final static String NAME = "Apple";
    private final static int WEIGHT = 5;
    private int durability;
    private static final int HEAL = 10;

    public Apple(){
        this.durability = 1;
    }
    public boolean isUsed(){
        return durability == 0;
    }
    @Override
    public void use(){
        this.durability = 0;
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
package items;

public class HealPotion extends Consumable{
    private final static String NAME = "Heal Potion";
    private final static int WEIGHT = 10;
    private int durability;
    private static final int HEAL = 30;

    public HealPotion(){
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
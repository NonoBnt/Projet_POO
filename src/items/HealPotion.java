package items;

public class HealPotion extends Consumable{
    private final static String NAME = "Heal Potion";
    private final static int WEIGHT = 10;
    private int weight;
    private String name;
    private int durability;
    private static final int HEAL = 30;
    private int heal;

    public HealPotion(){
        this.durability = 1;
        this.weight = WEIGHT;
        this.name = NAME;
        this.heal = HEAL;
    }
    public boolean isUsed(){
        return durability == 0;
    }
    public int getHeal(){
        return this.heal;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
package items;

public class Armor extends Items {
    private final String name;
    private final int weight;
    private int durability;
    private final int damageReduction;

    public Armor(String n, int w, int d, int dam){
        this.name = n;
        this.weight = w;
        this.durability = d;
        this.damageReduction = dam;
    }

    public boolean isBroke(){
        return this.durability <= 0;
    }
    
    public void loseDurability() {
        this.durability -= 1;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }
    @Override
    public String getName() {
        return this.name;
    }

    public int getDamageReduction(){
        return this.damageReduction;
    }
}

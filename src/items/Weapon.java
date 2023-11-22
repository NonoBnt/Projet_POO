package items;

public class Weapon extends Items {
    private final String name;
    private final int weight;
    private int durability;
    private final int damage;

    public Weapon(String n, int w, int d, int dam){
        this.name = n;
        this.weight = w;
        this.durability = d;
        this.damage = dam;
    }

    public boolean isBroke(){
        return this.durability <= 0;
    }

    @Override
    public void use() {
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

    public int getDamage(){
        return this.damage;
    }
}
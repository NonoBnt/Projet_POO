package items;

abstract public class Consumable extends Items {
    private String name;
    private int weight;
    private int durability;

    public abstract void use();
}
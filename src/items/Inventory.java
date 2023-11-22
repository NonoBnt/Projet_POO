package items;
import java.util.ArrayList;
public class Inventory {
    private ArrayList<Items> items = new ArrayList<>();
    private int length;
    private static final int MAX_WEIGHT = 100;
    private static final int MAX_LENGTH = 15;
    public Inventory(){
        this.length = 0;
    }
    public boolean isFull(){
        return length >= MAX_LENGTH;
    }
    public int getSpaceLeft(){
        return MAX_LENGTH - length;
    }
    public int getTotalWeight(){
        int res = 0;
        for(int i = 0; i < length ; i++){
            res += this.items.get(i).getWeight();
        }
        return res;
    }
    public boolean isTooMuchWeight(){
        return getTotalWeight() >= MAX_WEIGHT;
    }
    public boolean isTooMuchWeight(Items i){
        return (getTotalWeight() + i.getWeight()) >= MAX_WEIGHT;
    }
    public void clearInv(){
        this.items = new ArrayList<>();
    }
    //possible problème si plusieurs fois le même item dans l'inventaire
    public void delItems(Items i){
        if (!this.items.remove(i)){
            System.out.println("There is not an item like this in your backpack");
        }else{
            this.items.remove(i);
            length -= 1;
        }

    }
    // Idée : faire le test dans avant d'appeler la fonction pour ne pas faire disparaitre l'item a récuperer
    public void addItems(Items i){
        if (isFull()){
            System.out.println("There is no more space in your backpack");
        }
        else if(isTooMuchWeight(i)){
            System.out.println("you're not strong enough to lift your backpack");
        }
        else{
            this.items.add(i);
            length += 1;
        }
    }
    public ArrayList<Items> getInv(){
        return this.items;
    }
    // a voir : l'unité de messure de la masse (pas grandement important)
    public void printInv() {
        System.out.println("Backpack :");
        for(int i = 0 ; i < length ; i++){
            System.out.println(this.items.get(i).getName());
        }
        System.out.println("There is still " + getSpaceLeft() + " places in your backpack.");
        System.out.println("You can carry " + getTotalWeight() + "more pounds");
    }
}

package characters;

import Actions.Talk;
import items.*;
import locations.*;


public class Human extends PNJ{
    private static final int MIN_HP = 5;
    private static final int MAX_HP = 25;
    private static final int MIN_DAMAGE = 5;
    private static final int MAX_DAMAGE = 25;
    private int HP;
    private final String name;
    private final int damage;
    private Locations pos;
    private Weapon weapon;
    private Boolean hasSpoke;
    private Inventory backpack;
    

    public Human(String n, Locations loc){
        this.name = n;
        this.HP = (MIN_HP + (int)(Math.random() * ((MAX_HP - MIN_HP )+1)));
        this.damage = ( MIN_DAMAGE + (int)(Math.random() * ((MAX_DAMAGE - MIN_DAMAGE )+1)));
        this.pos = loc;
        this.hasSpoke = false;
    }

    public Human(String n, Locations loc, Weapon w){
        this.name = n;
        this.HP = (MIN_HP + (int)(Math.random() * ((MAX_HP - MIN_HP )+1)));
        this.damage = ( MIN_DAMAGE + (int)(Math.random() * ((MAX_DAMAGE - MIN_DAMAGE )+1)));
        this.pos = loc;
        this.weapon = w;
        this.hasSpoke = false;
    }
    
    @Override
    public int getHP() {
        return this.HP;
    }
    @Override
    public void setHP(int i) {
        this.HP = i;
    }

    public void attack(Characters ennemi){
        if(this.weapon == null){
            if(ennemi.getShield() == null){
                int Newdamage = (this.damage);
                System.out.println("hit you and cause" + Newdamage + "damage to you.");
                ennemi.setHP(ennemi.getHP() - Newdamage);
            }
            else {
                int Newdamage = (this.damage - ennemi.getShield().getDamageReduction());
                System.out.println("hit you and cause" + Newdamage + "damage to you.");
                ennemi.getShield().loseDurability();
                if(ennemi.getShield().isBroke()){
                    ennemi.setShieldNull();
                    System.out.println("Be careful he broke your shield.");
                }
                ennemi.setHP(ennemi.getHP() - Newdamage);
            }
        }
        else {
            if(ennemi.getShield() == null){
                int Newdamage = (this.weapon.getDamage() + this.damage);
                System.out.println("hit you and cause" + Newdamage + "damage to you.");
                weapon.loseDurability();
                if(this.weapon.isBroke()){
                    this.weapon = null;
                    System.out.println("Yeah he broke his weapon!.");
                }
                ennemi.setHP(ennemi.getHP() - Newdamage);
            }
            else {
                int Newdamage = ((this.weapon.getDamage() + this.damage) - ennemi.getShield().getDamageReduction());
                System.out.println("hit you and cause" + Newdamage + "damage to you.");
                weapon.loseDurability();
                if(this.weapon.isBroke()){
                    this.weapon = null;
                    System.out.println("Yeah he broke his weapon!.");
                }
                if(ennemi.getShield().isBroke()){
                    ennemi.setShieldNull();
                    System.out.println("Be careful he broke your shield.");
                }
                ennemi.setHP(ennemi.getHP() - Newdamage);   
            }
        }
        if(ennemi.getHP() <=0){
            System.out.println(ennemi.getClass().getSimpleName() + " beat you!\n");
        }
    }

    
    public Inventory getInv(){
        return this.backpack;
    }

	
	public void interact() {
        if (this.hasSpoke == false){
            int rand = (int)Math.random()%10;
            switch (rand) {
                case 0:
                    System.out.println("Take my information: https://en.wikipedia.org/wiki/Text-based_game !");
                    this.hasSpoke = true;
                    break;
                case 1:
                    System.out.println("The cake is a lie !");
                    this.hasSpoke = true;
                    break;
                case 2:
                    System.out.println("Hey !");
                    this.hasSpoke = true;
                    break;
                case 3:
                    System.out.println("I got this key for you ! Do you want it ?");
                    this.backpack.addItems(new Exitkey());
                    this.hasSpoke = true;
                    break;
                case 4:
                    System.out.println("I got this apple for you ! Do you want it ?");
                    this.backpack.addItems(new Apple());
                    this.hasSpoke = true;
                    break;
                case 5:
                    System.out.println("I got this life potion for you ! Do you want it ?");
                    this.backpack.addItems(new HealPotion());
                    this.hasSpoke = true;
                    break;
                case 6:
                    System.out.println("Wow you're so strong !");
                    this.hasSpoke = true;
                    break;
                case 7:
                    System.out.println("I'm useless.");
                    this.hasSpoke = true;
                    break;
                case 8:
                    System.out.println("We are just here");
                    this.hasSpoke = true;
                    break;
                case 9:
                    System.out.println("Be careful this dungeon is full of monsters !");
                    this.hasSpoke = true;
                    break;
            }
        }else{
                System.out.println("Don't speak to me again, I have nothing to tell you more !");
        }
	}
    @Override
    public void printChar(){
        int realDamage = (this.damage + this.weapon.getDamage());
        System.out.println(this.name + " : " + this.HP + " HP " + realDamage + " damage.");
    }
    @Override
    public String toString(){
        int realDamage = (this.damage + this.weapon.getDamage());
        String s = this.name + " : " + this.HP + " HP " + realDamage + " damage.";
        return s;
    }
}


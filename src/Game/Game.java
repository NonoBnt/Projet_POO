package Game;

import java.util.ArrayList;

import locations.*;
import characters.*;
import items.*;
import java.util.Scanner;


public class Game{
    private ArrayList<Locations> loc;
    private Hero hero;
    private boolean stop;


    public Game(){
        this.loc = new ArrayList<>();
        this.hero = new Hero(this.loc.get(0));
        this.stop = false;
    }
    public void createMap(){
        //a faire
    }
    public void look(){

    }
    public void take(Items i){
        Inventory Inv = this.hero.getInv();
        Inv.addItems(i);
    }
    public void quit(){
        this.stop = true;
    }
    public void use(Items i){

    }

    
    public void launch(){
        createMap();
        String[] arg;
        Scanner scanner = new Scanner(System.in);
        while(this.stop != true){
            System.out.print("Please enter your command :");
            String cmd = scanner.nextLine();
            arg = cmd.split("\\s+");
            switch (arg[0]) {
                case "GO":
                    
                    break;
                case "HELP":
                    System.out.println("Dans cette salle vous pouvez :");
                    if 
                    break;
                case "LOOK":
                    
                    break;
                case "TAKE":
                    
                    break;
                case "USE":
                    //interface
                    break;
                case "ATTACK":
                    //interface

                    break;
                case "TALK":
                    //interface
                    break;        
                case "QUIT":
                    System.out.println("Arret du jeu");
                    quit();
                    break;
                    
                default:
                    System.out.println("Commande inconnue");
                    break;
            }
            if (this.charac.get(0).getHP() <= 0){
                System.out.println("Game Over");
                quit();
            }
            if (this.loc)
        }
        scanner.close();
    }

}
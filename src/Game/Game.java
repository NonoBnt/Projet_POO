package Game;

import java.util.ArrayList;

import locations.*;
import characters.*;
import items.*;
import java.util.Scanner;


public class Game{
    private ArrayList<Locations> loc;
    private ArrayList<Characters> charac;
    private boolean stop;


    public Game(){
        this.loc = new ArrayList<>();
        this.charac = new ArrayList<>();
        this.stop = false;
    }
    public void createMap(){
        //a faire
    }
    public void createCharac(){

    }
    public void help(){
        // a faire
    }
    public void look(){

    }
    public void look(Locations loc){
        
    }
    public void take(Items i){
        Inventory Inv = this.charac.get(0).getInv();
        Inv.addItems(i);
    }
    public void quit(){
        this.stop = true;
    }
    public void use(Items i){

    }

    public void createGame(){
        createCharac();
        createMap();
    }
    public void launch(){
        createGame();
        while(this.stop != true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter your command :");
            String cmd = scanner.nextLine();
            switch (cmd) {
                case "GO":
                    
                    break;
                case "HELP":
                    System.out.println("Dans cette salle vous pouvez :");
                    break;
                case "LOOK":
                    
                    break;
                case "TAKE":
                    
                    break;
                case "USE":
                    
                    break;
                case "QUIT":
                    System.out.println("Arret du jeu");
                    quit();
                    break;
                    
                default:
                    System.out.println("Commande inconnue");
                    break;
            }
        }
    }

}
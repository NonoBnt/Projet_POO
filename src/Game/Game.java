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
                    // appel enter en vérifiant que arg 1 est bien présent
                    break;
                case "HELP":
                    System.out.println("In this room you can use command :");
                    if(isExitInLoc()){//fonction a faire
                        System.out.println("- GO arg1 (arg1 is the number of the next room you want and can go)");    
                    }
                    System.out.println("- LOOK [argument] (argument is optionnal and with it you can have information on anything in the current room. If you don't give argument you will get all the possible argument with their utility)");
                    // a finir
                    break;
                case "LOOK":
                    
                    break;
                case "TAKE":
                    
                    break;
                case "USE":
                    //interface
                    break;
                case "ATTACK":
                    //appel attack via hero ou interface je sais pas

                    break;
                case "TALK":
                    //appel talk via hero ou interface je sais pas
                    break;        
                case "QUIT":
                    System.out.println("Arret du jeu");
                    quit();
                    break;
                    
                default:
                    System.out.println("Commande inconnue");
                    break;
            }
            if (this.hero.getHP() <= 0){
                System.out.println("Game Over");
                quit();
            }
            if (isClear(this.loc.get(this.loc.size()))){ // fonction a faire
                System.out.println("You Win !");
                quit();
            }
        }
        scanner.close();
    }

}
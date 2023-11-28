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
        Locations S1 = new Locations("Normal 1");
        this.loc.add(S1);

        Locations S2 = new Locations("Monster 1");
        Monster M1 = new Monster(S2);
        S2.addChar(M1);
        this.loc.add(S2);

        Locations S3 = new Locations("Monster 2");
        Monster M2 = new Monster(S3);
        S3.addChar(M2);
        this.loc.add(S3);

        Locations S4 = new Locations("Monster 3");
        Monster M3 = new Monster(S4);
        S4.addChar(M3);
        this.loc.add(S4);

        Locations S5 = new Locations("Monster 4");
        Monster M4 = new Monster(S5);
        S5.addChar(M4);
        this.loc.add(S5);

        Locations S6 = new Locations("Monster 5");
        Monster M5 = new Monster(S6);
        S6.addChar(M5);
        this.loc.add(S6);

        Locations S7 = new Locations("Normal 2");
        this.loc.add(S7);

        Locations S8 = new Locations("Monster 6");
        Monster M6 = new Monster(S8);
        S8.addChar(M6);
        this.loc.add(S8);

        Locations S9 = new Locations("Normal 3");
        this.loc.add(S9);

        Locations S10 = new Locations("Chest 1");
        Armor A1 = new Armor("Legendary Armor", 0, 25, 3);
        Chest C1 = new Chest(S10, A1);
        S10.addChar(C1);
        this.loc.add(S10);
        
        Locations S11 = new Locations("Normal 4");
        this.loc.add(S11);

        Locations S12 = new Locations("Monster 7");
        Monster M7 = new Monster(S12);
        S12.addChar(M7);
        this.loc.add(S12);

        Locations S13 = new Locations("Normal 5");
        this.loc.add(S13);

        Locations S14 = new Locations("Monster 8");
        Monster M8 = new Monster(S14);
        S14.addChar(M8);
        this.loc.add(S14);

        Locations S15 = new Locations("Normal 6");
        this.loc.add(S15);

        Locations S16 = new Locations("Normal 7");
        this.loc.add(S16);

        Locations S17 = new Locations("Monster 9");
        Monster M9 = new Monster(S17);
        S17.addChar(M9);
        this.loc.add(S17);

        Locations S18 = new Locations("Monster 10");
        Monster M10 = new Monster(S18);
        S18.addChar(M10);
        this.loc.add(S18);

        Locations S19 = new Locations("Boss 1");
        Locations S20 = new Locations("Normal 8");
        this.loc.add(S20);

        Locations S21 = new Locations("Normal 9");
        this.loc.add(S21);

        Locations S22 = new Locations("Chest 2");
        Locations S23 = new Locations("Boss 2");
        this.loc.add(S23);
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
                    if()
                    break;
                case "LOOK":
                    
                    break;
                case "TAKE":
                    
                    break;
                case "USE":
                    if ((arg.length) == 2){
                    this.hero.use(arg[1]);
                    }else{
                        System.out.println("missing argument item to USE");
                    }
                    break;
                case "ATTACK":
                    if ((arg.length) == 2){
                    this.hero.attack(arg[1]);
                    }else{
                        System.out.println("missing argument target to ATTACK");
                    }

                    break;
                case "TALK":
                    if ((arg.length) == 2){
                    this.hero.talk(arg[1]);
                    }else{
                        System.out.println("missing argument people to TALK");
                    }
                    break;
                case "DELETE":
                    if ((arg.length) == 2){
                    this.hero.getInv().delFirstInstanceOfItem(arg[1]);
                    }else{
                        System.out.println("missing argument item to DELETE");
                    }
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
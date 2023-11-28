package Game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import locations.*;
import characters.*;
import items.*;
import java.util.Scanner;


public class Game{
    private ArrayList<Locations> loc;
    private Hero hero;
    private boolean stop;
    private Exits  exit = addExits(new Locations("a"),new Exits("go_to_2", false, new Locations("b")));


    public Game(){
        this.loc = new ArrayList<>();
        this.hero = new Hero(this.loc.get(0));
        this.stop = false;
    }

    public void createMap(){
        Locations S1 = new Locations("Normal 1");
        this.loc.add(0,S1);


        Locations S2 = new Locations("Monster 1");
        Monster M1 = new Monster(S2);
        S2.addChar(M1);
        this.loc.add(1,S2);

        Locations S3 = new Locations("Monster 2");
        Monster M2 = new Monster(S3);
        S3.addChar(M2);
        this.loc.add(2,S3);

        Locations S4 = new Locations("Monster 3");
        Monster M3 = new Monster(S4);
        S4.addChar(M3);
        this.loc.add(3,S4);

        Locations S5 = new Locations("Monster 4");
        Monster M4 = new Monster(S5);
        S5.addChar(M4);
        this.loc.add(4,S5);

        Locations S6 = new Locations("Monster 5");
        Monster M5 = new Monster(S6);
        S6.addChar(M5);
        this.loc.add(5,S6);

        Locations S7 = new Locations("Normal 2");
        this.loc.add(6,S7);

        Locations S8 = new Locations("Monster 6");
        Monster M6 = new Monster(S8);
        S8.addChar(M6);
        this.loc.add(7,S8);

        Locations S9 = new Locations("Normal 3");
        this.loc.add(8,S9);

        Locations S10 = new Locations("Chest 1");
        Armor A1 = new Armor("Legendary Armor", 0, 25, 3);
        Chest C1 = new Chest(S10, A1);
        S10.addChar(C1);
        this.loc.add(9,S10);
        
        Locations S11 = new Locations("Normal 4");
        this.loc.add(10,S11);

        Locations S12 = new Locations("Monster 7");
        Monster M7 = new Monster(S12);
        S12.addChar(M7);
        this.loc.add(11,S12);

        Locations S13 = new Locations("Normal 5");
        this.loc.add(12,S13);

        Locations S14 = new Locations("Monster 8");
        Monster M8 = new Monster(S14);
        S14.addChar(M8);
        this.loc.add(13,S14);

        Locations S15 = new Locations("Normal 6");
        this.loc.add(14,S15);

        Locations S16 = new Locations("Normal 7");
        this.loc.add(15,S16);

        Locations S17 = new Locations("Monster 9");
        Monster M9 = new Monster(S17);
        S17.addChar(M9);
        this.loc.add(16,S17);

        Locations S18 = new Locations("Monster 10");
        Monster M10 = new Monster(S18);
        S18.addChar(M10);
        this.loc.add(17,S18);

        Locations S19 = new Locations("Boss 1");
        Boss B1 = new Boss(S19);
        S19.addChar(B1);;
        this.loc.add(18,S19);
        
        Locations S20 = new Locations("Normal 8");
        this.loc.add(19,S20);

        Locations S21 = new Locations("Normal 9");
        this.loc.add(20,S21);

        Locations S22 = new Locations("Chest 2");
        Weapon W1 = new Weapon("Legendary sword", 0, 50, 10);
        Chest C2 = new Chest(S22, W1);
        S22.addChar(C2);
        this.loc.add(21,S22);

        Locations S23 = new Locations("Boss 2");
        Boss B2 = new Boss(S23);
        S23.addChar(B2);;
        this.loc.add(22,S23);
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
        Locations locate = this.hero.getHeroLoc();
        while(this.stop != true){
            System.out.print("Please enter your command :");
            String cmd = scanner.nextLine();
            arg = cmd.split("\\s+");
            switch (arg[0]) {
                case "GO":
                    // appel enter en vérifiant que arg 1 est bien présent
                    if((arg.length) == 2){
                    }
                    break;
                case "HELP":
                    System.out.println("In this room you can use command :");
                    if(this.hero.getHeroLoc().getExits() != null){
                        System.out.println("- GO arg1 (arg1 is the number of the next room you want and can go)");    
                    }
                    System.out.println("- LOOK [argument] (argument is optionnal and with it you can have information on anything in the current room. If you don't give argument you will get all the possible argument with their utility)");
                    if(this.hero.getHeroLoc().isChestInLoc() == true || this.hero.getHeroLoc().isChestInLoc() == true && this.hero.getHeroLoc().getChestInLoc()){
                        System.out.println("- TALK");
                    }
                    break;
                case "LOOK":
                    if((arg.length) == 2){
                        if(arg[1] == "INVENTORY"){
                            this.hero.getInv().printInv();
                        }    
                    }else{
                        System.err.println("Room information :");
                        for(int i = 0 ; i < this.hero.getHeroLoc().getExits().size() ; i++){
                            System.out.println(" -Exits" + i + " : " + this.hero.getHeroLoc().getExits().get(i));
                        }
                        System.out.println("");
                        for(int i = 1 ; i < this.hero.getHeroLoc().getCharacters().size() ; i++){
                            System.err.println(" -Character : " + this.hero.getHeroLoc().getCharacters().get(i));
                        }
                        System.out.println("You can use the argument INVENTORY to check your backpack !");
                    }
                case "TAKE":
                    if(this.hero.getHeroLoc().isChestInLoc() == true || this.hero.getHeroLoc().isChestInLoc() == true){
                        
                    }
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
                        System.out.println("Il ne se passe rien");
                    }

                    break;
                case "TALK":
                    this.hero.talk();
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
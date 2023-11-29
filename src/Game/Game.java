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


    public Game(){
        this.loc = new ArrayList<>(23);
        this.createMap();
        this.hero = new Hero(this.loc.get(0));
        this.stop = false;
    }
    public Hero getHero(){
        return this.hero;
    }

    public void createMap(){
        Locations S1 = new Locations("Room_1",false);
        this.loc.add(0,S1);
        
        Locations S2 = new Locations("Room_2",true);
        Monster M1 = new Monster(S2);
        S2.addChar(M1);
        this.loc.add(1,S2);

        Locations S3 = new Locations("Room_3",true);
        Monster M2 = new Monster(S3);
        S3.addChar(M2);
        this.loc.add(2,S3);

        Locations S4 = new Locations("Room_4",true);
        Monster M3 = new Monster(S4);
        S4.addChar(M3);
        this.loc.add(3,S4);

        Locations S5 = new Locations("Room_5",true);
        Monster M4 = new Monster(S5);

        S5.addChar(M4);
        this.loc.add(4,S5);

        Locations S6 = new Locations("Room_6",true);
        Monster M5 = new Monster(S6);
        S6.addChar(M5);
        this.loc.add(5,S6);

        Locations S7 = new Locations("Room_7",false);
        this.loc.add(6,S7);

        Locations S8 = new Locations("Room_8",true);
        Monster M6 = new Monster(S8);
        S8.addChar(M6);
        this.loc.add(7,S8);

        Locations S9 = new Locations("Room_9",false);
        this.loc.add(8,S9);

        Locations S10 = new Locations("Room_10",false);
        Armor A1 = new Armor("Legendary Armor", 0, 25, 3);
        Chest C1 = new Chest(S10, A1);
        S10.addChar(C1);
        this.loc.add(9,S10);
        
        Locations S11 = new Locations("Room_11",false);
        this.loc.add(10,S11);

        Locations S12 = new Locations("Room_12",true);
        Monster M7 = new Monster(S12);
        S12.addChar(M7);
        this.loc.add(11,S12);

        Locations S13 = new Locations("Room_13",false);
        this.loc.add(12,S13);

        Locations S14 = new Locations("Room_14",true);
        Monster M8 = new Monster(S14);
        S14.addChar(M8);
        this.loc.add(13,S14);

        Locations S15 = new Locations("Room_15",false);
        this.loc.add(14,S15);

        Locations S16 = new Locations("Room_16",false);
        this.loc.add(15,S16);

        Locations S17 = new Locations("Room_17",true);
        Monster M9 = new Monster(S17);
        S17.addChar(M9);
        this.loc.add(16,S17);

        Locations S18 = new Locations("Room_18",true);
        Monster M10 = new Monster(S18);
        S18.addChar(M10);
        this.loc.add(17,S18);
        
        Locations S19 = new Locations("Room_19",true);
        Boss B1 = new Boss(S19);
        S19.addChar(B1);;
        this.loc.add(18,S19);

        Locations S20 = new Locations("Room_20",true);
        this.loc.add(19,S20);

        Locations S21 = new Locations("Room_21",false);
        this.loc.add(20,S21);

        Locations S22 = new Locations("Room_22",false);
        Weapon W1 = new Weapon("Legendary sword", 0, 50, 10);
        Chest C2 = new Chest(S22, W1);
        S22.addChar(C2);
        this.loc.add(21,S22);

        Locations S23 = new Locations("Room_23",false);
        Boss B2 = new Boss(S22);
        S23.addChar(B2);;
        this.loc.add(22,S22);

        //partie des exits
        Exits EXT1 = new Exits("salle_2", false, S2);
        S1.addExits(S1, EXT1);

        Exits EXT2 = new Exits("salle_3", false, S3);
        S1.addExits(S1, EXT2);

        Exits EXT3 = new Exits("salle_4", false, S4);
        S2.addExits(S2, EXT3);

        Exits EXT4 = new Exits("salle_1", false, S1);
        S2.addExits(S2, EXT4);

        Exits EXT5 = new Exits("salle_1", false, S1);
        S3.addExits(S3, EXT5);
        
        Exits EXT6 = new Exits("salle_5", false, S5);
        S3.addExits(S3, EXT6);
        
        Exits EXT7 = new Exits("salle_6", false, S6);
        S3.addExits(S3, EXT7);
        
        Exits EXT8 = new Exits("salle_2", false, S2);
        S4.addExits(S4, EXT8);

        Exits EXT9 = new Exits("salle_13", false, S13);
        S4.addExits(S4, EXT9);

        Exits EXT10 = new Exits("salle_3", false, S3);
        S5.addExits(S5, EXT10);

        Exits EXT11 = new Exits("salle_16", false, S16);
        S5.addExits(S5, EXT11);

        Exits EXT12 = new Exits("salle_20", false, S20);
        S5.addExits(S5, EXT12);

        Exits EXT13 = new Exits("salle_21", false, S21);
        S5.addExits(S5, EXT13);

        Exits EXT14 = new Exits("salle_3", false, S3);
        S6.addExits(S6, EXT14);

        Exits EXT15 = new Exits("salle_7", false, S7);
        S6.addExits(S6, EXT15);

        Exits EXT16 = new Exits("salle_6", false, S6);
        S7.addExits(S7, EXT16);

        Exits EXT17 = new Exits("salle_8", false, S8);
        S7.addExits(S7, EXT17);

        Exits EXT18 = new Exits("salle_7", false, S7);
        S8.addExits(S8, EXT18);
        
        Exits EXT19 = new Exits("salle_9", false, S9);
        S8.addExits(S8, EXT19);

        Exits EXT20 = new Exits("salle_10", true, S10);
        S8.addExits(S8, EXT20);

        Exits EXT21 = new Exits("salle_11", false, S11);
        S9.addExits(S9, EXT21);

        Exits EXT22 = new Exits("salle_8", false, S8);
        S10.addExits(S10, EXT22);

        Exits EXT23 = new Exits("salle_9", false, S9);
        S11.addExits(S11, EXT23);

        Exits EXT24 = new Exits("salle_12", false, S12);
        S11.addExits(S11, EXT24);

        Exits EXT25 = new Exits("salle_1", false, S1);
        S12.addExits(S12, EXT25);

        Exits EXT26 = new Exits("salle_11", false, S11);
        S12.addExits(S12, EXT26);

        Exits EXT27 = new Exits("salle_4", false, S4);
        S13.addExits(S13, EXT27);

        Exits EXT28 = new Exits("salle_14", false, S14);
        S13.addExits(S13, EXT28);

        Exits EXT29 = new Exits("salle_13", false, S13);
        S14.addExits(S14, EXT29);

        Exits EXT30 = new Exits("salle_15", false, S15);
        S14.addExits(S14, EXT30);

        Exits EXT31 = new Exits("salle_16", false, S16);
        S14.addExits(S14, EXT31);

        Exits EXT32 = new Exits("salle_17", false, S17);
        S15.addExits(S15, EXT32);

        Exits EXT33 = new Exits("salle_14", false, S14);
        S16.addExits(S16, EXT33);

        Exits EXT34 = new Exits("salle_17", false, S17);
        S16.addExits(S16, EXT34);

        Exits EXT35 = new Exits("salle_5", false, S5);
        S16.addExits(S16, EXT35);

        Exits EXT36 = new Exits("salle_16", false, S16);
        S17.addExits(S17, EXT36);

        Exits EXT37 = new Exits("salle_18", false, S18);
        S17.addExits(S17, EXT37);

        Exits EXT38 = new Exits("salle_17", false, S17);
        S18.addExits(S18, EXT38);

        Exits EXT39 = new Exits("salle_19", false, S19);
        S18.addExits(S18, EXT39);

        Exits EXT40 = new Exits("salle_18", false, S18);
        S19.addExits(S19, EXT40);

        Exits EXT41 = new Exits("salle_5", false, S5);
        S20.addExits(S20, EXT41);

        Exits EXT42 = new Exits("salle_22", true, S22);
        S20.addExits(S20, EXT42);

        Exits EXT43 = new Exits("salle_5", false, S5);
        S21.addExits(S21, EXT43);

        Exits EXT44 = new Exits("salle_20", false, S20);
        S22.addExits(S22, EXT44);

        Exits EXT45 = new Exits("salle_23", false, S23);
        S22.addExits(S22, EXT45);

        Exits EXT46 = new Exits("salle_22", false, S22);
        S23.addExits(S23, EXT46);

        
    }

    public void take(Items i){
        Inventory Inv = this.hero.getInv();
        Inv.addItems(i);
    }
    public void quit(){
        this.stop = true;
    }

    
    public void launch(){
        createMap();
        String[] arg;
        Scanner scanner = new Scanner(System.in);
        Locations lochero = this.hero.getHeroLoc();
        while(this.stop != true){
            System.out.print("Please enter your command :");
            String cmd = scanner.nextLine();
            arg = cmd.split("\\s+");
            switch (arg[0]) {
                case "GO":
                    if((arg.length) == 2){
                        this.hero.enter(arg[1]);
                    }
                    break;
                case "HELP":
                    System.out.println("In this room you can use command :");
                    if(this.hero.getHeroLoc().getExits() != null){
                        System.out.println("- GO arg1 (arg1 is the number of the next room you want and can go)");    
                    }
                    System.out.println("- LOOK [argument] (argument is optionnal and with it you can have information on anything in the current room. If you don't give argument you will get all the possible argument with their utility with general information of the current room)");
                    if(this.hero.getHeroLoc().isChestInLoc() == true || this.hero.getHeroLoc().isHumanInLoc() == true){
                        System.out.println("- TALK (with this function you can talk with the character in the current room)");
                    }
                    if(lochero.isChestInLoc() == true && lochero.getChestInLoc(lochero).getItem() != null || lochero.isHumanInLoc() == true && lochero.getHumanInLoc(lochero).getInv() != null){
                        System.out.println("- TAKE (You can take the items own by the PNJ in front of you by using this command !)");
                    }
                    if(this.hero.getInv().getFirstInstanceItems("Apple") != null || this.hero.getInv().getFirstInstanceItems("HealPotion") != null){
                        System.out.println("- USE : this means you can use one Apple or HealPotion from your inventory");
                    }                    
                    break;
                case "LOOK":
                    if((arg.length) == 2){
                        if(arg[1] == "INVENTORY"){
                            this.hero.getInv().printInv();
                        }    
                    }else{
                        System.err.println("Room information :");
                        Map<String,Exits> exits = lochero.getExits();
                        for(String i : exits.keySet()){
                            System.out.println(" -Exits : " + i );
                        }
                        System.out.println("");
                        for(int i = 1 ; i < this.hero.getHeroLoc().getCharacters().size() ; i++){
                            System.err.println(" -Character : " + this.hero.getHeroLoc().getCharacters().get(i));
                        }
                        System.out.println("You can use the argument INVENTORY to check your backpack !");
                    }
                case "TAKE":
                    if(lochero.isChestInLoc() == true){
                        if (lochero.getChestInLoc(lochero).getItem() != null){
                            this.hero.getInv().addItems(lochero.getChestInLoc(lochero).getItem());
                        }
                    }
                    else{
                        if(lochero.isHumanInLoc() == true){
                            if (lochero.getHumanInLoc(lochero).getInv() != null){
                                this.hero.getInv().addItems(lochero.getHumanInLoc(lochero).getInv().getItems().get(0));
                            }
                        }
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
            if (lochero.isClear(this.loc.get(this.loc.size()))){
                System.out.println("You Win !");
                quit();
            }
        }
        scanner.close();
    }

}
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import Game.Game;
import characters.*;
import locations.*;
import items.*;

public class Main {
    public static void main(String[] args) {
        Game g = new Game();
        g.createMap();
        Hero h = g.getHero();
        Locations loc = h.getHeroLoc();
        System.out.println(loc.getName());
    }
}
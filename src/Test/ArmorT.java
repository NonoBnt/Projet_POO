package Test;

import items.Armor;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArmorT(){

    @Test
    public void testLoseDurability(){
        Armor armor1 = new Armor("test", 20, 20, 20);
        armor1.loseDurability()
        assertEquals(armor1.getDurability(), 19);
    }

    @Test
    public void testIsBroke1(){
        Armor armor1 = new Armor("test", 20, 1, 10);
        assertFalse(armor1.isBroke());
    }

    @Test
    public void testIsBroke2(){
        Armor armor1 = new Armor("test", 20, 0, 10);
        assertTrue(armor1.isBroke());
    }

    @Test
    public void testGetDamageReduction(){
        Armor armor1 = new Armor("test", 20, 20, 20);
        assertEquals(armor1.getDamageReduction(),armor1.damageReduction);
    }
    @Test
    public void testGetName(){
        Armor armor1 = new Armor("test", 20, 20, 20);
        assertEquals(armor1.getName(),armor1.name);
    }
    @Test
    public void testGetWeigth(){
        Armor armor1 = new Armor("test", 20, 20, 20);
        assertEquals(armor1.getWeight(),armor1.weight);
    }
}
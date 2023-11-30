package Test;

import items.*;
import org.junit.Test;
import static org.junit.Assert.*;


public class InventoryT{
    @Test
    public void testGetSpaceLeft1(){
        Inventory inv1 = new Inventory();
        inv1.addItems(new Weapon("test", 5, 1, 0));
        assertEquals(inv1.getSpaceLeft(),14);
    }
    @Test
    public void testGetSpaceLeft2(){
        Inventory inv1 = new Inventory();
        assertEquals(inv1.getSpaceLeft(),15);
    }
    @Test
    public void testGetTotalWeigth1(){
        Inventory inv1 = new Inventory();
        assertEquals(inv1.getTotalWeight(), 0);
    }
    @Test
    public void testGetTotalWeigth2(){
        Inventory inv1 = new Inventory();
        Exitkey key = new Exitkey();
        inv1.addItems(key);
        assertEquals(inv1.getTotalWeight(), key.getWeight());
    }
    @Test
    public void testIsTooMuchWeight1(){
        Inventory inv1 = new Inventory();
        assertFalse(inv1.isTooMuchWeight());
    }
    public void testIsTooMuchWeight2(){
        Inventory inv1 = new Inventory();
        inv1.addItems(new Weapon("test", 1000, 1, 0));
        assertTrue(inv1.isTooMuchWeight());
    }
    public void testIsTooMuchWeight3(){
        Inventory inv1 = new Inventory();
        Weapon test = new Weapon("test", 10000, 1, 0);
        assertTrue(inv1.isTooMuchWeight(test));
    }
    @Test
    public void testIsFull1(){
        Inventory inv1 = new Inventory();
        assertFalse(inv1.isFull());
    }
    @Test
    public void testIsFull2(){
        Inventory inv1 = new Inventory();
        for(int i = 0 ; i < 16 ; i++){
            inv1.addItems(new Weapon("test", 5, 1, 0));
        }
        assertTrue(inv1.isFull());
    }
    @Test
    public void testGetSpace1(){
        Inventory inv1 = new Inventory();
        assertEquals(inv1.getSpace(),0);
    }
    @Test
    public void testGetSpace2(){
        Inventory inv1 = new Inventory();
        inv1.addItems(new Weapon("test", 5, 1, 0));
        assertEquals(inv1.getSpace(),1);
    }
    @Test
    public void testgetWeightLeft1(){
        Inventory inv1 = new Inventory();
        assertEquals(inv1.getWeightLeft(),100);
    }
    public void testgetWeightLeft2(){
        Inventory inv1 = new Inventory();
        inv1.addItems(new Weapon("test", 5, 1, 0));
        assertEquals(inv1.getWeightLeft(),95);
    }
    public void testIsKey1(){
        Inventory inv1 = new Inventory();
        assertFalse(inv1.isKey());
    }
    public void testIsKey2(){
        Inventory inv1 = new Inventory();
        inv1.addItems(new Exitkey());
        assertTrue(inv1.isKey());
    }


}
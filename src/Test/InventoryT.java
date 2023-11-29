package Test;

import items.*;
import org.junit.Test;
import static org.junit.Assert.*;


public class InventoryT(){
    @Test
    public void testGetSpaceLeft(){
        Inventory inv1 = new Inventory();
        assertEquals(inv1.getSpaceLeft(),(inv1.MAX_LENGTH - inv1.length));
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
        inv1.addItems(new Weapon("test", 10000, 1, 0));
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
        
        assertFalse(inv1.isFull());
    }


}
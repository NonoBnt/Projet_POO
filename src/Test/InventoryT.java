package Test;

import items.Inventory;
import org.junit.Test;
import static org.junit.Assert.*;

public class InventoryT(){
    @Test
    public void testAddItems1(){
        Inventory inv1 = new Inventory();
        Key keytest = new Key();
        inv1.addItems(keytest);
        
    }
    @Test
    public void testGetSpaceLeft(){
        Inventory inv1 = new Inventory();
        assertEquals(inv1.getSpaceLeft(),(inv1.MAX_LENGTH - inv1.length));
    }
    @Test
    public void testIsFull1(){
        Inventory inv1 = new Inventory();
        assertFalse(inv1.isFull());
    }


}
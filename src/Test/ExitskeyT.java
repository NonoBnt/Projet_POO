package Test;

import items.Exitkey;
import org.junit.Test;
import static org.junit.Assert.*;

public class ExitkeyT(){

    @Test
    public void testObjectKey(){
        Key key1 = new Key();
        assertEquals(key1.name, key1.NAME);
        assertEquals(key1.weight, key1.WEIGHT);
    }
    @Test
    public void testGetName(){
         Key key1 = new Key();
        assertEquals(key1.getName(),key1.name);
    }
    @Test
    public void testGetWeigth(){
         Key key1 = new Key();
        assertEquals(key1.getWeight(),key1.weight);
    }
}
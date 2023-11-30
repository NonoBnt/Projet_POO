package Test;

import items.Exitkey;
import org.junit.Test;
import static org.junit.Assert.*;

public class ExitkeyT{

    @Test
    public void testObjectExitkey(){
        Exitkey key1 = new Exitkey();
        assertEquals(key1.name, key1.NAME);
        assertEquals(key1.weight, key1.WEIGHT);
    }
    @Test
    public void testGetName(){
         Exitkey key1 = new Exitkey();
        assertEquals(key1.getName(),key1.name);
    }
    @Test
    public void testGetWeigth(){
         Exitkey key1 = new Exitkey();
        assertEquals(key1.getWeight(),key1.weight);
    }
}
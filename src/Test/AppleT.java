package Test;

import items.Apple;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppleT(){

    @Test
    public void testObjectApple(){
        Apple apple1 = new Apple();
        assertEquals(apple1.name, apple1.NAME);
        assertEquals(apple1.heal, apple1.HEAL);
        assertEquals(apple1.weight, apple1.WEIGHT);
    }

    @Test
    public void testGetHeal(){
        Apple apple1 = new Apple();
        assertEquals(apple1.getHeal(),apple1.heal);
    }
    @Test
    public void testGetName(){
        Apple apple1 = new Apple();
        assertEquals(apple1.getName(),apple1.name);
    }
    @Test
    public void testGetWeigth(){
        Apple apple1 = new Apple();
        assertEquals(apple1.getWeight(),apple1.weight);
    }
}
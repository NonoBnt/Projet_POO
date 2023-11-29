package Test;

import items.HealPotion;
import org.junit.Test;
import static org.junit.Assert.*;

public class HealPotionT(){
    
    @Test
    public void testObjectHealPotion(){
        HealPotion healpotion1 = new HealPotion();
        assertEquals(healpotion1.name, healpotion1.NAME);
        assertEquals(healpotion1.heal, healpotion1.HEAL);
        assertEquals(healpotion1.weight, healpotion1.WEIGHT);
    }
    @Test
    public void testGetHeal(){
        HealPotion healpotion1 = new HealPotion();
        assertEquals(healpotion1.getHeal(),healpotion1.heal);
    }
    @Test
    public void testGetName(){
        HealPotion healpotion1 = new HealPotion();
        assertEquals(healpotion1.getName(),healpotion1.name);
    }
    @Test
    public void testGetWeigth(){
        HealPotion healpotion1 = new HealPotion();
        assertEquals(healpotion1.getWeight(),healpotion1.weight);
    }
}
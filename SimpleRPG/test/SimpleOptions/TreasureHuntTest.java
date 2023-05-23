package SimpleOptions;

import SimpleCharacters.Hero;
import SimpleCharacters.Swordsman;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TreasureHuntTest {
    
    private TreasureHunt instance;
    private Hero hero;
    
    public TreasureHuntTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Hero hero = new Swordsman("Test Hero", "Male");
        instance = new TreasureHunt(hero, 1);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetTreasureHunger() {
        System.out.println("getTreasureHunger");
        int expResult = 3;
        int result = instance.getTreasureHunger();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetTreasureHunger() {
        System.out.println("setTreasureHunger");
        int treasureHunger = 5;
        instance.setTreasureHunger(treasureHunger);
        int result = instance.getTreasureHunger();
        assertEquals(treasureHunger, result);
    }

    @Test
    public void testSetHero() {
        System.out.println("setHero");
        Swordsman newHero = new Swordsman("New Hero", "Male"); // Create a new Swordsman
        instance.setHero(newHero);
        Hero result = instance.getHero();
        assertEquals(newHero, result);
    }

    @Test
    public void testGetTreasureOption() {
        System.out.println("getTreasureOption");
        int expResult = 1;
        int result = instance.getTreasureOption();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetTreasureOption() {
        System.out.println("setTreasureOption");
        int treasureOption = 2;
        instance.setTreasureOption(treasureOption);
        int result = instance.getTreasureOption();
        assertEquals(treasureOption, result);
    }

    @Test
    public void testGetTreasure() {
        System.out.println("getTreasure");
        String expResult = "Gold Mine in Rotorua";
        String result = instance.getTreasure();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetFood() {
        System.out.println("setFood");
        String treasure = "Mountain Peak in Queenstown";
        instance.setFood(treasure);
        String result = instance.getTreasure();
        assertEquals(treasure, result);
    }
}

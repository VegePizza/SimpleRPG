/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package SimpleOptions;

import SimpleCharacters.Hero;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jc
 */
public class TreasureHuntTest {
    
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
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPerformHunger method, of class TreasureHunt.
     */
    @Test
    public void testGetPerformHunger() {
        System.out.println("getPerformHunger");
        TreasureHunt instance = null;
        int expResult = 0;
        int result = instance.getPerformHunger();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPerformHunger method, of class TreasureHunt.
     */
    @Test
    public void testSetPerformHunger() {
        System.out.println("setPerformHunger");
        int treasureHunger = 0;
        TreasureHunt instance = null;
        instance.setPerformHunger(treasureHunger);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHero method, of class TreasureHunt.
     */
    @Test
    public void testGetHero() {
        System.out.println("getHero");
        TreasureHunt instance = null;
        Hero expResult = null;
        Hero result = instance.getHero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHero method, of class TreasureHunt.
     */
    @Test
    public void testSetHero() {
        System.out.println("setHero");
        Hero Hero = null;
        TreasureHunt instance = null;
        instance.setHero(Hero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPerformOption method, of class TreasureHunt.
     */
    @Test
    public void testGetPerformOption() {
        System.out.println("getPerformOption");
        TreasureHunt instance = null;
        int expResult = 0;
        int result = instance.getPerformOption();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPerformOption method, of class TreasureHunt.
     */
    @Test
    public void testSetPerformOption() {
        System.out.println("setPerformOption");
        int treasureOption = 0;
        TreasureHunt instance = null;
        instance.setPerformOption(treasureOption);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPerform method, of class TreasureHunt.
     */
    @Test
    public void testGetPerform() {
        System.out.println("getPerform");
        TreasureHunt instance = null;
        String expResult = "";
        String result = instance.getPerform();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFood method, of class TreasureHunt.
     */
    @Test
    public void testSetFood() {
        System.out.println("setFood");
        String treasure = "";
        TreasureHunt instance = null;
        instance.setFood(treasure);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of treasureHero method, of class TreasureHunt.
     */
    @Test
    public void testPerformHero() {
        System.out.println("treasureHero");
        TreasureHunt instance = null;
        String expResult = "";
        String result = instance.treasureHero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

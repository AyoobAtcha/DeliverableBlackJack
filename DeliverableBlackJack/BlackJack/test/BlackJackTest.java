/*
 * Ayoob Atcha
 * Student ID: 991512971
 * SYST10199 - Web Programmer
 */
package blackjack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ayoob
 */
public class BlackJackTest {
    
    public BlackJackTest() {
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
    @Test
   public void testWinBoundary() {
        System.out.println("BoundaryCase");
        int winingCount = 0;
        Game instance = new Game();
        boolean expResult = false;
        boolean result = instance.win(Player me, Player dealer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
   @Test
   public void testWinGood() {
        System.out.println("Good");
        int winingCount = 21;
        Game instance = new Game();
        boolean expResult = true;
        boolean result = instance.win(Player me, Player dealer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
  @Test
   public void testWinBad() {
        System.out.println("Bad");
        int winingCount = 22;
        Game instance = new Game();
        boolean expResult = false;
        boolean result = instance.win(Player me, Player dealer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
   @Test
   public void testHitorSitGood() {
        System.out.println("Good");
        char ans = 'h'; //could also be 's'
        Game instance = new Game();
        boolean expResult = true;
        boolean result = instance.win(Player me, Player dealer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
   public void testHitorSitBad() {
        System.out.println("Bad");
        char ans = 's'; //or anything else
        Game instance = new Game();
        boolean expResult = false;
        boolean result = instance.win(Player me, Player dealer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
   public void testHitorSitBoundary() {
        System.out.println("BoundaryCase");
        char ans = ' '; 
        Game instance = new Game();
        boolean expResult = false;
        boolean result = instance.win(Player me, Player dealer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

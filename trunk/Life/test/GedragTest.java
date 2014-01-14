/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Enums.BeestType;
import Enums.Richting;
import Models.Beest;
import Models.Positie;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bart Janisse
 */
public class GedragTest {
    
    public GedragTest() {
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
    public void BeestLoopTest() 
    {       
        Positie pos = new Positie();
        pos.setX(100);
        pos.setY(100);
        Beest beest = new Beest(BeestType.HERBIVOOR, pos, Richting.N, 21, 31, 41 );
    
        beest.loop();
        assertEquals(beest.getPositie().getX(), 100);
        assertEquals(beest.getPositie().getY(), 99);
        
        beest.setRichting(Richting.Z);
        beest.loop();
        assertEquals(beest.getPositie().getX(), 100);
        assertEquals(beest.getPositie().getY(), 100);
        
        beest.setRichting(Richting.O);
        beest.loop();
        assertEquals(beest.getPositie().getX(), 101);
        assertEquals(beest.getPositie().getY(), 100);
        
        beest.setRichting(Richting.W);
        beest.loop();
        assertEquals(beest.getPositie().getX(), 100);
        assertEquals(beest.getPositie().getY(), 100);
        
        beest.setRichting(Richting.NO);
        beest.loop();
        assertEquals(beest.getPositie().getX(), 101);
        assertEquals(beest.getPositie().getY(), 99);
        
        beest.setRichting(Richting.ZW);
        beest.loop();
        assertEquals(beest.getPositie().getX(), 100);
        assertEquals(beest.getPositie().getY(), 100);
        
        beest.setRichting(Richting.NW);
        beest.loop();
        assertEquals(beest.getPositie().getX(), 99);
        assertEquals(beest.getPositie().getY(), 99);
        
        beest.setRichting(Richting.ZO);
        beest.loop();
        assertEquals(beest.getPositie().getX(), 100);
        assertEquals(beest.getPositie().getY(), 100);
    }
    
//    @test
//    public void 
    
    @Test
    public void BeestEetTest() 
    {
        //Beest beest = new Beest(BeestType.HERBIVOOR, new Positie(), Richting.N, 21, 31, 41 );
       
        //beest.eet(20);
        
    }
}
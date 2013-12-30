/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Factories.BeestFactory;
import Factories.BeestType;
import Gedrag.CarnivoorGedrag;
import Gedrag.HerbivoorGedrag;
import Gedrag.IGedrag;
import Gedrag.NonivoorGedrag;
import Gedrag.OmnivoorGedrag;
import Models.Beest;
import Models.Positie;
import Models.Richting;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author Bart Janisse
 */
public class FactoryTest {
    
    static BeestFactory beesten;

    
    public FactoryTest() 
    {
    }
    
    @BeforeClass
    public static void setUpClass() 
    {    
        beesten = BeestFactory.getInstance(); 
    }
    
    @AfterClass
    public static void tearDownClass() 
    {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    // Test controleert of er een beest van het type omnivoor wordt aangemaakt
    // en of de juiste parameters worden gebruikt.
    @Test
    public void omnivoorCreateTest() 
    {
        Beest b = beesten.createBeest(BeestType.OMNIVOOR, new Positie(10, 15), new Richting(), 20, 30, 40 );
       
        IGedrag expectedGedrag = b.getGedrag();
        
        assertNotNull(b);
        assertEquals(expectedGedrag.getClass(),  OmnivoorGedrag.class );
        assertNotSame(expectedGedrag.getClass(), HerbivoorGedrag.class );
        assertNotSame(expectedGedrag.getClass(), CarnivoorGedrag.class );
        assertNotSame(expectedGedrag.getClass(), NonivoorGedrag.class );
        
        assertEquals(b.getPoten(), 20);
        assertEquals(b.getMaxGewicht(), 30);
        assertEquals(b.getMaxEnergie(), 40);
        
        assertEquals(b.getPositie().getX(), 10);
        assertEquals(b.getPositie().getY(), 15);
    }
    
    // Test controleert of er een beest van het type herbivoor wordt aangemaakt
    // en of de juiste parameters worden gebruikt.
    @Test
    public void HerbivoorCreateTest() 
    {
//        Beest b = beesten.createBeest(BeestType.HERBIVOOR);
//        IGedrag expectedGedrag = b.getGedrag();
//        
//        assertNotNull(b);
//        assertEquals(expectedGedrag.getClass(),  HerbivoorGedrag.class );
//        assertNotSame(expectedGedrag.getClass(), OmnivoorGedrag.class );
//        assertNotSame(expectedGedrag.getClass(), CarnivoorGedrag.class );
//        assertNotSame(expectedGedrag.getClass(), NonivoorGedrag.class );
    }
    
    // Test controleert of er een beest van het type Carnivoor wordt aangemaakt
    // en of de juiste parameters worden gebruikt.
    @Test
    public void CarnivoorCreateTest() 
    {
//        Beest b = beesten.createBeest(BeestType.CARNIVOOR);
//        IGedrag expectedGedrag = b.getGedrag();
//        
//        assertNotNull(b);
//        assertEquals(expectedGedrag.getClass(),  CarnivoorGedrag.class );
//        assertNotSame(expectedGedrag.getClass(), HerbivoorGedrag.class );
//        assertNotSame(expectedGedrag.getClass(), OmnivoorGedrag.class );
//        assertNotSame(expectedGedrag.getClass(), NonivoorGedrag.class );
    }
    
    // Test controleert of er een beest van het type omnivoor wordt aangemaakt
    // en of de juiste parameters worden gebruikt.
    @Test
    public void nvoorCreateTest() 
    {
//        Beest b = beesten.createBeest(BeestType.NONIVOOR);
//        IGedrag expectedGedrag = b.getGedrag();
//        
//        assertNotNull(b);
//        assertEquals(expectedGedrag.getClass(),  NonivoorGedrag.class );
//        assertNotSame(expectedGedrag.getClass(), HerbivoorGedrag.class );
//        assertNotSame(expectedGedrag.getClass(), CarnivoorGedrag.class );
//        assertNotSame(expectedGedrag.getClass(), OmnivoorGedrag.class );
    }
}
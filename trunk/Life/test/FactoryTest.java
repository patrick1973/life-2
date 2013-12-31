/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Factories.BeestFactory;
import Enums.BeestType;
import Gedrag.CarnivoorGedrag;
import Gedrag.HerbivoorGedrag;
import Gedrag.IGedrag;
import Gedrag.NonivoorGedrag;
import Gedrag.OmnivoorGedrag;
import Models.Beest;
import Enums.Richting;
import Models.Positie;
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
        Richting richting = Richting.getRandom();
        Positie pos = new Positie();
        
        Beest b = beesten.createBeest(BeestType.OMNIVOOR, pos, richting, 20, 30, 40 );
       
        IGedrag expectedGedrag = b.getGedrag();
        
        assertNotNull(b);
        assertEquals(expectedGedrag.getClass(),  OmnivoorGedrag.class );
        assertNotSame(expectedGedrag.getClass(), HerbivoorGedrag.class );
        assertNotSame(expectedGedrag.getClass(), CarnivoorGedrag.class );
        assertNotSame(expectedGedrag.getClass(), NonivoorGedrag.class );
        
        assertEquals(b.getPoten(), 20);
        assertEquals(b.getMaxGewicht(), 30);
        assertEquals(b.getMaxEnergie(), 40);
        
        assertEquals(b.getPositie().getX(), pos.getX());
        assertEquals(b.getPositie().getY(), pos.getY());
        
        assertEquals(b.getRichting(), richting);
    }
    
    // Test controleert of er een beest van het type herbivoor wordt aangemaakt
    // en of de juiste parameters worden gebruikt.
    @Test
    public void herbivoorCreateTest() 
    {
        Richting richting = Richting.getRandom();
        Positie pos = new Positie();
         
        Beest b = beesten.createBeest(BeestType.HERBIVOOR, pos, richting, 21, 31, 41 );
        IGedrag expectedGedrag = b.getGedrag();
        
        assertNotNull(b);
        assertEquals(expectedGedrag.getClass(),  HerbivoorGedrag.class );
        assertNotSame(expectedGedrag.getClass(), OmnivoorGedrag.class );
        assertNotSame(expectedGedrag.getClass(), CarnivoorGedrag.class );
        assertNotSame(expectedGedrag.getClass(), NonivoorGedrag.class );
        
        assertEquals(b.getPoten(), 21);
        assertEquals(b.getMaxGewicht(), 31);
        assertEquals(b.getMaxEnergie(), 41);
        
        assertEquals(b.getPositie().getX(), pos.getX());
        assertEquals(b.getPositie().getY(), pos.getY());
        
        assertEquals(b.getRichting(), richting);
        
        b.loop();
    }
    
    // Test controleert of er een beest van het type Carnivoor wordt aangemaakt
    // en of de juiste parameters worden gebruikt.
    @Test
    public void carnivoorCreateTest() 
    {
        Richting richting = Richting.getRandom();
        Positie pos = new Positie();
         
        Beest b = beesten.createBeest(BeestType.CARNIVOOR, pos,  richting, 22, 32, 42 );
        IGedrag expectedGedrag = b.getGedrag();
        
        assertNotNull(b);
        assertEquals(expectedGedrag.getClass(),  CarnivoorGedrag.class );
        assertNotSame(expectedGedrag.getClass(), HerbivoorGedrag.class );
        assertNotSame(expectedGedrag.getClass(), OmnivoorGedrag.class );
        assertNotSame(expectedGedrag.getClass(), NonivoorGedrag.class );
        
        assertEquals(b.getPoten(), 22);
        assertEquals(b.getMaxGewicht(), 32);
        assertEquals(b.getMaxEnergie(), 42);
        
        assertEquals(b.getPositie().getX(), pos.getX());
        assertEquals(b.getPositie().getY(), pos.getY());
        
        assertEquals(b.getRichting(), richting);
    }
    
    // Test controleert of er een beest van het type omnivoor wordt aangemaakt
    // en of de juiste parameters worden gebruikt.
    @Test
    public void nonivoorCreateTest() 
    {
        Richting richting = Richting.getRandom();
        Positie pos = new Positie();
        
        Beest b = beesten.createBeest(BeestType.NONIVOOR, pos,  richting, 23, 33, 43 );
        IGedrag expectedGedrag = b.getGedrag();
        
        assertNotNull(b);
        assertEquals(expectedGedrag.getClass(),  NonivoorGedrag.class );
        assertNotSame(expectedGedrag.getClass(), HerbivoorGedrag.class );
        assertNotSame(expectedGedrag.getClass(), CarnivoorGedrag.class );
        assertNotSame(expectedGedrag.getClass(), OmnivoorGedrag.class );
        
        assertEquals(b.getPoten(), 23);
        assertEquals(b.getMaxGewicht(), 33);
        assertEquals(b.getMaxEnergie(), 43);
        
        assertEquals(b.getPositie().getX(), pos.getX());
        assertEquals(b.getPositie().getY(), pos.getY());
        
        assertEquals(b.getRichting(), richting);
    }
}
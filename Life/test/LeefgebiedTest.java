/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Enums.BeestType;
import Enums.Richting;
import Models.Beest;
import Models.Leefgebied;
import Models.Positie;
import java.util.ArrayList;
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
public class LeefgebiedTest {
    
    public LeefgebiedTest() {
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
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void ValRechtsVanWereldTest() 
    {
        Positie pos = new Positie(95, 50);
        
        Beest beest = new Beest(BeestType.HERBIVOOR, pos , Richting.O, 1, 1, 1 );
        
        Leefgebied leefgebied = new Leefgebied(new Positie(10,10), 0, 0, 0, 0, 0, 0); 
        
        assertEquals(leefgebied.getBeesten().size(), 0);
        assertEquals(leefgebied.getPlanten().size(), 0);
        assertEquals(leefgebied.getObstakels().size(), 0); 
        
        ArrayList<Beest> b = leefgebied.getBeesten();
        b.add(beest);
        
        assertEquals(1, leefgebied.getBeesten().size());
        
        ArrayList<Beest> afgevallen = new ArrayList<>();
        
        afgevallen = leefgebied.simulatieStap();
        assertEquals(96, beest.getPositie().getX());
        assertEquals(50, beest.getPositie().getY());
        assertEquals(0, afgevallen.size());
        
        afgevallen = leefgebied.simulatieStap();
        assertEquals(97, beest.getPositie().getX());
        assertEquals(50, beest.getPositie().getY());
        assertEquals(0, afgevallen.size());
        
        afgevallen = leefgebied.simulatieStap();
        assertEquals(98, beest.getPositie().getX());
        assertEquals(50, beest.getPositie().getY());
        assertEquals(0, afgevallen.size());
        
        afgevallen = leefgebied.simulatieStap();
        assertEquals(99, beest.getPositie().getX());
        assertEquals(50, beest.getPositie().getY());
        assertEquals(0, afgevallen.size());
        
        afgevallen = leefgebied.simulatieStap();
        assertEquals(110, beest.getPositie().getX());
        assertEquals(50, beest.getPositie().getY());
        assertEquals(1, afgevallen.size());
    }
    
    @Test
    public void ValLinksVanWereldTest() 
    {
        Positie pos = new Positie(5, 50);
        
        Beest beest = new Beest(BeestType.HERBIVOOR, pos , Richting.W, 1, 1, 1 );
        
        Leefgebied leefgebied = new Leefgebied(new Positie(10,10), 0, 0, 0, 0, 0, 0); 
        
        assertEquals(leefgebied.getBeesten().size(), 0);
        assertEquals(leefgebied.getPlanten().size(), 0);
        assertEquals(leefgebied.getObstakels().size(), 0); 
        
        ArrayList<Beest> b = leefgebied.getBeesten();
        b.add(beest);
        
        assertEquals(1, leefgebied.getBeesten().size());
        
        ArrayList<Beest> afgevallen = new ArrayList<>();
        
        afgevallen = leefgebied.simulatieStap();
        assertEquals(4, beest.getPositie().getX());
        assertEquals(50, beest.getPositie().getY());
        assertEquals(0, afgevallen.size());
        
        afgevallen = leefgebied.simulatieStap();
        assertEquals(beest.getPositie().getX(), 3);
        assertEquals(beest.getPositie().getY(), 50);
        assertEquals(0, afgevallen.size());
        
        afgevallen = leefgebied.simulatieStap();
        assertEquals(2, beest.getPositie().getX());
        assertEquals(50, beest.getPositie().getY());
        assertEquals(0, afgevallen.size());
        
        afgevallen = leefgebied.simulatieStap();
        assertEquals(1, beest.getPositie().getX());
        assertEquals(50, beest.getPositie().getY());
        assertEquals(0, afgevallen.size());
        
        afgevallen = leefgebied.simulatieStap();
        assertEquals(0, beest.getPositie().getX());
        assertEquals(50, beest.getPositie().getY());
        assertEquals(0, afgevallen.size());
        
        afgevallen = leefgebied.simulatieStap();
        assertEquals(9, beest.getPositie().getX());
        assertEquals(50, beest.getPositie().getY());
        assertEquals(afgevallen.size(), 1);
    }
    
    @Test
    public void ValBovenVanWereldTest() 
    {
        Positie pos = new Positie(50, 5);
        
        Beest beest = new Beest(BeestType.HERBIVOOR, pos , Richting.N, 1, 1, 1 );
        
        Leefgebied leefgebied = new Leefgebied(new Positie(10,10), 0, 0, 0, 0, 0, 0); 
        
        assertEquals(leefgebied.getBeesten().size(), 0);
        assertEquals(leefgebied.getPlanten().size(), 0);
        assertEquals(leefgebied.getObstakels().size(), 0); 
        
        ArrayList<Beest> b = leefgebied.getBeesten();
        b.add(beest);
        
        assertEquals(1, leefgebied.getBeesten().size());
        
        ArrayList<Beest> afgevallen = new ArrayList<>();
        
        afgevallen = leefgebied.simulatieStap();
        assertEquals(50, beest.getPositie().getX());
        assertEquals(4, beest.getPositie().getY());
        assertEquals(0, afgevallen.size());
        
        afgevallen = leefgebied.simulatieStap();
        assertEquals(50, beest.getPositie().getX());
        assertEquals(3, beest.getPositie().getY());
        assertEquals(0, afgevallen.size());
        
        afgevallen = leefgebied.simulatieStap();
        assertEquals(50, beest.getPositie().getX());
        assertEquals(2, beest.getPositie().getY());
        assertEquals(0, afgevallen.size());
        
        afgevallen = leefgebied.simulatieStap();
        assertEquals(50, beest.getPositie().getX());
        assertEquals(1, beest.getPositie().getY());
        assertEquals(0, afgevallen.size());
        
        afgevallen = leefgebied.simulatieStap();
        assertEquals(50, beest.getPositie().getX());
        assertEquals(0, beest.getPositie().getY());
        assertEquals(0, afgevallen.size());
        
        afgevallen = leefgebied.simulatieStap();
        assertEquals(50, beest.getPositie().getX());
        assertEquals(9, beest.getPositie().getY());
        assertEquals(afgevallen.size(), 1);
    }
    
    @Test
    public void ValOnderVanWereldTest() 
    {
        Positie pos = new Positie(50, 195);
        
        Beest beest = new Beest(BeestType.HERBIVOOR, pos , Richting.Z, 1, 1, 1 );
        
        Leefgebied leefgebied = new Leefgebied(new Positie(10,10), 0, 0, 0, 0, 0, 0); 
        
        assertEquals(leefgebied.getBeesten().size(), 0);
        assertEquals(leefgebied.getPlanten().size(), 0);
        assertEquals(leefgebied.getObstakels().size(), 0); 
        
        ArrayList<Beest> b = leefgebied.getBeesten();
        b.add(beest);
        
        assertEquals(1, leefgebied.getBeesten().size());
        
        ArrayList<Beest> afgevallen = new ArrayList<>();
        
        afgevallen = leefgebied.simulatieStap();
        assertEquals(50, beest.getPositie().getX());
        assertEquals(196, beest.getPositie().getY());
        assertEquals(0, afgevallen.size());
        
        afgevallen = leefgebied.simulatieStap();
        assertEquals(50, beest.getPositie().getX());
        assertEquals(197, beest.getPositie().getY());
        assertEquals(0, afgevallen.size());
        
        afgevallen = leefgebied.simulatieStap();
        assertEquals(50, beest.getPositie().getX());
        assertEquals(198, beest.getPositie().getY());
        assertEquals(0, afgevallen.size());
        
        afgevallen = leefgebied.simulatieStap();
        assertEquals(50, beest.getPositie().getX());
        assertEquals(199, beest.getPositie().getY());
        assertEquals(0, afgevallen.size());
        
        afgevallen = leefgebied.simulatieStap();
        assertEquals(50, beest.getPositie().getX());
        assertEquals(210, beest.getPositie().getY());
        assertEquals(afgevallen.size(), 1);
    }
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Factories.BeestFactory;
import Factories.Beesten;
import Gedrag.CarnivoorGedrag;
import Gedrag.HerbivoorGedrag;
import Gedrag.IGedrag;
import Gedrag.NonivoorGedrag;
import Gedrag.OmnivoorGedrag;
import Models.Beest;
import static org.junit.Assert.*;


/**
 *
 * @author Bart Janisse
 */
public class FactoryTest {
    
    //static BeestFactory bf;
    BeestFactory beesten = BeestFactory.getInstance();

    
    public FactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
        //beesten = BeestFactory.getInstance(); 
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
    public void omnivoorTest() 
    {
        Beest b = beesten.createBeest(Beesten.OMNIVOOR);
        IGedrag expectedGedrag = b.getGedrag();
        
        assertNotNull(b);
        assertEquals(expectedGedrag.getClass(),  OmnivoorGedrag.class );
        assertNotSame(expectedGedrag.getClass(), HerbivoorGedrag.class );
        assertNotSame(expectedGedrag.getClass(), CarnivoorGedrag.class );
        assertNotSame(expectedGedrag.getClass(), NonivoorGedrag.class );
    }

}
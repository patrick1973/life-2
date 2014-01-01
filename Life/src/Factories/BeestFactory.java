package Factories;

import Enums.BeestType;
import Models.Beest;
import Models.Positie;
import Enums.Richting;

/**
 *
 * @author Bart Janisse
 */
public class BeestFactory {
    
    private static BeestFactory instance = new BeestFactory();
   
    /**
     * Private constructor
     */
    private BeestFactory() {}
    
    /**
     * @return een single instance van deze factory
     */
    public static BeestFactory getInstance(){
        return instance;
    }
    
    /**
     * Creert een nieuw beest op basis van het beesttype.
     * @param beestType
     * @return nieuw Beest
     */
    public Beest createBeest(BeestType beestType, Positie positie, Richting richting, int poten, int maxGewicht, int maxEnergie)
    {       
        return new Beest(beestType, positie, richting, poten, maxGewicht, maxEnergie);
    }
}

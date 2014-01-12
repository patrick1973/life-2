package Factories;

import Enums.BeestType;
import Models.Beest;
import Models.Positie;
import Enums.Richting;
import GUI_algemeen.SimulatieGegevensDialog;

/**
 *
 * @author Bart Janisse
 */
public class BeestFactory {
    
    private static BeestFactory instance = new BeestFactory();
    SimulatieGegevensDialog gegevens = new SimulatieGegevensDialog(null, true);
   
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
    /**
     * Creert een nieuw beest op basis van het beesttype met random richting.
     * De andere setting komen van uit de intellingen
     * @param beestType
     * @return 
     */
    public Beest createBeest(BeestType beestType)
    {       
          int poten, maxEnergie, maxGewicht;
                  
        switch(beestType)
        {
            case CARNIVOOR  :   poten = gegevens.getCarnivoorAantalPoten();
                                maxEnergie = gegevens.getCarnivoorMaxEnergie();
                                maxGewicht = gegevens.getCarnivoorMaxGewicht();
                                break;
            case HERBIVOOR  :   poten = gegevens.getHerbivoorAantalPoten();
                                maxEnergie = gegevens.getHerbivoorMaxEnergie();
                                maxGewicht = gegevens.getHerbivoorMaxGewicht();
                                break;
            case OMNIVOOR   :   poten = gegevens.getOmnivoorAantalPoten();
                                maxEnergie = gegevens.getOmnivoorMaxEnergie();
                                maxGewicht = gegevens.getOmnivoorMaxGewicht();
                                break;
            case NONIVOOR   :   poten = gegevens.getNonivoorAantalPoten();
                                maxEnergie = gegevens.getNonivoorMaxEnergie();
                                maxGewicht = gegevens.getNonivoorMaxGewicht();
                                break;
            default         :   poten = 20;
                                maxEnergie = 20;
                                maxGewicht = 20;
                                break;  
        }
        
        return new Beest(beestType, new Positie(), Richting.getRandom(), poten, maxGewicht, maxEnergie);
    }
}

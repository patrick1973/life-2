
package Models;

import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author Bart Janisse
 */
public class WereldModel extends Observable {
    
    private ArrayList<Leefgebied> leefgebieden;
    Water water;
    
    /** 
     * Creert het wereld model met een collectie van leefgebieden en water
     */
    public WereldModel() 
    {
        leefgebieden = new ArrayList<>();
        water = new Water();
    }
    
    /**
     * het  totaal aantal elementen onderverdelen en daarna verdelen over 2 
     * leefgebieden. en de elementen toevoegen aan de leeftgebieden.
     * Tevens zorgt deze methode ook voor het updaten van de views door het
     * aanroepen van de overgeerfde methodes setChanged() en notifyObservers()
     * @param elementen 
     */
    public void setAantalElementen(int elementen)
    {
        int planten =    (int)(elementen * 0.3  / 2.0);
        int obstakels =  (int)(elementen * 0.1  / 2.0);
        int carnivoren = (int)(elementen * 0.4  / 2.0);
        int omnivoren =  (int)(elementen * 0.05 / 2.0);
        int herbivoren = (int)(elementen * 0.1  / 2.0);
        int nonivoren =  (int)(elementen * 0.05 / 2.0);
         
        leefgebieden.add(new Leefgebied(new Positie( 50, 50), obstakels, planten, carnivoren, omnivoren, herbivoren, nonivoren));
        leefgebieden.add(new Leefgebied(new Positie(200, 50), obstakels, planten, carnivoren, omnivoren, herbivoren, nonivoren));
        
        this.setChanged();
        this.notifyObservers();
    }
    
    /**
     * @return de breedte van het leef gebied
     */
    public int getLeefgebiedBreedte()
    {
        return 350;
    }
    
    /**
     * @return de hoogte van het leefgebied
     */
    public int getLeefgebiedHoogte()
    {
        return 200;
    }
    
    /**
     * @return een collectie van leefgebieden
     */
    public ArrayList<Leefgebied> getLeefgebieden()
    {
        return leefgebieden;
    }
    
    /**
     * @return een collectie van beesten die zich in het water bevinden.
     */
    public ArrayList<Beest> getWater()
    {
        return water.getBeesten();
    }
    
    /**
     * De simulatieStap methode zorgt er voor dat de beesten door het leefgebied
     * verplaatsen en dat de beesten door het water verplaatsen en regelt de 
     * overgang van leefgebied naar water
     * En zorgt er voor dat de view wordt geupdate door de overgeerfde methodes
     * setChanged() en notifyObservers();
     */
    public void simulatieStap()
    {
        ArrayList<Beest> afgevallenBeesten = new ArrayList<>();
        
        for(Leefgebied leefgebied: leefgebieden)
        {
            afgevallenBeesten = leefgebied.simulatieStap();
        
            for(Beest beest : afgevallenBeesten)
            {
                water.getBeesten().add(beest);
            }
        }
        
        afgevallenBeesten = water.simulatieStap();
        
        this.setChanged();
        this.notifyObservers();
    }
}

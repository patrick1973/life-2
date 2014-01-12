
package Models;

import java.util.ArrayList;

/**
 *
 * @author Bart Janisse
 */
public class Water {
    
    private ArrayList<Beest> beesten;
    
    /**
     * Bij het creeeren van water wordt er een lijst vna het type beest
     * aangemaakt. Hier in worden later de beesten toegevoegd die in het water
     * gevallen zijn.
     */
    public Water()
    {
        beesten = new ArrayList<>();
    }
    
    /**
     * @return de lijst met beesten die zich in het water bevinden
     */
    public ArrayList<Beest> getBeesten()
    {
        return beesten;
    }
    
    /**
     * Nog inet af, maar hier laten we beesten in het water bewegen en weer 
     * terug aan "Land"komen.
     * @return 
     */
    public ArrayList<Beest> simulatieStap()
    {
        ArrayList<Beest> afgevallenBeesten = new ArrayList<>();
                
        for(Beest beest: beesten)
        {
            beest.loop();
        }
        
        return afgevallenBeesten;
    }
}

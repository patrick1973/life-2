package Models;

import Enums.Richting;
import Enums.BeestType;
import Gedrag.IGedrag;


/**
 *
 * @author Bart Janisse
 */
public class Beest {

    IGedrag gedrag;
    int positieX;
    int positieY;
    int poten;
    int maxGewicht; 
    int maxEnergie;
    Positie positie;
    Richting richting;
    
    public Beest(BeestType type, Positie startPositie, Richting startRichting, int poten, int maxGewicht, int maxEnergie) 
    {
        this.gedrag = type.getGedrag();
        this.poten = poten;
        this.maxGewicht = maxGewicht;
        this.maxEnergie = maxEnergie;
        this.positie = startPositie;
        this.richting = startRichting;
    }
    
    public IGedrag getGedrag()
    {
        return gedrag;
    }
    
    public int getPoten()
    {
        return this.poten;
    }
    
    public int getMaxGewicht() 
    {
        return maxGewicht;
    }

    public int getMaxEnergie() 
    {
        return maxEnergie;
    }

    public Positie getPositie() 
    {
        return positie;
    }

    public Richting getRichting() 
    {
        return richting;
    }

    
}

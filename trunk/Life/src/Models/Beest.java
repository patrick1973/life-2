package Models;

import Enums.Richting;
import Enums.BeestType;
import Gedrag.IGedrag;


/**
 *
 * @author Bart Janisse
 */
public class Beest {

    BeestType type;
    int positieX;
    int positieY;
    int poten;
    int maxGewicht; 
    int maxEnergie;
    Positie positie;
    Richting richting;
    
    public Beest(BeestType type, Positie startPositie, Richting startRichting, int poten, int maxGewicht, int maxEnergie) 
    {
        //this.gedrag = type.getGedrag();
        this.type = type;
        this.poten = poten;
        this.maxGewicht = maxGewicht;
        this.maxEnergie = maxEnergie;
        this.positie = startPositie;
        this.richting = startRichting;
    }
        
    public BeestType getType()
    {
        return this.type;
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
    
    public void setRichting(Richting r)
    {
        this.richting = r;
    }

    public void loop()
    {
        positie.X += richting.getVerplaatsingX();
        positie.Y += richting.getVerplaatsingY();
    }
    
    public void eet(int hoeveelheid)
    {
        
    }
}

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
    int actueleEnergie;
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
        Positie vorige = new Positie();
        
        vorige.X = positie.X;
        vorige.Y = positie.Y;
        
        positie.X += richting.getVerplaatsingX();
        positie.Y += richting.getVerplaatsingY();
        
        // Als beest onvoldoende energie heeft dan moet deze binnen leefgebied blijven
//        if(actueleEnergie < (0.7 * maxEnergie))
//        {
//            if (positie.X >= 100 || positie.X < 0 || positie.Y >= 100 || positie.Y < 0)
//            {
//                this.positie = vorige;
//            }
//        }
    }
    
    public void eet(int hoeveelheid)
    {
        IGedrag gedrag = this.type.getGedrag();
        actueleEnergie = gedrag.eet(hoeveelheid, actueleEnergie);
        
    }
}

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
    int poten;
    int maxGewicht; 
    int maxEnergie;
    int actueleEnergie;
    Positie positie;
    Richting richting;
    
    /**
     * maak een beest object aan
     * @param type
     * @param startPositie
     * @param startRichting
     * @param poten
     * @param maxGewicht
     * @param maxEnergie 
     */
    public Beest(BeestType type, Positie startPositie, Richting startRichting, int poten, int maxGewicht, int maxEnergie) 
    {
        this.type = type;
        this.poten = poten;
        this.maxGewicht = maxGewicht;
        this.maxEnergie = maxEnergie;
        this.positie = startPositie;
        this.richting = startRichting;
    }
    
    /**
     * @return het type gedrag van het beest
     */
    public BeestType getType()
    {
        return this.type;
    }
    
    /**
     * @return het aantal poten van het beest
     */
    public int getPoten()
    {
        return this.poten;
    }
    
    /**
     * @return het maximale gewicht van het beest
     */
    public int getMaxGewicht() 
    {
        return maxGewicht;
    }

    /**
     * @return het maximale energie niveau van het beest.
     */
    public int getMaxEnergie() 
    {
        return maxEnergie;
    }

    /**
     * @return de positie van het beest.
     */
    public Positie getPositie() 
    {
        return positie;
    }

    /**
     * @return de richting van het beest
     */
    public Richting getRichting() 
    {
        return richting;
    }
    
    /**
     * set de richting van het beest
     * @param r 
     */
    public void setRichting(Richting r)
    {
        this.richting = r;
    }

    /**
     * deze methode laat het beest lopen
     */
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
    
    /**
     * laat het beest een hoeveelheid eten
     * @param hoeveelheid 
     */
    public void eet(int hoeveelheid)
    {
        IGedrag gedrag = this.type.getGedrag();
        actueleEnergie = gedrag.eet(hoeveelheid, actueleEnergie);
        
    }
}

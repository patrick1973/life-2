/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;

/**
 *
 * @author Bart Janisse
 */
public class WereldModel extends Observable {
    
    private ArrayList<Leefgebied> leefgebieden;
    Water water;
    //private ArrayList<Beest> water;
    
    public WereldModel() 
    {
        leefgebieden = new ArrayList<>();
        water = new Water();
        //water = new ArrayList<>();
    }
    
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
    
    public int getLeefgebiedBreedte()
    {
        return 350;
    }
    
    public int getLeefgebiedHoogte()
    {
        return 200;
    }
      
    public ArrayList<Leefgebied> getLeefgebieden()
    {
        return leefgebieden;
    }
    
    public ArrayList<Beest> getWater()
    {
        return water.getBeesten();
    }
    
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

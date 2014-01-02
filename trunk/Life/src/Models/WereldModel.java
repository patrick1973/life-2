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
    private ArrayList<Beest> water;
    
    public WereldModel() 
    {
        leefgebieden = new ArrayList<>();
    }
    
    public void setAantalElementen(int elementen)
    {
        int planten =    (int)(elementen * 0.3  / 2.0);
        int obstakels =  (int)(elementen * 0.1  / 2.0);
        int carnivoren = (int)(elementen * 0.4  / 2.0);
        int omnivoren =  (int)(elementen * 0.05 / 2.0);
        int herbivoren = (int)(elementen * 0.1  / 2.0);
        int nonivoren =  (int)(elementen * 0.05 / 2.0);
         
        leefgebieden.add(new Leefgebied(obstakels, planten, carnivoren, omnivoren, herbivoren, nonivoren));
        leefgebieden.add(new Leefgebied(obstakels, planten, carnivoren, omnivoren, herbivoren, nonivoren));
        
        this.setChanged();
        this.notifyObservers();
    }
    
    public int getLeefgebiedBreedte()
    {
        return 500;
    }
    
    public int getLeefgebiedHoogte()
    {
        return 400;
    }
      
     public ArrayList<Leefgebied> getLeefgebieden()
    {
        return leefgebieden;
    }
    
    public ArrayList<Beest> getWater()
    {
        return water;
    }
    
    public void simulatieStap()
    {
        for(Leefgebied leefgebied: leefgebieden)
        {
            leefgebied.simulatieStap();
        }
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author Bart Janisse
 */
public class Water {
    
    private ArrayList<Beest> beesten;
    
    public Water()
    {
        beesten = new ArrayList<>();
    }
    
    public ArrayList<Beest> getBeesten()
    {
        return beesten;
    }
    
    
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

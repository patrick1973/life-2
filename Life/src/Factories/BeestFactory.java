/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import Gedrag.CarnivoorGedrag;
import Gedrag.HerbivoorGedrag;
import Gedrag.NonivoorGedrag;
import Gedrag.OmnivoorGedrag;
import Models.Beest;

/**
 *
 * @author Bart Janisse
 */
public class BeestFactory {
    
    private static BeestFactory instance = new BeestFactory();
   
    private BeestFactory() {
    }
    
    public static BeestFactory getInstance(){
        return instance;
    }
    
    public Beest createBeest(Beesten beestType)
    {
        Beest beest = null;
        
        switch (beestType)
        {
            
            case OMNIVOOR : beest = new Beest(new OmnivoorGedrag());
                             break;

            case HERBIVOOR : beest = new Beest(new HerbivoorGedrag());
                             break;
         
            case CARNIVOOR : beest = new Beest(new CarnivoorGedrag());
                             break;    
                
            case NONIVOOR  : beest = new Beest(new NonivoorGedrag());
                             break; 
        }
        
        return beest;
    }
}

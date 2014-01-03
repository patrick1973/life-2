/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import Models.Plant;
import Models.Positie;

/**
 *
 * @author Bart Janisse
 */
public class PlantFactory {
    
    private static PlantFactory instance = new PlantFactory();
   
    /**
     * Private constructor
     */
    private PlantFactory() {}
    
    /**
     * @return een single instance van deze factory
     */
    public static PlantFactory getInstance(){
        return instance;
    }
    
    
    public Plant createPlant()
    {       
        // TODO hoe krijgen we de settings vanuit de GUI hier ?
        return new Plant(new Positie(), 1000);
    }
}

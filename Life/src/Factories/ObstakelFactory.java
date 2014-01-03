/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import Models.Obstakel;
import Models.Positie;

/**
 *
 * @author Bart Janisse
 */
public class ObstakelFactory {
    
    private static ObstakelFactory instance = new ObstakelFactory();
   
    /**
     * Private constructor
     */
    private ObstakelFactory() {}
    
    /**
     * @return een single instance van deze factory
     */
    public static ObstakelFactory getInstance(){
        return instance;
    }
    
    
    public Obstakel createObstakel()
    {       
        return new Obstakel(new Positie());
    }
}

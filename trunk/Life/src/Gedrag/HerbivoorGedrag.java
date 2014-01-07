/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gedrag;

import Models.Plant;

/**
 *
 * @author Bart Janisse
 */
public class HerbivoorGedrag implements IGedrag {

    public HerbivoorGedrag() {
  
    }

    @Override
    public int eet(int actueleEnergie, int hoeveelheid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   @Override
    public int eetPlant(int actueleEnergie, Plant plant) 
   {
        plant.gegetenWorden(10);
        return actueleEnergie + 10;
    }
    
}

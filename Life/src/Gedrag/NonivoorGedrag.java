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
public class NonivoorGedrag implements IGedrag {

    @Override
    public int eet(int actueleEnergie, int hoeveelheid) {
        return -1;
    }

    @Override
    public int eetPlant(int actueleEnergie, Plant plant) {
        return -1;
    }
    
}

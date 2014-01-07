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
public interface IGedrag {
    public int eet(int actueleEnergie, int hoeveelheid);
    public int eetPlant(int actueleEnergie, Plant plant);
}

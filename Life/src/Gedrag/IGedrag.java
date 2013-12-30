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
    public String getType();
    public void eet(int hoeveelheid);
    public void eetPlant(Plant plant);
}

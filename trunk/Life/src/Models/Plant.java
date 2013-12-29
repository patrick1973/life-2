/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Bart Janisse
 */
public class Plant {

    int voedingswaarde;
    
    public Plant(int startvoedingswaarde) {
        this.voedingswaarde = startvoedingswaarde;
    }
    
    public void gegetenWorden(int voedingswaarde)
    {
        this.voedingswaarde -= voedingswaarde;
    }
}

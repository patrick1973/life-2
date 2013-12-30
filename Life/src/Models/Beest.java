/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor. zsdasds
 */
package Models;

import Gedrag.IGedrag;

/**
 *
 * @author Bart Janisse
 */
public class Beest {

    IGedrag gedrag;
    
    public Beest(IGedrag g) {
        this.gedrag = g;
    }
    
    public IGedrag getGedrag()
    {
        return gedrag;
    }

}

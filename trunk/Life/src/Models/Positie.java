/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 * Algemene klasse voor de XY positie van bijvoorbeeld beesten planten en obstakels
 */
public class Positie {

    private int x;
    private int y;
    
    /**
     * Constructor voor een positie object
     * @param x de beginwaarde voor x
     * @param y de beginwaarde voor y
     */
    public Positie(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }
    
    /**
     * 
     * @return de x-positie
     */
    public int getX()
    {
        return this.x;
    }
    
    /**
     * 
     * @return de y-positie
     */
    public int getY()
    {
        return this.y;
    }
    
}

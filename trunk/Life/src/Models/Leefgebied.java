/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author Bart Janisse
 */
public class Leefgebied {

    private ArrayList<Beest> beesten;
    private ArrayList<Plant> planten;
    private ArrayList<Obstakel> obstakels;
    
    private final int[][] gebied;
            
    public Leefgebied(int obstakels, int planten, int carnivoren, int omnivoren, int herbivoren, int nonivoren) 
    {
        this.beesten = new ArrayList<>();
        this.planten = new ArrayList<>();
        this.obstakels = new ArrayList<>();
        
        // TODO de moet variabel worden 
        gebied = new int[100][100];
    }
    
    public void simulatieStap()
    {
        
    }
}

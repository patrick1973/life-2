/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Random;

/**
 * Algemene klasse voor de XY positie van bijvoorbeeld beesten planten en obstakels
 */
public class Positie {

    int posX; 
    int posY;
    
    private final Random RANDOM = new Random();
     
    public Positie() 
    {
         posX = RANDOM.nextInt(500);
         posY = RANDOM.nextInt(400); 
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }


}

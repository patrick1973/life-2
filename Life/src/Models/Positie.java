package Models;

import java.util.Random;

/**
 * Algemene klasse voor de XY positie van bijvoorbeeld beesten planten en 
 * obstakels. Als de klasse geinstantieerd wordt dan wordt voor X en Y een
 * random waarde genomen.
 */
public class Positie {

    int X; 
    int Y;
    
    private final Random ramdom = new Random();
    
    /*
     * Aanroepen van de constructor zorgt voor random X en Y waarden
     */
    public Positie() 
    {
         X = ramdom.nextInt(500);
         Y = ramdom.nextInt(400); 
    }
    
    /*
     * Geeft de actuele X waarde terug
     */
    public int getX() 
    {
        return X;
    }

    /*
     * Stelt de actuele X waarde in
     */
    public void setX(int posX) 
    {
        this.X = posX;
    }

    /*
     * Geeft de actuele Y waarde terug
     */
    public int getY() 
    {
        return Y;
    }

    /*
     * Stelt de actuele Y waarde in
     */
    public void setY(int posY) 
    {
        this.Y = posY;
    }


}

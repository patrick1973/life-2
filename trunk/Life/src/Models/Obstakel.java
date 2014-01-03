package Models;

/**
 *
 * @author Bart Janisse
 */
public class Obstakel 
{    
    int posX;
    int posY;

    public Obstakel(Positie pos) 
    {
        this.posX = pos.getX();
        this.posY = pos.getY();
    }
    
    public int getX() 
    {
        return posX;
    }

    public int getY() 
    {
        return posY;
    }
}

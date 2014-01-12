package Models;

/**
 * @author Bart Janisse
 */
public class Obstakel 
{    
    int posX;
    int posY;

    /**
     * maak een obstakel aan met een gegeven positie
     * @param pos 
     */
    public Obstakel(Positie pos) 
    {
        this.posX = pos.getX();
        this.posY = pos.getY();
    }
    
    /**
     * @return de positieX van het obstakel
     */
    public int getX() 
    {
        return posX;
    }

    /**
     * @return de positieY van het obstakel
     */
    public int getY() 
    {
        return posY;
    }
}

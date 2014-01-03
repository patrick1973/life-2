package Models;

/**
 *
 * @author Bart Janisse
 */
public class Plant 
{
    int voedingswaarde;
    int posX;
    int posY;
    
    public Plant(Positie pos, int startvoedingswaarde) 
    {
        this.posX = pos.getX();
        this.posY = pos.getY();
        this.voedingswaarde = startvoedingswaarde;
    }

    public int getX() 
    {
        return posX;
    }

    public int getY() 
    {
        return posY;
    }
    
    public void gegetenWorden(int voedingswaarde)
    {
        // TODO Mogen we onder 0 komen ?
        this.voedingswaarde -= voedingswaarde;
    }
}

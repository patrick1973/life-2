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
    
    /**
     * creert een plant met een positie en een start voedingswaarde
     * @param pos
     * @param startvoedingswaarde 
     */
    public Plant(Positie pos, int startvoedingswaarde) 
    {
        this.posX = pos.getX();
        this.posY = pos.getY();
        this.voedingswaarde = startvoedingswaarde;
    }

    /**
     * @return de positieX van de plant
     */
    public int getX() 
    {
        return posX;
    }

    /**
     * @return de positieY van de plant
     */
    public int getY() 
    {
        return posY;
    }
    
    /**
     * Laat de voedingswaarde van de plant afnemen als deze wordt gegeten.
     * @param voedingswaarde 
     */
    public void gegetenWorden(int voedingswaarde)
    {
        // TODO Mogen we onder 0 komen ?
        this.voedingswaarde -= voedingswaarde;
    }
}

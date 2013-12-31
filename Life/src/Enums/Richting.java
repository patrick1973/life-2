package Enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * Richting wordt gebruikt voor beesten. 
 */
public enum Richting {

    N(0,-1), Z(0,1), O(1,0), W(-1,0), 
    NO(1,-1), NW(-1,-1), ZO(1,1), ZW(-1,1);
    
    private static final List<Richting> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    private final int X;
    private final int Y;
    
    private Richting(int xPos, int ypos)
    {
        X = xPos;
        Y = ypos;
    }
    
    /*
     * Geeft een random richting
     */
    public static Richting getRandom()
    {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
    
    public int getVerplaatsingX()
    {
        return X;
    }
    
    public int getVerplaatsingY()
    {
        return Y;
    }
}

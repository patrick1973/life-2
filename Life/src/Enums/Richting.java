/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Bart Janisse
 */
public enum Richting {

    N, Z, O, W, NO, NW, ZO, ZW;
    
    private static final List<Richting> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    private Richting()
    {
    }
    
    public static Richting getRandom()
    {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}

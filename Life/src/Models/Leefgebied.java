/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Enums.BeestType;
import Factories.BeestFactory;
import Factories.ObstakelFactory;
import Factories.PlantFactory;
import java.util.ArrayList;

/**
 *
 * @author Bart Janisse
 */
public class Leefgebied {

    private static final int SIZE_X = 100;
    private static final int SIZE_Y = 200;
    
    private int topX;
    private int topY;
    private ArrayList<Beest> beesten;
    private ArrayList<Plant> planten;
    private ArrayList<Obstakel> obstakels;
    
    //private final int[][] gebied;
            
    public Leefgebied(Positie p, int obstakelAantal, int plantAantal, int carnivoorAantal, int omnivoorAantal, int herbivoorAantal, int nonivoorAantal) 
    {              
        this.topX = p.X;
        this.topY = p.Y;
        
        this.beesten = new ArrayList<>();
        this.planten = new ArrayList<>();
        this.obstakels = new ArrayList<>();
        
        //gebied = new int[SIZE_X][SIZE_Y];
        
        maakBeesten(BeestType.CARNIVOOR, carnivoorAantal);
        maakBeesten(BeestType.OMNIVOOR,  omnivoorAantal);
        maakBeesten(BeestType.HERBIVOOR, herbivoorAantal);
        maakBeesten(BeestType.NONIVOOR,  nonivoorAantal);
        maakPlanten(plantAantal);
        maakObstakels(obstakelAantal);   
    }

    public int getTopX() {
        return topX;
    }

    public int getTopY() {
        return topY;
    }

    
    
    public ArrayList<Beest> getBeesten() {
        return beesten;
    }
    
    public ArrayList<Plant> getPlanten() {
        return planten;
    }
    
    public ArrayList<Obstakel> getObstakels() {
        return obstakels;
    }
    
    
    private void maakBeesten(BeestType type, int aantal)
    {
        BeestFactory factory = BeestFactory.getInstance();  
        
        for(int i=0; i < aantal; i++)
        {            
            beesten.add(factory.createBeest(type));
        }
    }
    
    private void maakPlanten(int aantal) 
    {
        PlantFactory factory = PlantFactory.getInstance();  
        
        for(int i=0; i < aantal; i++)
        {            
            planten.add(factory.createPlant());
        }
        
    }
    
    private void maakObstakels(int aantal) 
    {
        ObstakelFactory factory = ObstakelFactory.getInstance();  
        
        for(int i=0; i < aantal; i++)
        {            
            obstakels.add(factory.createObstakel());
        }
        
    }
    
    /**
     * De simulatie stap loopt door de lijst met beesten heen en laat ieder
     * beest een keer lopen. Als een beest buiten het leefgebied komt dan 
     * wordt deze toegevoegd aan de lijst met afgevallen beesten en tevens wordt 
     * het beest uit de lijst leefgebied verwijderd.
     * 
     * @return de lijst met beesten die buiten het leefgebied gekomen zijn.
     */
    public ArrayList<Beest> simulatieStap()
    {
        // TODO afhandelen hoe om te gaan met obstakels
        ArrayList<Beest> afgevallenBeesten = new ArrayList<>();
                
        for(Beest beest : beesten )
        {
            beest.loop();
            
            if(beest.getPositie().X >= SIZE_X || beest.getPositie().X < 0 ||
               beest.getPositie().Y >= SIZE_Y || beest.getPositie().Y < 0)
            {
                if(beest.getPositie().X >= SIZE_X || beest.getPositie().X < SIZE_X || beest.getPositie().Y >= SIZE_Y || beest.getPositie().Y < 0)
                {
                    beest.getPositie().X += topX;
                    beest.getPositie().Y += topY;
                }
                
                afgevallenBeesten.add(beest);
            }
        }
        
        for(Beest beest : afgevallenBeesten)
        {
            beesten.remove(beest);
        }
        
        return afgevallenBeesten;
    }

    
}

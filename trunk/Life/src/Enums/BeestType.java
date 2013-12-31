/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;

import Gedrag.CarnivoorGedrag;
import Gedrag.HerbivoorGedrag;
import Gedrag.IGedrag;
import Gedrag.NonivoorGedrag;
import Gedrag.OmnivoorGedrag;

/**
 *
 * @author Bart Janisse
 */
 public enum BeestType 
 {
     OMNIVOOR (new OmnivoorGedrag()), 
     HERBIVOOR(new HerbivoorGedrag()), 
     CARNIVOOR(new CarnivoorGedrag()), 
     NONIVOOR (new NonivoorGedrag()); 
     
     private final IGedrag gedrag;
     
     private BeestType(IGedrag g)
     {
         this.gedrag = g;
     }
 
     /**
      * @return het gedrag dat bij het type beest hoort
      */
     public IGedrag getGedrag()
     {
         return this.gedrag;
     }
}
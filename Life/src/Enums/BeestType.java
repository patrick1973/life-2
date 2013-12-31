package Enums;

import Gedrag.CarnivoorGedrag;
import Gedrag.HerbivoorGedrag;
import Gedrag.IGedrag;
import Gedrag.NonivoorGedrag;
import Gedrag.OmnivoorGedrag;

/*
 * Enumeratie met voor ieder beest een type. Bij het beesttype wordt
 * ook het gedrag vastgelegd.
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
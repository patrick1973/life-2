/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Bart Janisse
 */
public class OmnivoorGedrag implements IGedrag {

    String type;
    
    public OmnivoorGedrag(String type) {
  
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void eet(int hoeveelheid) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eetPlant(Plant plant) {
        plant.gegetenWorden(20);
    }
    
    
}

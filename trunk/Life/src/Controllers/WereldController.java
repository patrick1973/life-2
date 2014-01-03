/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.WereldModel;
import java.util.Observer;
import javax.swing.JPanel;

/**
 *
 * @author Bart Janisse
 */
public class WereldController {
    
    WereldModel model;
    Observer view;

    public WereldController(Observer view) {
        this.view = view;
    }
    
    
    
    public void cmdLaadSimulatie()
    {     
    }
    
    public void cmdSaveSimulatie()
    {  
    }
    
    public void cmdNieuweSimulatie()
    {
       model = new WereldModel();  
       model.addObserver(view);
       
       model.setAantalElementen(250);
    }
    
    public void cmdStartSimulatie()
    {
        
    }
    
    public void cmdPauzeSimulatie()
    {
        
    }
    
    public void cmdSetSnelheid(int s)
    {
        
    }
    
    public void cmdExit()
    {
        System.exit(0);
    }
}

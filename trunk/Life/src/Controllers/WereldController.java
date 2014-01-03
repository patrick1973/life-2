/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.WereldModel;
import java.util.Observer;
import javax.swing.JOptionPane;

/**
 *
 * @author Bart Janisse
 */
public class WereldController extends Thread{
    
    WereldModel model;
    Observer view;
    int simulatieSnelheid = 1500;
    boolean simulatieLoopt = false;
   

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
       model.setAantalElementen(500);
       
    }
    
    /**
     * start de simulatie, dit wordt gedaan dmv een thread te starten.
     * indien de boolean simulatieLoopt hoog is kan de thread niet opniew gestart
     * worden.
     */
    public void cmdStartSimulatie()
    {
        try 
        {
           if (!simulatieLoopt)
           {
                this.start();
           }
            
            simulatieLoopt= true;
        }
        catch ( IllegalThreadStateException ex)
        {
           JOptionPane.showMessageDialog(null,"Er is iets mis gegaan met het starten van de Thread","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void cmdPauzeSimulatie()
    {
        
    }
    
    public void cmdSetSnelheid(int s)
    {
        this.simulatieSnelheid = s;
    }
    
    public void cmdExit()
    {
        System.exit(0);
    }

    @Override
    public void run() {
        try
            {
                while (true)
               { 
                   model.simulatieStap();
                   Thread.sleep(this.simulatieSnelheid);   
                }
            }
            catch(InterruptedException ex)
            {
                JOptionPane.showMessageDialog(null,"Er is iets mis gegaan met Threads : " + ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
            }
            catch (Exception ex)
            {
                JOptionPane.showMessageDialog(null,"Er is iets mis gegaan : " + ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
            }
    }
    
}

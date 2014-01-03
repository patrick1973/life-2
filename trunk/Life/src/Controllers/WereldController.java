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
    Thread simulatieThread;

   
    //constructor
    public WereldController(Observer view) {
        this.view = view;
        
    }

    //properties
    public boolean getSimulatieLoopt()
    {
        return simulatieLoopt;
    }
    
    
    //methodes
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
     * Bij het starten van de simulatie wordt een neiwue thread aan gemaakt.
     */
    public void cmdStartSimulatie()
    {
        try 
        {
           if (!simulatieLoopt)
           {
               simulatieThread = new Thread(this);
               simulatieThread.start();
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
        try {
            Thread.currentThread().interrupt();
            simulatieLoopt = false;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Er is iets mis gegaan met het pauzeren van de Thread : "+ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
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
                while (!Thread.currentThread().isInterrupted() && simulatieLoopt)
               { 
                   model.simulatieStap();
                   this.sleep(this.simulatieSnelheid); 
                }
            }
            catch(InterruptedException ex)
            {
                JOptionPane.showMessageDialog(null,"Er is iets mis gegaan met Threads : " + ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
            }
            finally
            {                
            }
    }
    
}

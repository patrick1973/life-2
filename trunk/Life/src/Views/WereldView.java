/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Models.WereldModel;
import java.awt.Color;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;

/**
 *
 * @author Bart Janisse
 */
public class WereldView extends javax.swing.JPanel implements Observer{
  

    JPanel leefgebied_links;
    JPanel leefgebied_rechts;
     
    /**
     * Creates new form WereldView
     */
    public WereldView() {
        initComponents();
        this.setBackground(Color.blue);
        
        leefgebied_links = new JPanel(true);
        leefgebied_links.setVisible(true);
        leefgebied_links.setBackground(Color.WHITE);
        
        leefgebied_rechts = new JPanel(true);
        leefgebied_rechts.setVisible(true);
        leefgebied_rechts.setBackground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 903, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        
        WereldModel model = (WereldModel)o;
              
        if(model != null)
        {
            leefgebied_links.setBounds(110, 110, model.getLeefgebiedBreedte(), model.getLeefgebiedHoogte());
            leefgebied_rechts.setBounds(750, 110, model.getLeefgebiedBreedte(), model.getLeefgebiedHoogte());

            this.add(leefgebied_links);
            this.add(leefgebied_rechts);  

            this.repaint();
        }
    }
    
}
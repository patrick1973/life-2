/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI_algemeen;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

/**
 *
 * @author patje
 */
public class SimulatieGegevensDialog extends javax.swing.JDialog {
    
        private final instellingenBeest instellingenCarnivoor     = new instellingenBeest();
        private final instellingenBeest instellingenOmnivoor      = new instellingenBeest();
        private final instellingenBeest instellingenHerbivoor     = new instellingenBeest();
        private final instellingenBeest instellingenNonivoor      = new instellingenBeest();
        private final instellingenPlant instellingenPlanten       = new instellingenPlant();

    /**
     * A return status code - returned if Cancel button has been pressed
     */
    public static final int RET_CANCEL = 0;
    /**
     * A return status code - returned if OK button has been pressed
     */
    public static final int RET_OK = 1;

    /**
     * Creates new form NewOkCancelDialog
     */
    public SimulatieGegevensDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        // met onderstaande regel wordt de lokatie van de dialog in het midden van het scherm gezet.
        this.setLocationRelativeTo(null);
        
        this.addTabs();

        // Close the dialog when Esc is pressed
        String cancelName = "cancel";
        InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), cancelName);
        ActionMap actionMap = getRootPane().getActionMap();
        actionMap.put(cancelName, new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                doClose(RET_CANCEL);
            }
        });
    }

    /**
     * @return the return status of this dialog - one of RET_OK or RET_CANCEL
     */
    public int getReturnStatus() {
        return returnStatus;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(725, 500));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Instellingen voor het aanmaken van een nieuwe simulatie");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelButton, okButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(okButton))
                .addContainerGap())
        );

        getRootPane().setDefaultButton(okButton);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        if ((this.getCarnivoorAantalPoten() > 0) && (this.getHerbivoorAantalPoten()>0) && (this.getOmnivoorAantalPoten()>0) && (this.getNonivoorAantalPoten()>0))
        doClose(RET_OK);
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        doClose(RET_CANCEL);
    }//GEN-LAST:event_cancelButtonActionPerformed

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog
    
    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SimulatieGegevensDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimulatieGegevensDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimulatieGegevensDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimulatieGegevensDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SimulatieGegevensDialog dialog = new SimulatieGegevensDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables

    private int returnStatus = RET_CANCEL;
    
    private void addTabs()
    {
        
        
        
        ImageIcon iconPlant     = new ImageIcon(getClass().getResource("groen.png"));
        ImageIcon iconCanivoor  = new ImageIcon(getClass().getResource("rood.png"));
        ImageIcon iconOmnivoor  = new ImageIcon(getClass().getResource("geel.png"));
        ImageIcon iconHerbivoor = new ImageIcon(getClass().getResource("bruin.png"));
        ImageIcon iconNonivoor  = new ImageIcon(getClass().getResource("paars.png"));
        
        this.jTabbedPane1.addTab("Carnivoor  ",iconCanivoor, instellingenCarnivoor);
        this.jTabbedPane1.addTab("Omnivoor  ", iconOmnivoor, instellingenOmnivoor);
        this.jTabbedPane1.addTab("Herbivoor  ", iconHerbivoor, instellingenHerbivoor);
        this.jTabbedPane1.addTab("Nonivoor  ", iconNonivoor, instellingenNonivoor);
        this.jTabbedPane1.addTab("Plant  ",iconPlant, instellingenPlanten);
        
        // laad init waarde
       instellingenCarnivoor.setAantalPoten(4);
       instellingenCarnivoor.setMaxGewicht(30);
       instellingenCarnivoor.setMaxEnergie(100);
       
       instellingenOmnivoor.setAantalPoten(2);
       instellingenOmnivoor.setMaxGewicht(37);
       instellingenOmnivoor.setMaxEnergie(150);
       
       instellingenHerbivoor.setAantalPoten(1);
       instellingenHerbivoor.setMaxGewicht(50);
       instellingenHerbivoor.setMaxEnergie(100);
       
       instellingenNonivoor.setAantalPoten(50);
       instellingenNonivoor.setMaxGewicht(130);
       instellingenNonivoor.setMaxEnergie(200);
       
    }
    /**
     * retourneerd het ingevoerde aantal poten van een Carnivoor
     * @return 
     */
    public int getCarnivoorAantalPoten()
    {
        return this.instellingenCarnivoor.getAantalPoten();
    }
    /**
     * retourneerd het ingevoerde maximale gewicht van een Carnivoor
     * @return 
     */
    public int getCarnivoorMaxGewicht()
    {
        return this.instellingenCarnivoor.getMaximaalGewicht();
    }
    /**
     * retourneerd het ingevoerde maximale energie niveau van een Carnivoor
     * @return 
     */
    public int getCarnivoorMaxEnergie()  
    {
        return this.instellingenCarnivoor.getMaximaalEnergie();
    }
    
    /**
     * retourneerd het ingevoerde aantal poten van een Herbivoor
     * @return 
     */
    public int getHerbivoorAantalPoten()
    {
        return this.instellingenHerbivoor.getAantalPoten();
    }
    /**
     * retourneerd het ingevoerde maximale gewicht van een Herbivoor
     * @return 
     */
    public int getHerbivoorMaxGewicht()
    {
        return this.instellingenHerbivoor.getMaximaalGewicht();
    }
    /**
     * retourneerd het ingevoerde maximale energie niveau van een Herbivoor
     * @return 
     */
    public int getHerbivoorMaxEnergie()
    {
        return this.instellingenHerbivoor.getMaximaalEnergie();
    }
     
    /**
     * retourneerd het ingevoerde aantal poten van een Omnivoor
     * @return 
     */
    public int getOmnivoorAantalPoten()
    {
        return this.instellingenOmnivoor.getAantalPoten();
    }
    /**
     * retourneerd het ingevoerde maximale gewicht van een Omnivoor
     * @return 
     */
    public int getOmnivoorMaxGewicht()
    {
        return this.instellingenOmnivoor.getMaximaalGewicht();
    }
    /**
     * retourneerd het ingevoerde maximale energie niveau van een Omnivoor
     * @return 
     */
    public int getOmnivoorMaxEnergie() 
    {
       return this.instellingenOmnivoor.getMaximaalEnergie();
    }
    
    /**
     * retourneerd het ingevoerde aantal poten van een Nonivoor
     * @return 
     */
    public int getNonivoorAantalPoten()
    {
        return this.instellingenNonivoor.getAantalPoten();
    }
    /**
     * retourneerd het ingevoerde maximale gewicht van een Nonivoor
     * @return 
     */
    public int getNonivoorMaxGewicht()
    {
        return this.instellingenNonivoor.getMaximaalGewicht();
    }
    /**
     * retourneerd het ingevoerde maximale energie niveau van een Nonivoor
     * @return 
     */
    public int getNonivoorMaxEnergie() 
    {
        return this.instellingenNonivoor.getMaximaalEnergie();
    }
}
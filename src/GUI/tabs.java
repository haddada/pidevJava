/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author seif
 */
import com.alee.laf.WebLookAndFeel;
import com.alee.laf.panel.WebPanel;
import com.alee.laf.tabbedpane.TabbedPaneStyle;
import com.alee.laf.tabbedpane.WebTabbedPane;
import javax.swing.*;
import java.awt.*;

public class tabs extends javax.swing.JFrame {

    /**
     * Creates new form tabs
     */
    private WebTabbedPane tabbedPane;
    private JPanel superGUI;
    private JPanel addAdmin;
    private JPanel panel3;

    public tabs() {
		// NOTE: to reduce the amount of code in this example, it uses
        // panels with a NULL layout.  This is NOT suitable for
        // production code since it may not display correctly for
        // a look-and-feel.

        setTitle("Dashboard");
        setSize(700, 800);
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        getContentPane().add(topPanel);

        // Create the tab pages
        createPage1();
        createPage2();
        createPage3();

        // Create a tabbed pane
        tabbedPane = new WebTabbedPane();
        tabbedPane.setTabPlacement(WebTabbedPane.LEFT);
     
        tabbedPane.addTab("Administrateur                 ", superGUI);
       // tabbedPane.addTab("Ajouter Admin                ", addAdmin);
        tabbedPane.addTab("Page 3                ", panel3);

                //style de pannel
        tabbedPane.setPreferredSize(new Dimension(500, 200));
        tabbedPane.setTabbedPaneStyle(TabbedPaneStyle.attached);
        final WebPanel tabPanel = new WebPanel(true, tabbedPane);
        tabPanel.setPaintFocus(true);
        topPanel.add(tabbedPane, BorderLayout.CENTER);
        
       
       
        
    }

    public void createPage1() {
        superGUI = new SuperGUI();
        
    }

    public void createPage2() {
       // addAdmin=new AddAdmin();
    
    }

    public void createPage3() {
        panel3 = new JPanel();
        panel3.setLayout(new GridLayout(3, 2));

        panel3.add(new JLabel("Field 1:"));
        panel3.add(new TextArea());
        panel3.add(new JLabel("Field 2:"));
        panel3.add(new TextArea());
        panel3.add(new JLabel("Field 3:"));
        panel3.add(new TextArea());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(tabs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                WebLookAndFeel.install();
                
                new tabs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
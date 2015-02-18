/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import DAO.ClientDAO;
import Technique.ClientAdapter;
import Technique.ClientAdapter2;
import Technique.ClientAdapter3;
import Technique.ClientAdapter4;
import Technique.ClientAdapter5;
import Technique.ClientAdapter6;
import com.alee.laf.WebLookAndFeel;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
/**
 *
 * @author user
 */
public class Client extends javax.swing.JFrame {
    
    /**
     * Creates new form NewJFrame
     */

    
    public Client() throws URISyntaxException {
        initComponents();
         this.createImm();
    }
    
    protected void createImm() throws URISyntaxException{
         ImageIcon icon=new ImageIcon();
       
        photoPanel.removeAll();
      
          
            icon = createImageIcon("/images/admin.png", "icon");
            
            JLabel iconLabel = new JLabel(icon, JLabel.LEFT);
            photoPanel.setLayout(null);
            iconLabel.setBounds(0, 0, 500, 500);
            photoPanel.add(iconLabel);
    }

    protected ImageIcon createImageIcon(String path,
            String description) throws  URISyntaxException {
        
        String imgURL = new URI(path).getPath();
        
       
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }

        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        buttonGroup2 = new javax.swing.ButtonGroup();
        photoPanel = new javax.swing.JPanel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout photoPanelLayout = new javax.swing.GroupLayout(photoPanel);
        photoPanel.setLayout(photoPanelLayout);
        photoPanelLayout.setHorizontalGroup(
            photoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 808, Short.MAX_VALUE)
        );
        photoPanelLayout.setVerticalGroup(
            photoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(photoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(photoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * @param args the command line arguments
     */
    public static void main ( final String[] args )
    {
        SwingUtilities.invokeLater ( new Runnable ()
        {
            
            @Override
            public void run ()
            {
               // Look and Feel 
               WebLookAndFeel.install ();  
               WebLookAndFeel.setDecorateAllWindows(true);
                try {
                    //Open Login Frame
                    new Client().setVisible(true);
                } catch (URISyntaxException ex) {
                    Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                }
               }
        });
    }
             
            
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JPanel photoPanel;
    // End of variables declaration//GEN-END:variables

    private Connection MyConnection() {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
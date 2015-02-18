/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;


import DAO.OffreDAO;
import Entity.Offre;
import com.alee.extended.filechooser.WebFileDrop;
import com.alee.extended.image.WebDecoratedImage;
import com.alee.extended.panel.GroupPanel;
import com.alee.extended.panel.GroupingType;
import com.alee.global.GlobalConstants;
import com.alee.global.StyleConstants;
import com.alee.laf.WebLookAndFeel;
import com.alee.laf.button.WebButton;
import com.alee.laf.checkbox.WebCheckBox;
import com.alee.laf.filechooser.WebFileChooser;
import com.alee.laf.label.WebLabel;
import com.alee.laf.panel.WebPanel;
import com.alee.laf.progressbar.WebProgressBar;
import com.alee.laf.radiobutton.WebRadioButton;
import com.alee.laf.rootpane.WebFrame;
import com.alee.laf.scroll.WebScrollPane;
import com.alee.laf.toolbar.WhiteSpace;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

/**
 *
 * @author FATHLLAH Wael
 */
public class MainOffre {
    
    
   public static JFrame ListOfOffresFrame;
    final static JFrame prog = new JFrame();
    public final static JPanel fm = new JPanel();
    public static JPanel gfl= new JPanel();
    public static final WebPanel gf2= new WebPanel();
    final static WebPanel fm1 = new WebPanel();
    static int nbrpage =1;
    public static void main(final String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                WebLookAndFeel.install();
                WebLookAndFeel.setDecorateAllWindows(true);
                openPleaseWait();
                try {
                    openListOfOffresFrame();
                } catch (IOException ex) {
                    Logger.getLogger(ListOfOffres.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Create Single offres panel
    

    // Create Single offres panel
    public static WebPanel createAdminPanel(final String url, final String firstName, String lastName, final int id) throws IOException {

        final WebPanel offresPanel = new WebPanel(true);
        offresPanel.setPaintFocus(true);


        final WebPanel descPanel = new WebPanel(false);
         
        GroupPanel OffrePanel = new GroupPanel(GroupingType.fillFirst, 5, false);
       
        
        descPanel.setOpaque(false);
        descPanel.setMargin(50, 50, 50, 50);
        offresPanel.setPaintFocus(true);
        offresPanel.setMargin(10);
        
        // load the image once
        String longd ="36.7948829";
        String Laltd ="10.1432776";
        offresPanel.setPreferredSize(new Dimension(300, 100)); 
        OffrePanel.add(new GroupPanel(GroupingType.fillFirst, 5,false, new WhiteSpace(), new WhiteSpace(50),
                    
                    //loadImageX(url),descPanel,loadImageX("http://maps.googleapis.com/maps/api/staticmap?center="+longd+","+Laltd+"&zoom=15&scale=1&size=600x300&maptype=roadmap&format=png&visual_refresh=true&markers=icon:d%7Cshadow:false%7C"+longd+","+Laltd),
                    new WhiteSpace(50)));
        offresPanel.add(OffrePanel);
        return offresPanel;
    }

    // Open list of offres frame 
    public static void openListOfOffresFrame() throws IOException {

        new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {

                // do some processing here while the progress bar is running
                fm.setSize(500, 500);
                fm.setLocation(300, 200);
                fm.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                fm.setLayout(new GridLayout(1, 1, 5, 5));
                try {
                    fm1.add(createAdminPanel("","","",0));
                    fm.add(fm1);
                } catch (IOException ex) {
                    Logger.getLogger(ListOfOffres.class.getName()).log(Level.SEVERE, null, ex);
                }

                return null;
            }

            ;

        // this is called when doInBackground finished
        @Override
            protected void done() {
            //Background processing done
                //Crate new Frale and confagurated
                ListOfOffresFrame = new JFrame();
                ListOfOffresFrame.setMaximizedBounds(null);
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                ListOfOffresFrame.setMinimumSize(dim);
                ListOfOffresFrame.setTitle("T_IMMOB");
                ListOfOffresFrame.setLayout(new GridLayout(1, 0));
                
                ListOfOffresFrame.setLocation(0, 0);
                ListOfOffresFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                try {
                    gfl = new ListOfOffres1().createListOfOffresPanel();
                } catch (IOException ex) {
                    Logger.getLogger(MainOffre.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MainOffre.class.getName()).log(Level.SEVERE, null, ex);
                }
                gf2.add(new GroupPanel(GroupingType.fillLast, 0, false,fm,new WhiteSpace(), gfl));
                ListOfOffresFrame.add(gf2);
                ListOfOffresFrame.setPreferredSize(dim);
                ListOfOffresFrame.setExtendedState(Frame.MAXIMIZED_BOTH);
                ListOfOffresFrame.setVisible(true);
                prog.setVisible(false);
            }
        ;
    }
    .execute();       
    }
    //
    // Open list of offres frame 
    static void openListOfOffresFrameagn() throws IOException {

        new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {

           // do some processing here while the progress bar is running
                try {
                    fm.remove(fm1);
                    fm1.removeAll();
                    fm1.add(createAdminPanel("","","",0));
                    fm.add(fm1);
                    fm.revalidate();
                    fm.repaint();
                } catch (IOException ex) {
                    Logger.getLogger(ListOfOffres.class.getName()).log(Level.SEVERE, null, ex);
                }

                return null;
            }

            ;

        // this is called when doInBackground finished
        @Override
            protected void done() {
                //Background processing done            
                prog.setVisible(false);

            }
        ;
    }

    .execute();
        
    }
    //Wait for loading Content
    static void openPleaseWait() {
        WebProgressBar progressBar3 = new WebProgressBar();
        progressBar3.setIndeterminate(true);
        progressBar3.setStringPainted(true);
        progressBar3.setString("Please wait...");
        
        prog.setSize(500, 100);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        prog.setLocation((dim.width / 2) - 250, 250);
        prog.add(progressBar3);
        
        //WebLookAndFeel.setDecorateAllWindows(true);
        prog.setVisible(true);
        
    }
    //Wait for loading Content
    static WebPanel loadImageX(String urlImage) throws IOException {
        WebPanel imagePanel = new WebPanel();
                
        try {
            BufferedImage bi = ImageIO.read(new URL(urlImage));
            ImageIcon img = new ImageIcon(bi);
            WebDecoratedImage img2 = new WebDecoratedImage(img);
            img2.setShadeWidth(0);
            imagePanel.add(img2);
            imagePanel.setOpaque(false);
            
        } catch (IOException e) {
            //or open no image found image
            BufferedImage image = ImageIO.read(new File("resources/no-image-found.jpg"));
            ImageIcon i1 = new ImageIcon(image);
            WebDecoratedImage img2 = new WebDecoratedImage(i1);
            img2.setShadeWidth(0);   
            imagePanel.add(img2);
            imagePanel.setOpaque(false);
            
         
        }
        return imagePanel;
        
    }
}

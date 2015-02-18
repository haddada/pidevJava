/*
 * The content is available under the terms of the Creative Commons 
 * Attribution-ShareAlike license (CC-BY-SA), v2.5 or any later version
 */
package GUI;

import DAO.OffreDAO;
import Entity.Offre;
import static GUI.ListOfOffres.nbrpage;
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
import com.alee.laf.scroll.WebScrollPane;
import com.alee.laf.text.WebTextField;
import com.alee.laf.toolbar.WhiteSpace;
import com.alee.utils.FileUtils;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
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
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

/**
 *
 * @author ulrich blanchard
 */
public class AddOffre {

    public static JFrame ListOfOffresFrame;
    final static JFrame prog = new JFrame();
    final static JPanel f = new JPanel();
    final static WebPanel f1 = new WebPanel();
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
    private static WebPanel createListOfOffresPanel() throws IOException, InterruptedException {
        WebPanel panel = new WebPanel();
        //Geting data from database
        //List<Offre> tt = new OffreDAO().getAllListOfOffre();
        final GroupPanel ListOfOffrePanel = new GroupPanel(GroupingType.fillFirst, 5, false);
       ListOfOffrePanel.add(new GroupPanel(GroupingType.fillFirst, 5, new WhiteSpace(), new WhiteSpace(50),
                    createOffresPanel("element1.getUrlImage()", "ss", "element1.getDescription()", 0),
                    new WhiteSpace(50)));
       ListOfOffrePanel.setMargin(20, 20, 20, 20);

        // List of offre Panel configuration 
        panel.setRound(StyleConstants.largeRound);
        panel.setAutoscrolls(false);
        panel.setPreferredSize(new Dimension(300, 350));
        panel.setMaximumSize(new Dimension(300, 350));
        WebScrollPane bb = new WebScrollPane(ListOfOffrePanel);
        //bb.setBackground(Color.getHSBColor(237, 237, 237));
        bb.setOpaque(false);
        WebPanel panel1 = new WebPanel();
        panel1.add(bb);
        return panel1;
    }

    // Create Single offres panel
    private static WebPanel createOffresPanel(final String url, final String title, String body, final int id) throws IOException {

        final WebPanel offresPanel = new WebPanel(true);
        offresPanel.setPaintFocus(true);
//        `id`, `id_gerant`, `id_adresse`, `etat`, `typeImmob`, `nature`, `payement`, `surface`, `nbrPiece`, 
//        `datePublication`, `dateModification`, `dispobileAPartir`, `description`, `etage`, `ascenceur`, `cuisineEquipe`, 
//        `jardin`, `entreeIndep`, `gazDeVille`, `chauffage`, `meuble`, `climatisation`, `note`, `UrlImage`
        // Nature de l'offre
        GroupPanel naturePanel = new GroupPanel();
        WebLabel natureLabel = new WebLabel("Nature de l'offre");
        final WebRadioButton radioButtonLoc = new WebRadioButton ( "Location" );
        final WebRadioButton radioButtonVe = new WebRadioButton ( "Vente" );
        radioButtonLoc.setSelected(true);
        ButtonGroup groupNature = new ButtonGroup();
        groupNature.add(radioButtonLoc);
        groupNature.add(radioButtonVe);
        naturePanel=new GroupPanel(GroupingType.fillFirst, 5,false,natureLabel,radioButtonLoc,radioButtonVe);
        naturePanel.setMargin(50, 50, 50, 50);
        
        //Etat Offre
        GroupPanel etatPanel = new GroupPanel();
        WebLabel etatLabel = new WebLabel("Etat de l'offre");
        final WebRadioButton radioButtonNouv = new WebRadioButton ( "Nouveau" );
        final WebRadioButton radioButtonBon = new WebRadioButton ( "Bon" );
        final WebRadioButton radioButtonMauv = new WebRadioButton ( "Mauvais" );
        radioButtonNouv.setSelected(true);
        final ButtonGroup groupEtat = new ButtonGroup();
        groupEtat.add(radioButtonNouv);
        groupEtat.add(radioButtonBon);
        groupEtat.add(radioButtonMauv);
        
        etatPanel=new GroupPanel(GroupingType.fillFirst, 5,false,etatLabel,radioButtonNouv,radioButtonBon,radioButtonMauv);
        etatPanel.setMargin(50, 50, 50, 50);
        
        //Image Select
        final WebFileDrop webFileDropImage = new WebFileDrop ();
        webFileDropImage.setShowFileExtensions(false);
        //Cancel Button
        WebButton cancelButton = new WebButton ( "Cancel" );
        cancelButton.addActionListener ( new ActionListener ()
        {

            @Override
            public void actionPerformed ( ActionEvent e )
            {
                System.out.println(getSelectedButtonText(groupEtat));
            }
        } );
        // File drop area scroll
        final WebScrollPane webFilesDropScroll = new WebScrollPane ( webFileDropImage );
        webFilesDropScroll.setPreferredSize ( new Dimension ( 300, 150 ) );
        
        webFileDropImage.addMouseListener(new MouseAdapter() {
            private WebFileChooser imageChooser = null;
            private File file = null;
                @Override
                public void mouseClicked(MouseEvent e) {
                    if ( imageChooser == null )
                {
                    imageChooser = new WebFileChooser ();
                    imageChooser.setMultiSelectionEnabled ( false );
                    imageChooser.setAcceptAllFileFilterUsed ( true );
                    imageChooser.addChoosableFileFilter ( GlobalConstants.IMAGES_FILTER );
                }
                if ( file != null )
                {
                    imageChooser.setSelectedFile ( file );
                }
                if ( imageChooser.showOpenDialog ( webFileDropImage ) == WebFileChooser.APPROVE_OPTION )
                {
                    file = imageChooser.getSelectedFile ();
                    webFileDropImage.addSelectedFile(file);
                    System.out.println(file);
                    System.out.println(webFileDropImage.getSelectedFiles());
                }
                }
            });
        //*************************************************************************************/
        final WebCheckBox checkBoxA = new WebCheckBox ( "Animated checkbox" );
        
        
         
        GroupPanel OffrePanel = new GroupPanel(GroupingType.fillFirst, 5, false);
       
        offresPanel.setPaintFocus(true);
        offresPanel.setMargin(10);
        
        // load the image once
        String longd ="36.7948829";
        String Laltd ="10.1432776";
        offresPanel.setPreferredSize(new Dimension(850, 1400));  
        OffrePanel.add(new GroupPanel(GroupingType.fillFirst, 5,false,
                    
                    webFilesDropScroll,
                    new GroupPanel(GroupingType.fillFirstAndLast,5, etatPanel,naturePanel),
                    loadImageX("http://maps.googleapis.com/maps/api/staticmap?center="+longd+","+Laltd+"&zoom=15&scale=1&size=600x300&maptype=roadmap&format=png&visual_refresh=true&markers=icon:d%7Cshadow:false%7C"+longd+","+Laltd),
                    
                    
                    
                    new WhiteSpace(),
                    new GroupPanel(GroupingType.fillFirstAndLast,50, cancelButton, new WebButton ( "Ajouter" ))));
        offresPanel.add(OffrePanel);
        return offresPanel;
    }

    // Open list of offres frame 
    static void openListOfOffresFrame() throws IOException {

        new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {

                // do some processing here while the progress bar is running
                f.setSize(500, 500);
                f.setLocation(300, 200);
                f.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                f.setLayout(new GridLayout(1, 1, 5, 5));
                try {
                    f1.add(createListOfOffresPanel());
                    f.add(f1);
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
                ListOfOffresFrame.setMinimumSize(new Dimension(300, 400));
                ListOfOffresFrame.setTitle("Offre");
                ListOfOffresFrame.setLayout(new GridLayout(1, 1, 20, 20));
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                ListOfOffresFrame.setLocation((dim.height / 2) + 150, 150);
                ListOfOffresFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ListOfOffresFrame.add(f);
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
                    f.remove(f1);
                    f1.removeAll();
                    f1.add(createListOfOffresPanel());
                    f.add(f1);
                    f.revalidate();
                    f.repaint();
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
            BufferedImage image = ImageIO.read(new File("C:\\Users\\FATHLLAH Wael\\Documents\\NetBeansProjects\\pi_dev\\resources\\no-image-found.jpg"));
            ImageIcon i1 = new ImageIcon(image);
            WebDecoratedImage img2 = new WebDecoratedImage(i1);
            img2.setShadeWidth(0);   
            imagePanel.add(img2);
            imagePanel.setOpaque(false);
            imagePanel.setMargin(50, 50, 50, 50);
         
        }
        return imagePanel;
        
    }
    public static String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }
}

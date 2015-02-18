/*
 * The content is available under the terms of the Creative Commons 
 * Attribution-ShareAlike license (CC-BY-SA), v2.5 or any later version
 */
package GUI;

import DAO.OffreDAO;
import Entity.Offre;
import com.alee.extended.breadcrumb.WebBreadcrumb;
import com.alee.extended.breadcrumb.WebBreadcrumbToggleButton;
import com.alee.extended.image.WebDecoratedImage;
import com.alee.extended.panel.GroupPanel;
import com.alee.extended.panel.GroupingType;
import com.alee.global.StyleConstants;
import com.alee.laf.WebLookAndFeel;
import com.alee.laf.label.WebLabel;
import com.alee.laf.panel.WebPanel;
import com.alee.laf.progressbar.WebProgressBar;
import com.alee.laf.scroll.WebScrollPane;
import com.alee.laf.toolbar.WhiteSpace;
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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

/**
 *
 * @author FATHALLAH Wael
 */
public class ListOfOffres {

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
    protected static WebPanel createListOfOffresPanel() throws IOException, InterruptedException {
        WebPanel panel = new WebPanel();
        //Geting data from database
        List<Offre> tt = new OffreDAO().getAllListOfOffre();
        final GroupPanel ListOfOffrePanel = new GroupPanel(GroupingType.fillFirst, 5, false);
        Offre[] tableOffre = new Offre[10];
        int n = 0;
        int bnnn = nbrpage;
        System.out.println("nombre page ="+nbrpage);
        for (int i = (bnnn - 1) * 10; i < bnnn * 10; i++) {
            if (i < tt.size()) {
                Offre o = tt.get(i);
                if (o != null) {
                    tableOffre[n] = o;
                    n++;
                }
            }
        }

        for (int i = 0; i < n ; i++) {
            
            if (n % 2 != 0 && n== (i+1) ) {
            Offre element1 = tableOffre[i];
            
            String ss = element1.getTypeImmob() + ", " + element1.getNbrPiece() + " pièce, " + element1.getSurface() + " Metre, " + "Paris 18ème";
            
            System.out.print("hellllllo");
                ListOfOffrePanel.add(new GroupPanel(GroupingType.fillFirst, 5, new WhiteSpace(), new WhiteSpace(50),
                    createOffresPanel(element1.getUrlImage(), ss, element1.getDescription(), element1.getId()),
                    new WhiteSpace(50)));

              }else{
            Offre element1 = tableOffre[i];
            Offre element2 = tableOffre[i+1];
            String ss = element1.getTypeImmob() + ", " + element1.getNbrPiece() + " pièce, " + element1.getSurface() + " Metre, " + "Paris 18ème";
            String ss2 = element2.getTypeImmob() + ", " + element2.getNbrPiece() + " pièce, " + element2.getSurface() + " Metre, " + "Paris 18ème";
            
                ListOfOffrePanel.add(new GroupPanel(GroupingType.fillFirst, 5, new WhiteSpace(), new WhiteSpace(50),
                    createOffresPanel("element1.getUrlImage()", ss, element1.getDescription(), element1.getId()), new WhiteSpace(200),
                    createOffresPanel(element2.getUrlImage(), ss2, element2.getDescription(), element2.getId()), new WhiteSpace(50)));
               }  
            i++;
            
        }

        ListOfOffrePanel.setMargin(20, 20, 20, 20);

        // List of offre Panel configuration 
        panel.setRound(StyleConstants.largeRound);
        panel.setAutoscrolls(false);
        panel.setPreferredSize(new Dimension(300, 350));
        panel.setMaximumSize(new Dimension(300, 350));
        WebScrollPane bb = new WebScrollPane(ListOfOffrePanel);
        final WebBreadcrumb bbd = new WebBreadcrumb(true);
        System.out.println((tt.size() / 10) + 1);
        for (int i = 0; i < (tt.size() / 10) + 1; i++) {
             
            WebBreadcrumbToggleButton page = new WebBreadcrumbToggleButton();
            page = new WebBreadcrumbToggleButton();
            final int u = i + 1;
            page.setText("Page " + u);
            //if (i == 0) {
                page.setSelected(true);
            //}
            page.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        System.out.println("Page " + u);
                        nbrpage=u;
                        openPleaseWait();
                        openListOfOffresFrameagn();
                    } catch (IOException ex) {
                        Logger.getLogger(ListOfOffres.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            bbd.add(page);
        }

        //SwingUtils.groupButtons(bbd);

        final GroupPanel LoginPanel1 = new GroupPanel(GroupingType.fillFirst, 5, false, bb, bbd);
        panel.add(LoginPanel1);

        return panel;
    }

    // Create Single offres panel
    private static WebPanel createOffresPanel(final String url, final String title, String body, final int id) throws IOException {

        final WebPanel offresPanel = new WebPanel(true);
        offresPanel.setPaintFocus(false);
        offresPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Opening dialog
                Icon blueIcon = new ImageIcon("yourFile.gif");
                Object stringArray[] = {"Do It", "Open It", "No Way"};
                int returnValue =JOptionPane.showOptionDialog(offresPanel, "Suprimer Offre?", "Vous voulez suprimer un offre",
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, blueIcon, stringArray,
                        stringArray[0]);
                        switch(returnValue)
                        {
                            case 0 :
                                openPleaseWait();
                                try {
                                    System.out.print("tehe id is :"+id);
                                    new OffreDAO().deleteOffre(id);
                                    openListOfOffresFrameagn();
                                } catch (IOException ex) {
                                    Logger.getLogger(ListOfOffres.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            case 1 :
                                //openPleaseWait();
                                
                        }
                System.out.println("The return value"+returnValue);
                WebLookAndFeel.setDecorateDialogs(true);
            }
        });

        final WebPanel descPanel = new WebPanel(false);

        descPanel.add();
        descPanel.setOpaque(true);
        WebLabel descLabel = new WebLabel("<html>\n"
                + "<body>\n"
                + "\n"
                + "<h2>" + title + "</h2>\n"
                + "\n"
                + "<p>" + body + "</p>\n"
                + "\n"
                + "</body>\n"
                + "</html>");

        descPanel.add(descLabel);
        offresPanel.setPaintFocus(true);
        offresPanel.setMargin(10);
        // load the image once
        try {
            BufferedImage bi = ImageIO.read(new URL(url));
            ImageIcon img = new ImageIcon(bi);
            WebDecoratedImage img2 = new WebDecoratedImage(img);
            img2.setShadeWidth(0);
            offresPanel.add(img2);
            offresPanel.setPreferredSize(new Dimension(300, 400));
            GridLayout layoutPffresPanel = new GridLayout(2, 1);
            offresPanel.setLayout(layoutPffresPanel);
            offresPanel.add(descPanel);
        } catch (IOException e) {
            //or open no image found image
            BufferedImage image = ImageIO.read(new File("resources/no-image-found.jpg"));
            ImageIcon i1 = new ImageIcon(image);
            WebDecoratedImage img2 = new WebDecoratedImage(i1);
            img2.setShadeWidth(0);
            offresPanel.add(img2);
            offresPanel.setPreferredSize(new Dimension(300, 400));
            GridLayout layoutPffresPanel = new GridLayout(2, 1);
            offresPanel.setLayout(layoutPffresPanel);
            offresPanel.add(descPanel);
        }
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
                f.add(f1);
                f.revalidate();
                f.repaint();
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
}

package GUI;

/**
 *
 * @author seif
 */
import Entity.Administrateur;
import Technique.LoadIcon;
import com.alee.laf.WebLookAndFeel;
import com.alee.laf.panel.WebPanel;
import com.alee.laf.scroll.WebScrollPane;
import com.alee.laf.tabbedpane.TabStretchType;
import com.alee.laf.tabbedpane.WebTabbedPane;
import java.awt.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import statistique.PieChart_AWT;

public class AdminGUI extends JFrame {
////////////////////////////////////////////////////////////////////////////////
    private WebTabbedPane tabbedPane;
    private JPanel superPanel;
    private JPanel clientPanel;
    private JPanel statPanel;
    private JPanel gerantPanel;
    private JPanel agencePanel;
    public Administrateur connectedAdmin;
////////////////////////////////////////////////////////////////////////////////
    private WebPanel surroundPanel(JPanel panel){
        WebScrollPane scrollPane = new WebScrollPane(panel);
        scrollPane.setDrawBackground(false);
        scrollPane.setDrawBorder(false);
        WebPanel backgroundPanel = new WebPanel(new BorderLayout());        
        WebPanel frontPanel = new WebPanel(new BorderLayout());
        frontPanel.setUndecorated(false);
        frontPanel.setRound(5);
        frontPanel.add(scrollPane,BorderLayout.CENTER);
        frontPanel.setMargin(3);
        backgroundPanel.add(frontPanel,BorderLayout.CENTER);
        backgroundPanel.add(new WebPanel().setMargin(5) ,BorderLayout.NORTH);
        backgroundPanel.add(new WebPanel().setMargin(5) ,BorderLayout.SOUTH);
        backgroundPanel.add(new WebPanel().setMargin(5) ,BorderLayout.EAST);
        backgroundPanel.add(new WebPanel().setMargin(5) ,BorderLayout.WEST);
        return backgroundPanel;
    }
////////////////////////////////////////////////////////////////////////////////
    public AdminGUI(Administrateur connectedAdmin) {
        //recuperation de l'admin connecté
        this.connectedAdmin=connectedAdmin;
        // JFrame init
        setTitle("Dashboard");
        setSize(1200, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(LoadIcon.loadIcon(getClass().getResource("/images/gear.png")).getImage());
        JPanel mainPanel = new JPanel(new BorderLayout());
        getContentPane().add(mainPanel);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        try {
            // Create the tab pages
            initialisation();
        } catch (IOException ex) {
            Logger.getLogger(AdminGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Add
        mainPanel.add(tabbedPane, BorderLayout.CENTER);
        // Show JFrame
        setVisible(true);
    }

    public void initialisation() throws IOException {
        superPanel = new SuperGUI(this.connectedAdmin);
        agencePanel = new Agence_Panel();
        gerantPanel = new Gerant_Panel();
        clientPanel = new ClientListPanel();
        statPanel = new PieChart_AWT("nombre des offres par ville").createDemoPanel();
        // Create a tabbed pane
        tabbedPane = new WebTabbedPane();
        tabbedPane.setTabPlacement(WebTabbedPane.LEFT);
        tabbedPane.setFontSize(20);
        tabbedPane.setRound(5);
        tabbedPane.setTabStretchType(TabStretchType.always);
        // Add tabs
        tabbedPane.addTab("Administrateur", LoadIcon.loadIcon(getClass().getResource("/images/admin.png")), surroundPanel(superPanel));
        tabbedPane.addTab("Liste des agences", LoadIcon.loadIcon(getClass().getResource("/images/agences.png")),surroundPanel(agencePanel));
        tabbedPane.addTab("Liste des gérants", LoadIcon.loadIcon(getClass().getResource("/images/gerants.png")),surroundPanel(gerantPanel));
        tabbedPane.addTab("Liste des clients", LoadIcon.loadIcon(getClass().getResource("/images/clients.png")), surroundPanel(clientPanel));
        tabbedPane.addTab("Statistiques", LoadIcon.loadIcon(getClass().getResource("/images/stats.png")), surroundPanel(statPanel));
        
    }

   
}

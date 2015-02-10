/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi.dev;

import com.alee.extended.label.WebVerticalLabel;
import com.alee.extended.panel.GroupPanel;
import com.alee.extended.panel.GroupingType;
import com.alee.extended.window.TestFrame;
import com.alee.global.StyleConstants;
import com.alee.laf.WebLookAndFeel;
import com.alee.laf.label.WebLabel;
import com.alee.laf.panel.WebPanel;
import com.alee.laf.text.WebTextPane;
import com.alee.laf.toolbar.WhiteSpace;
import com.alee.managers.style.StyleManager;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import static javax.swing.SwingConstants.CENTER;
import static javax.swing.SwingConstants.EAST;
import static javax.swing.SwingConstants.NORTH;
import static javax.swing.SwingConstants.SOUTH;
import static javax.swing.SwingConstants.WEST;
import javax.swing.SwingUtilities;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextAreaEditorKit;

/**
 *
 * @author FATHLLAH Wael
 */
public class testApp
{
    public static void main ( final String[] args )
    {
        SwingUtilities.invokeLater ( new Runnable ()
        {
            
            public void run ()
            {
                
        
                

                final JTextArea textArea = new JTextArea ( "Simple text area" );
                final JLabel textLabelLogin = new WebLabel("Login");
                final JLabel textLabelPassWrod = new WebLabel("Mot De passe");
                WebPanel createFirstPanel;
                createFirstPanel = createFirstPanel();
                
                final JTextPane textPane = new WebTextPane();
                final JTextField textFieldLogin = new JTextField();
                final JScrollPane scrollPane = new JScrollPane ( textArea );
                scrollPane.setPreferredSize ( new Dimension ( 300, 150 ) );
                scrollPane.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
                scrollPane.setHorizontalScrollBarPolicy ( ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS );

                final JProgressBar progressBar = new JProgressBar ();
                progressBar.setIndeterminate ( true );

                final JButton ok = new JButton ( "Ok" );
                final JButton cancel = new JButton ( "Cancel" );
                ok.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    AjouterActionPerformed(evt);
                }

                private void AjouterActionPerformed(ActionEvent evt) {
                    System.out.println("you click ok");
                }
                });

                TestFrame.show ( new GroupPanel ( GroupingType.fillFirst, 80, false, textFieldLogin, textPane,textLabelLogin,createFirstPanel,
                        new GroupPanel ( GroupingType.fillFirst, 5, new WhiteSpace (), ok, cancel ) ), 50 );
                
            }
        });
           
        
    }
private static WebPanel createFirstPanel ()
    {
        final WebPanel panel = new WebPanel ();
        panel.setUndecorated ( false );
        panel.setLayout ( new BorderLayout () );
        panel.setWebColoredBackground ( false );

        final WebPanel northPanel = new WebPanel ();
        northPanel.setPaintSides ( false, false, true, false );
        setupPanel ( northPanel, NORTH );
        panel.add ( northPanel, BorderLayout.NORTH );

        final WebPanel southPanel = new WebPanel ();
        southPanel.setPaintSides ( true, false, false, false );
        setupPanel ( southPanel, SOUTH );
        panel.add ( southPanel, BorderLayout.SOUTH );

        final WebPanel leadingPanel = new WebPanel ();
        leadingPanel.setPaintLeft ( false );
        setupPanel ( leadingPanel, WEST );
        panel.add ( leadingPanel, BorderLayout.LINE_START );

        final WebPanel trailingPanel = new WebPanel ();
        trailingPanel.setPaintRight ( false );
        setupPanel ( trailingPanel, EAST );
        panel.add ( trailingPanel, BorderLayout.LINE_END );

        final WebPanel centerPanel = new WebPanel ();
        setupPanel ( centerPanel, CENTER );
        panel.add ( centerPanel, BorderLayout.CENTER );

        return panel;
    }
     private static void setupPanel ( final WebPanel panel, final int location )
    {
        // Decoration settings
        panel.setUndecorated ( false );
        panel.setMargin ( new Insets ( 3, 3, 3, 3 ) );
        panel.setRound ( StyleConstants.largeRound );

        // Custom content
        switch ( location )
        {
            case NORTH:
            {   final JLabel textLabelLogin = new WebLabel("Login");
                final JLabel textLabelPassWrod = new WebLabel("Mot De passe");
                final GroupPanel gPanel = new GroupPanel(GroupingType.fillFirst, 5, false,textLabelLogin,textLabelPassWrod);
                panel.add ( gPanel ) ;
                break;
            }
            case SOUTH:
            {   final JLabel textLabelLogin = new WebLabel("Login");
                final JLabel textLabelPassWrod = new WebLabel("Mot De passe");
                final GroupPanel gPanel = new GroupPanel(GroupingType.fillFirst, 5, false,textLabelLogin,textLabelPassWrod);
                panel.add ( gPanel );
                break;
            }
            case WEST:
            {
                final JLabel textLabelLogin = new WebLabel("Login");
                final JLabel textLabelPassWrod = new WebLabel("Mot De passe");
                final GroupPanel gPanel = new GroupPanel(GroupingType.fillFirst, 5, false,textLabelLogin,textLabelPassWrod);
                panel.add ( gPanel );
                break;
            }
            case EAST:
            {
                final JLabel textLabelLogin = new WebLabel("Login");
                final JLabel textLabelPassWrod = new WebLabel("Mot De passe");
                final GroupPanel gPanel = new GroupPanel(GroupingType.fillFirst, 5, false,textLabelLogin,textLabelPassWrod);
                panel.add ( gPanel );
                break;
            }
            case CENTER:
            {
                final JLabel textLabelLogin = new WebLabel("Login");
                final JLabel textLabelPassWrod = new WebLabel("Mot De passe");
                final GroupPanel gPanel = new GroupPanel(GroupingType.fillFirst, 5, false,textLabelLogin,textLabelPassWrod);
                panel.add ( gPanel );
                break;
            }
        }
    }
}

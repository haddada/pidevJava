/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import com.alee.extended.image.WebDecoratedImage;
import com.alee.extended.panel.GroupPanel;
import com.alee.extended.panel.GroupingType;
import com.alee.global.StyleConstants;
import com.alee.laf.WebLookAndFeel;
import com.alee.laf.label.WebLabel;
import com.alee.laf.panel.WebPanel;
import com.alee.laf.text.*;
import com.alee.laf.toolbar.WhiteSpace;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author FATHLLAH Wael
 */
public class Login {
    public static JFrame loginFramr;
    public static void main ( final String[] args )
    {
        SwingUtilities.invokeLater ( new Runnable ()
        {
            
            @Override
            public void run ()
            {
               // Look and Feel 
               WebLookAndFeel.install ();  
               //Open Login Frame
               openLoginFrame();
               }
        });
    }
    
    private static WebPanel createLoginPanel (){
        final WebPanel panel = new WebPanel ();
        panel.setUndecorated ( false );
        //panel.setLayout(null);
        panel.setBounds(50, 50000, 50000, 500);
        panel.setWebColoredBackground ( false );
        
        //Logo
        ImageIcon i1 =new ImageIcon("C:\\Users\\FATHLLAH Wael\\Desktop\\II\\PIDev\\601px-Dell_Logo1.png");
        
        WebDecoratedImage img2 = new WebDecoratedImage ( i1 );
        img2.setShadeWidth ( 5 );
        
        //Login
        //final JLabel textLabelLogin = new WebLabel("<html>   <head></head>    <body> <p><font size=\"4\" color=\"#000000\">Login</font></p>   </body>  </html>  ");
        final JLabel textLabelLogin = new WebLabel("Login");
        final JTextField textFieldLogin = new JTextField();
        //PassWord
        final JLabel textLabelPassWrod = new WebLabel("Mot De Passe");
        final WebPasswordField textFieldPassword = new WebPasswordField();
        //Boutton
        final JButton login = new JButton ( "Login" );
        final JButton cancel = new JButton ( "Cancel" );
        //ActionListener
        login.addActionListener ( new ActionListener ()
        {
            @Override
            public void actionPerformed ( ActionEvent e )
            {
                
            }
        } );
        cancel.addActionListener ( new ActionListener ()
        {
            @Override
            public void actionPerformed ( ActionEvent e )
            {
                loginFramr.setVisible(false); //you can't see me!
                loginFramr.dispose(); //Destroy the JFrame object
            }
        } );
        //Login Group Panel
        final GroupPanel LoginPanel = new GroupPanel(GroupingType.fillFirst, 5,false,img2,textLabelLogin,textFieldLogin,textLabelPassWrod,textFieldPassword,
                                                        new GroupPanel ( GroupingType.fillFirst, 5, new WhiteSpace (), login, cancel )
                                                    );
        
        LoginPanel.setMargin(20, 20, 20, 20);
       
        // Login Panel Confeguration 
        panel.setRound ( StyleConstants.largeRound );
        panel.setAutoscrolls(false);
        panel.setPreferredSize ( new Dimension ( 300, 350 ) );
        panel.setMaximumSize(new Dimension(300, 350));
        
        panel.add ( LoginPanel ) ;

        return panel;
    }
    private static void openLoginFrame(){
        loginFramr =new JFrame();
        loginFramr.setSize(300, 400);
        loginFramr.setMaximumSize(new Dimension(300, 400));
        loginFramr.setMinimumSize(new Dimension(300, 400));
        loginFramr.setTitle("Login");
        loginFramr.setLayout(new GridLayout(1, 1, 20, 20));
        JPanel f = new JPanel();
        f.setSize(500, 500);
        f.setLocation(300,200);
        f.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        f.setLayout(new GridLayout(1 , 1 , 5 , 5));
        f.add(createLoginPanel()); 
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        loginFramr.setLocation((dim.height/2)+150, 150);
        loginFramr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFramr.add(f);
        loginFramr.setVisible(true);
    }
}

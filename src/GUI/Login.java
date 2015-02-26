/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.AdministrateurDAO;
import Entity.Administrateur;
//import static GUI.ListOfOffres.openListOfOffresFrame;
import GUI.AdminGUI;
import com.alee.extended.image.WebDecoratedImage;
import com.alee.extended.layout.VerticalFlowLayout;
import com.alee.extended.panel.GroupPanel;
import com.alee.extended.panel.GroupingType;
import com.alee.extended.window.WebPopOver;
import com.alee.global.StyleConstants;
import com.alee.laf.WebLookAndFeel;
import com.alee.laf.checkbox.WebCheckBox;
import com.alee.laf.label.WebLabel;
import com.alee.laf.panel.WebPanel;
import com.alee.laf.toolbar.WhiteSpace;
import com.alee.managers.language.data.TooltipWay;
import com.alee.managers.tooltip.TooltipManager;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author ulrich blanchard
 */
public class Login {

    protected static JFrame loginFramr;
    public Administrateur  connectedAdmin=null;
    
     void openLoginFrame() {
        loginFramr = new JFrame();
        loginFramr.setSize(300, 420);
        loginFramr.setMaximumSize(new Dimension(300, 400));

        loginFramr.setTitle("Login");
        loginFramr.setLayout(new GridLayout(1, 1, 20, 20));
        JPanel f = new JPanel();

        f.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        f.setLayout(new GridLayout(1, 1, 5, 5));
        f.add(createLoginPanel());

        loginFramr.add(f);
        loginFramr.setVisible(true);

    }

    private  WebPanel createLoginPanel() {

        final WebPanel panel = new WebPanel();
        panel.setUndecorated(false);
        //panel.setLayout(null);

        panel.setWebColoredBackground(false);

        //Logo
        //ImageIcon i1 =new ImageIcon("resources/icon.png");
        WebDecoratedImage img2 = new WebDecoratedImage();
        img2.setShadeWidth(5);

        //Login
        //final JLabel textLabelLogin = new WebLabel("<html>   <head></head>    <body> <p><font size=\"4\" color=\"#000000\">Login</font></p>   </body>  </html>  ");
        final JLabel textLabelLogin = new WebLabel("email");
        final JTextField textFieldLogin = new JTextField();
        TooltipManager.setTooltip(textFieldLogin, "Votre email ", TooltipWay.up, 0);

        //PassWord
        final JLabel textLabelPassWrod = new WebLabel("Mot De Passe");
        final JPasswordField textFieldPassword = new JPasswordField();
        TooltipManager.setTooltip(textFieldPassword, "Votre Mot De Passe ", TooltipWay.up, 0);

        //Boutton
        final JButton login = new JButton("Login");
        final JButton cancel = new JButton("Cancel");
        final WebCheckBox checkBoxA = new WebCheckBox("Administrateur");

        //ActionListener
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                AdministrateurDAO ldao = new AdministrateurDAO();
                char[] pass = textFieldPassword.getPassword();
                String passString = new String(pass);
                String mailString = textFieldLogin.getText();

                if (!fieldIsEmpty(mailString)) {
                    //Mail fiels not empty
                    if (!fieldIsEmpty(passString)) {

                        //Password fiels not empty
                        if (checkBoxA.isSelected()) {
                            connectedAdmin=ldao.signIn(textFieldLogin.getText(), passString);
                            if ( connectedAdmin== null) {
                                final WebPopOver popOver = new WebPopOver(loginFramr);
                                popOver.add(new WebLabel("Login or Password are not correct"));
                                popOver.setCloseOnFocusLoss(true);
                                popOver.setMargin(10);
                                popOver.setLayout(new VerticalFlowLayout());
                                popOver.show(loginFramr);
                            } else {

                                AdminGUI t = new AdminGUI(connectedAdmin);
                                t.setVisible(true);
                                loginFramr.dispose();
                            }
                        } else {
                            //do the work for client  

                        }

                    } else {
                        System.out.println("Password field is empty");
                        final WebPopOver popOver = new WebPopOver(textFieldPassword);
                        popOver.setCloseOnFocusLoss(true);
                        popOver.setMargin(10);
                        popOver.setLayout(new VerticalFlowLayout());
                        popOver.add(new WebLabel("Password field is empty"));

                        popOver.show(textFieldPassword);
                    }
                } else {
                    System.out.println("Login field is empty");
                    final WebPopOver popOver = new WebPopOver(textFieldLogin);
                    popOver.setCloseOnFocusLoss(true);
                    popOver.setMargin(10);
                    popOver.setLayout(new VerticalFlowLayout());
                    popOver.add(new WebLabel("Login field is empty"));

                    popOver.show(textFieldLogin);
                }
            }

            private boolean fieldIsEmpty(String mailString) {
                return mailString.equals("");
            }
        });
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginFramr.setVisible(false); //you can't see me!
                loginFramr.dispose(); //Destroy the JFrame object
            }
        });
        //Login Group Panel
        final GroupPanel LoginPanel = new GroupPanel(GroupingType.fillFirst, 5, false, img2, textLabelLogin, textFieldLogin, textLabelPassWrod, textFieldPassword, checkBoxA,
                new GroupPanel(GroupingType.fillFirst, 5, new WhiteSpace(), login, cancel)
        );

        LoginPanel.setMargin(20, 20, 20, 20);

        // Login Panel Confeguration 
        panel.setRound(StyleConstants.largeRound);
        panel.setAutoscrolls(false);
        panel.setPreferredSize(new Dimension(300, 350));
        panel.setMaximumSize(new Dimension(300, 350));

        panel.add(LoginPanel);

        return panel;
    }

    public static void main(final String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                // Look and Feel 
                WebLookAndFeel.install();
                //Open Login Frame
                WebLookAndFeel.setDecorateAllWindows(true);
                new Login().openLoginFrame();
            }
        });
    }
}

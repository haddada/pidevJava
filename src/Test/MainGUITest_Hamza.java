/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;

import GUI.AgenceGUI;
import GUI.GerantGUI;
import Test.AdresseGUITest_Hamza;
import com.alee.laf.WebLookAndFeel;

import javafx.scene.control.CheckBox;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;



/**
 *
 * @author ShujiX
 */
public class MainGUITest_Hamza {
        public static void main(String args[]) {
   
     
            // ken bch ne5dmou bél seaglass
         /*
            try {
                //
                UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        */
           WebLookAndFeel.install ();
           WebLookAndFeel.setDecorateAllWindows(true);
            
            // ken bch ne5dmou bél WebLaf 
            // WebLookAndFeel.install (); 
          /*
            JFrame jf=new JFrame();
            JPanel jp=new JPanel();
            jp.setSize(550, 450);
            
            jf.setContentPane(jp);
            JButton b=new JButton("Bonjour");
            jp.add(b);
            
            JCheckBox ck=new JCheckBox();
            ck.setEnabled(true);
            jp.add(ck);
            jf.setTitle("salem");
            jf.setSize(500, 500);
            jf.setVisible(true);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
            jf.setSize(450, 550);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             jf.setVisible(true);
              */
           // new AdresseGUITest_Hamza().setVisible(true);
            //new GerantGUI().setVisible(true);
            new AgenceGUI().setVisible(true);
    }

}

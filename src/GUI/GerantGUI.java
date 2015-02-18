/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import GUI.Gerant.Adapters.GerantAdapterPrenom;
import GUI.Gerant.Adapters.GerantAdapterName;
import GUI.Gerant.Adapters.GerantAdapter;
import DAO.GerantDAO;
import GUI.Gerant.Adapters.GerantAdapterInstant;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
/**
 *
 * @author ShujiX
 */
public class GerantGUI extends javax.swing.JFrame {

    /**
     * Creates new form Test
     */
    public GerantGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_gerants = new javax.swing.JTable();
        bt_delete = new javax.swing.JButton();
        bt_quitter = new javax.swing.JButton();
        bt_trie = new javax.swing.JButton();
        bt_chercher=new javax.swing.JButton();
        combo_trie = new javax.swing.JComboBox();
        txt_chercher=new javax.swing.JFormattedTextField();
       
         bt_delete.setText("Supprimer");
         bt_delete.setOpaque(true);
         bt_delete.setBorderPainted(false);
         bt_delete.setForeground(Color.RED);
         
         bt_chercher.setText("Chercher");

        

        popupMenu1.setLabel("popupMenu1");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        
        
        /*  =============================================================================
            Remplissage de la table avec la liste retournée via displayAll() dans 
            le constructeur de l'adaptateur passé comme paramére
        */
        table_gerants.setModel(new GerantAdapter());
        table_gerants.setColumnSelectionAllowed(false);
        jScrollPane1.setViewportView(table_gerants);
        table_gerants.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        //  ==============================================================================
        // Mise en forme du bouton de trie
        bt_trie.setText("Trier par ");
        // Mise en forme du bouton quitter
        bt_quitter.setText("Quitter");
        //Mise en forme du comboBox
        combo_trie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nom", "Prenom" }));

        //Les listnesrs des boutons Trier + Delete + Quitter
        bt_trie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_trieActionPerformed(evt);
            }
        });
        
        bt_chercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_chercherActionPerformed(evt);
            }
        });
       bt_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deleteActionPerformed(evt);
            }
        });
        
       bt_quitter.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_quitterActionPerformed(evt);
            }
        });
        //  ==============================================================================

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bt_trie)
                        .addGap(18, 18, 18)
                        .addComponent(combo_trie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(bt_chercher)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_chercher, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_quitter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_trie)
                    .addComponent(combo_trie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_chercher)
                    .addComponent(txt_chercher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_delete)
                .addGap(18, 18, 18)
                .addComponent(bt_quitter)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        combo_trie.getAccessibleContext().setAccessibleName("combo_trie");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }                  
    
    //  =================================================================> les actions des boutons 
    //Actions pour le trie
    private void bt_trieActionPerformed(java.awt.event.ActionEvent evt) {                                        
       if (String.valueOf(combo_trie.getSelectedItem()).equalsIgnoreCase("nom"))
       {    
            table_gerants.setModel(new GerantAdapterName());}
       else if (String.valueOf(combo_trie.getSelectedItem()).equalsIgnoreCase("prenom")){
            table_gerants.setModel(new GerantAdapterPrenom());}
    }                                       

    //Action pour le trie
    private void bt_deleteActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        if (table_gerants.getSelectedRow()==-1) {
            JOptionPane.showMessageDialog(this, "Veulliez selectionez une ligne");
        }
        else
        {
            int i = Integer.parseInt(table_gerants.getValueAt(table_gerants.getSelectedRow(),0)+"");
            System.out.println(i);
            GerantDAO gerantDAO = new GerantDAO();
            gerantDAO.deleteGerant(i);
            JOptionPane.showMessageDialog(this, "Suppression effectuée avec succés");
            table_gerants.setModel(new GerantAdapter());
        }
    }  
    
    private void bt_chercherActionPerformed(java.awt.event.ActionEvent evt) {                                        
       table_gerants.setModel(new GerantAdapterInstant(txt_chercher.getText()));
    }   
    
    private void bt_quitterActionPerformed(java.awt.event.ActionEvent evt) {                                        
       // juste fermeture de la forme éma l application t93od temchi --> pr l'integration
        this.setVisible(false);
    }   
    //  ================ 


    // Les variables de l'interface 
    private javax.swing.JButton bt_trie;
    private javax.swing.JComboBox combo_trie;
    private javax.swing.JButton bt_delete;
    private javax.swing.JButton bt_quitter;
    private javax.swing.JButton bt_chercher;
    private javax.swing.JTextField txt_chercher;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTable table_gerants;
                   
}

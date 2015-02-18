/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import DAO.AdresseDAO;
import DAO.AgenceDAO;
import DAO.GerantDAO;
import Entity.Adresse;
import Entity.Agence;
import Entity.Gerant;
import GUI.Adresse.Adapters.AdresseAdapter;
import GUI.Adresse.Adapters.AdresseAdapterInstant;
import GUI.Agence.Adapters.AgenceAdapter;
import GUI.Gerant.Adapters.GerantAdapter;
import GUI.Gerant.Adapters.GerantAdapterInstant;
import GUI.Gerant.Adapters.GerantAdapterName;
import GUI.Gerant.Adapters.GerantAdapterPrenom;
import javax.swing.JOptionPane;

/**
 *
 * @author ShujiX
 */
public class AgenceGUI extends javax.swing.JFrame {

    /**
     * Creates new form AgenceForm
     */
    public AgenceGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        txt_nom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_gerants = new javax.swing.JTable();
        txt_description = new javax.swing.JTextField();
        bt_trie = new javax.swing.JButton();
        combo_trie = new javax.swing.JComboBox();
        bt_chercherG = new javax.swing.JButton();
        txt_chercherG = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_adresses = new javax.swing.JTable();
        bt_chercherA = new javax.swing.JButton();
        txt_chercherA = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_agences = new javax.swing.JTable();
        bt_ajouter = new javax.swing.JButton();
        bt_supprimer = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nom");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Description");
        bt_chercherA.setText("Chercher");
        bt_ajouter.setText("Ajouter");
        bt_supprimer.setText("Supprimer");
        bt_chercherG.setText("Chercher");
        bt_trie.setText("Trier par");
        combo_trie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nom", "Prenom" }));

        
        //*************************Remplissage tableau Gerants******************************
        table_gerants.setModel(new GerantAdapter());
        jScrollPane2.setViewportView(table_gerants);

        //***********************************************************************************

        //*************************Remplissage tableau Adresses******************************
        table_adresses.setModel(new AdresseAdapter());
        jScrollPane1.setViewportView(table_adresses);
        //***********************************************************************************      

        //*************************Remplissage tableau agences******************************
        table_agences.setModel(new AgenceAdapter());
        jScrollPane3.setViewportView(table_agences);
        //***********************************************************************************
               
        //*****************************Les listeners*****************************************
        
        bt_trie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_trieActionPerformed(evt);
            }
        });
        
        bt_chercherG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_chercherGActionPerformed(evt);
            }
        });
        
        bt_chercherA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_chercherAActionPerformed(evt);
            }
        });
        
        bt_ajouter.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                bt_ajouterActionPerformed(evt);
            }
        });
        
        bt_supprimer.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                bt_supprimerActionPerformed(evt);
            }
        });
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18)
                .addComponent(bt_chercherA)
                .addGap(18, 18, 18)
                .addComponent(txt_chercherA, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_description, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 36, Short.MAX_VALUE))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(bt_ajouter)
                                .addGap(46, 46, 46)
                                .addComponent(bt_supprimer)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bt_trie)
                                        .addGap(18, 18, 18)
                                        .addComponent(combo_trie, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bt_chercherG)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_chercherG, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_description, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_ajouter)
                            .addComponent(bt_supprimer))
                        .addGap(39, 39, 39)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_trie)
                            .addComponent(combo_trie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_chercherG)
                            .addComponent(txt_chercherG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_chercherA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt_chercherA))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>                        

//*********************Les actions des boutons********************************
    private void bt_trieActionPerformed(java.awt.event.ActionEvent evt) {                                        
       if (String.valueOf(combo_trie.getSelectedItem()).equalsIgnoreCase("nom"))
       {    
            table_gerants.setModel(new GerantAdapterName());}
       else if (String.valueOf(combo_trie.getSelectedItem()).equalsIgnoreCase("prenom")){
            table_gerants.setModel(new GerantAdapterPrenom());}
    }     

    private void bt_chercherGActionPerformed(java.awt.event.ActionEvent evt) {                                        
       table_gerants.setModel(new GerantAdapterInstant(txt_chercherG.getText()));
    }  
    
    private void bt_chercherAActionPerformed(java.awt.event.ActionEvent evt) {                                        
       table_adresses.setModel(new AdresseAdapterInstant(txt_chercherA.getText()));
    }
    
    private void bt_ajouterActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if(txt_nom.getText().isEmpty() || txt_description.getText().isEmpty()){
                     JOptionPane.showMessageDialog(this, "Veulliez remplir le nom & l'adresse ");
        }else{
            if(table_gerants.getSelectedRow() ==-1 || table_adresses.getSelectedRow()==-1){
                 JOptionPane.showMessageDialog(this, "Veulliez selectionez un gerant est une adresse");
            }else{
                int ig = Integer.parseInt(table_gerants.getValueAt(table_gerants.getSelectedRow(),0)+"");
                int ia = Integer.parseInt(table_adresses.getValueAt(table_adresses.getSelectedRow(),0)+"");
                AgenceDAO agd=new AgenceDAO();
                GerantDAO grd=new GerantDAO();
                AdresseDAO ado=new AdresseDAO();
                Gerant g=grd.findGerantById(ig);
                Adresse a=ado.findAdresseById(ig);
                Agence ag=new Agence();
                ag.setNom(txt_nom.getText());
                ag.setDescription(txt_description.getText());
                ag.setGerant(g);
                ag.setAdresse(a);
                agd.insertAgence(ag);
                table_agences.setModel(new AgenceAdapter());
            }
        }
    }
    
    private void bt_supprimerActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        if (table_agences.getSelectedRow()==-1) {
            JOptionPane.showMessageDialog(this, "Veulliez selectionner une agence");
        }
        else
        {
            int i = Integer.parseInt(table_agences.getValueAt(table_agences.getSelectedRow(),0)+"");
            AgenceDAO agd = new AgenceDAO();
            agd.deleteAgence(i);
            table_agences.setModel(new AgenceAdapter());
        }
    }  
    
    //**************************************************************************************
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton bt_ajouter;
    private javax.swing.JButton bt_chercherA;
    private javax.swing.JButton bt_chercherG;
    private javax.swing.JButton bt_supprimer;
    private javax.swing.JButton bt_trie;
    private javax.swing.JComboBox combo_trie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable table_adresses;
    private javax.swing.JTable table_agences;
    private javax.swing.JTable table_gerants;
    private javax.swing.JTextField txt_chercherA;
    private javax.swing.JTextField txt_chercherG;
    private javax.swing.JTextField txt_description;
    private javax.swing.JTextField txt_nom;
    // End of variables declaration                   
}
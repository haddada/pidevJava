/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Entity.Agence;
import Entity.Gerant;
import Technique.MyConnexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class GerantDAO implements Interface.IGerantDAO{

    @Override
    public void insertGerant(Gerant g) {
        
        // ajout de l'attribut role qui prend 1 pour gerant et 0 pour les autres utilisateurs
         String req="insert into gerant (nom,prenom,mail,password,numFix,numTel) values(?,?,?,?,?,?,?) ";
         //Rque : Est ce qu'on une table utilisateur(tous les champs) dans la BD ou table gerant .... 
        try {
            PreparedStatement ps=MyConnexion.getInstance().prepareStatement(req);
            ps.setString(1, g.getNom());
            ps.setString(2, g.getPrenom());
            ps.setString(3, g.getMail());
            ps.setString(4, g.getPassword());
            ps.setString(5, g.getNumFix());
            ps.setString(6, g.getNumTel());
            
            // le gearant doit avoir une table a lui parceque la table 
            // gerant admet une clé etrangére de la table agence
            // Il faut ajouter l 'id de l'agence dans laquelle appartient ce gerant
            ps.execute();
            System.out.println("Insertion gérant effectuée avec succés !");
        } catch (SQLException ex) {
            Logger.getLogger(GerantDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteGerant(int id) {
        String req="delete from gerant where id=? ";
        try {
            PreparedStatement ps=MyConnexion.getInstance().prepareStatement(req);
            ps.executeUpdate();
            System.out.println("Insertion depot effectuée avec succés !");
        } catch (SQLException ex) {
            Logger.getLogger(GerantDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Gerant> displayAll() {
        
        String requete="select * from stock";   
        Gerant d=new Gerant();
        ArrayList<Gerant> lst=new ArrayList<Gerant>();
        try {
            PreparedStatement ps=MyConnexion.getInstance().prepareStatement(requete);
            ResultSet resultat=ps.executeQuery();
            GerantDAO dpd=new GerantDAO();
            
            while(resultat.next()){
              /*
                Agence ag = new Agence();
                s.setNum(resultat.getInt(1));
                s.setType_vet(resultat.getString(2));
                s.setNbr_articles(resultat.getInt(3));
                s.setD(dpd.findAgenceById(resultat.getInt(4)));
                
                lst.add(s);
               */
            }
        } catch (SQLException ex) {
         //   Logger.getLogger(DepotDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         return lst;
    }

    @Override
    public Gerant findGerantById(int id) {
        Gerant gr=new Gerant();        
        String requete="select * from gerant where id=?";
 
        try {
            PreparedStatement ps=MyConnexion.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat=ps.executeQuery();
            while(resultat.next()){
                gr.setId(resultat.getInt(1));
                gr.setNom(resultat.getString(2));
                gr.setPrenom(resultat.getString(3));
                gr.setMail(resultat.getString(4));
                gr.setPassword(resultat.getString(5));
                gr.setNumFix(resultat.getString(6));
                gr.setNumTel(resultat.getString(7));
            }
        } catch (SQLException ex) {
            Logger.getLogger(GerantDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                return gr;
    }
    
    
    
}

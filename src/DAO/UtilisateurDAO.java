/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Entity.Utilisateur;
import Interface.IUtilisateurDAO;
import Technique.MyConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class UtilisateurDAO implements IUtilisateurDAO{

    public UtilisateurDAO() {
    }

    
    @Override
    public void insertUtilisateur(Utilisateur u) {
        String req="insert into utilisateur(nom,prenom,mail,password) values(?,?,?,?) ";
        try {
            PreparedStatement ps=MyConnection.getInstance().prepareStatement(req);
     
            ps.setString(1,u.getNom());
            ps.setString(2,u.getPrenom());
            ps.setString(3,u.getMail());
            ps.setString(4,u.getPassword());
            ps.execute();
        } catch (SQLException ex) {
             Logger.getLogger(UtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteUtilisateur(Utilisateur u) {
        String req="delete from utilisateur where Id=?";
        try {
            PreparedStatement ps=MyConnection.getInstance().prepareStatement(req);
            ps.setInt(1,u.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 
}
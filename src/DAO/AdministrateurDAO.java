/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Interface.IAdministrateurDAO;
import Technique.MyConnexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class AdministrateurDAO implements Interface.IAdministrateurDAO {

       private Connection connection;
    
    @Override
    public boolean signIn(String mail, String pass) {
        
       String requete = "select * from administrateur where mot_de_passe=? AND mail=?"; 
       try{
            PreparedStatement ps = MyConnexion.getInstance().prepareStatement(requete);
            ps.setString(1, pass);
            ps.setString(2, mail);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()){
                 resultat.getInt(6);
            }
            } catch (SQLException ex) {
            System.out.println("erreur");
            return false;
        }
        return true;
    }

   
   
    
}

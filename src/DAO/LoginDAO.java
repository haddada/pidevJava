/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;


import Technique.MyConnexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author FATHLLAH Wael
 */
public class LoginDAO implements Interface.ILoginDAO{
    private Connection connection;
    
    

    @Override
    public int Login(String mail, String pass) {
       String requete = "select * from administrateur where mot_de_passe=? AND mail=?"; 
       try{
            PreparedStatement ps = MyConnexion.getInstance().prepareStatement(requete);
            ps.setString(1, pass);
            ps.setString(2, mail);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()){
                
                return resultat.getInt(6);
                
                
            }
            } catch (SQLException ex) {
            System.out.println("erreur");
            return 404;
        }
        return 500;
    }

  
    
  
}

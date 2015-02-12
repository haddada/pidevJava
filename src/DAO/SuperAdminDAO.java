/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Administrateur;
import Interface.IsuperAdminDAO;
import Technique.MyConnection;
import java.sql.PreparedStatement;
import java.util.List;
import Technique.MyConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author seif
 */
public class SuperAdminDAO extends AdministrateurDAO implements IsuperAdminDAO{

    

    @Override
    public void insertAdmin(Administrateur ad) {
         String req = "insert into Administrateur (nom,prenom,login,mot_de_passe,mail,privilege) values(?,?,?,?,?,?) ";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(req);
            ps.setString(1, ad.getNom());
            ps.setString(2, ad.getPrenom());
            ps.setString(3, ad.getLogin());
            ps.setString(4, ad.getPassword());
            ps.setString(5,ad.getMail());
            ps.setInt(6, ad.getPrivilege());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteAdmin(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Administrateur> displayAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Administrateur findAdminById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

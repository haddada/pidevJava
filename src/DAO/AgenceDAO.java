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
public class AgenceDAO implements Interface.IAgenceDAO {

    @Override
    public void insertAgence(Agence ag) {
        String req = "insert into agence (nom,ville,description,adresse) values(?,?,?,?)";
        try {
            PreparedStatement ps = MyConnexion.getInstance().prepareStatement(req);
            ps.setString(1, ag.getNom());
            ps.setString(1, ag.getVille());
            ps.setString(1, ag.getDescription());
            ps.setString(1, ag.getAdresse());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(AgenceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteAgence(int id) {
        String req = "delete from agence where id_depot=?";
        try {
            PreparedStatement ps = MyConnexion.getInstance().prepareStatement(req);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AgenceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Agence> displayAll() {

        String requete = "select * from agence";
        ArrayList<Agence> lst = new ArrayList<Agence>();
        try {
            PreparedStatement ps = MyConnexion.getInstance().prepareStatement(requete);
            ResultSet resultat = ps.executeQuery();

            while (resultat.next()) {

                Agence ag = new Agence();
                ag.setId(resultat.getInt(1));
                ag.setNom(resultat.getString(2));
                ag.setVille(resultat.getString(3));
                ag.setDescription(resultat.getString(4));
                ag.setAdresse(resultat.getString(5));
                lst.add(ag);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AgenceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lst;
    }

    @Override
    public Agence findAgenceById(int id) {
        Agence ag = new Agence();
        String requete = "select * from agence where id=?";

        try {
            PreparedStatement ps = MyConnexion.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                ag.setId(resultat.getInt(1));
                ag.setNom(resultat.getString(2));
                ag.setVille(resultat.getString(3));
                ag.setDescription(resultat.getString(4));
                ag.setAdresse(resultat.getString(5));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AgenceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ag;
    }

}

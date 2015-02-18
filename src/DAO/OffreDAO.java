/*
 * The content is available under the terms of the Creative Commons 
 * Attribution-ShareAlike license (CC-BY-SA), v2.5 or any later version
 */

package DAO;

import Entity.Offre;
import Technique.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FATHALLAH Wael
 */
public class OffreDAO implements Interface.IOffresDAO{

    @Override
    public List<Offre> getAllListOfOffre() {
        List<Offre> listOffre = new ArrayList<>();
        String requete = "select * from offre"; 
       try{
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()){
                
                listOffre.add(new Offre(resultat.getInt(1), resultat.getInt(2), 
                        resultat.getInt(3), resultat.getString(4), resultat.getString(5), resultat.getString(6), resultat.getString(7), 
                        resultat.getFloat(8), resultat.getInt(9), resultat.getString(10), resultat.getString(11), resultat.getString(12), 
                        resultat.getString(13), resultat.getInt(14), resultat.getBoolean(15), resultat.getBoolean(16), resultat.getBoolean(17), resultat.getBoolean(18), 
                        resultat.getBoolean(19), resultat.getBoolean(20), resultat.getBoolean(21), resultat.getBoolean(22), resultat.getInt(23), resultat.getString(24), resultat.getString(25)));
                System.out.println("done");
            }
            return listOffre;
       } catch (SQLException ex) {
            System.out.println("erreur");
            
       }
        return null;
    }
    

    @Override
    public List<Offre> getAllListOfOffre(int id_gerant) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Offre getOffreByID(int id) {
        Offre offreByID = new Offre();
        String requete = "select * from offre where id = ?"; 
       try{
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()){
                
                offreByID = new Offre(resultat.getInt(1), resultat.getInt(2), 
                        resultat.getInt(3), resultat.getString(4), resultat.getString(5), resultat.getString(6), resultat.getString(7), 
                        resultat.getFloat(8), resultat.getInt(9), resultat.getString(10), resultat.getString(11), resultat.getString(12), 
                        resultat.getString(13), resultat.getInt(14), resultat.getBoolean(15), resultat.getBoolean(16), resultat.getBoolean(17), resultat.getBoolean(18), 
                        resultat.getBoolean(19), resultat.getBoolean(20), resultat.getBoolean(21), resultat.getBoolean(22), resultat.getInt(23), resultat.getString(24), resultat.getString(25));
                System.out.println("done");
            }
            return offreByID;
       } catch (SQLException ex) {
            System.out.println("erreur");
            
       }
        return null;
    }
    
    @Override
    public boolean deleteOffre(int id) {
        String requete = "delete from offre where id = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Delete Done");
                    
        } catch (SQLException ex) {
            System.out.println("Erreur");
        }
        return false;
    }

    

    @Override
    public boolean insertOffre(int id_gerant, int id_adresse, String etat, String typeImmob, String nature, String payement, float surface, int nbrPiece, String datePublication, String dateModification, String dispobileAPartir, String description, int etage, boolean ascenceur, boolean cuisineEquipe, boolean jardin, boolean gazDeVille, boolean chauffage, boolean meuble, boolean climatisation, float note, String urlImage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean alterNoteOffre(int id, float note) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}

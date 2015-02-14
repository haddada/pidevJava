package DAO;

import Entity.BoiteMessages;
import Entity.Message;
import Technique.MyConnexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Elyes
 */
public class BoiteMessageDAO implements Interface.IBoiteMessageDAO {

    public BoiteMessageDAO() {
    }

    @Override
    public void envoyerMessage(int id_expediteur, int id_destinataire, String contenu) {
        String sql = "INSERT INTO `boitemessages` (`id`, `id_expediteur`, `id_destinataire`, `contenu`, `vu`, `date_envoi`) VALUES (NULL, ?, ?, ?, '0', CURRENT_DATE());";
        try {
            PreparedStatement stmt = MyConnexion.getInstance().prepareStatement(sql);
            stmt.setInt(1, id_expediteur);
            stmt.setInt(2, id_destinataire);
            stmt.setString(3, contenu);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BoiteMessageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public BoiteMessages getBoiteMessages(int id_proprietaire) {
        String sql = "SELECT * FROM `boitemessages` WHERE `id_destinataire` = ? ";
        BoiteMessages B = new BoiteMessages();
        try {
            PreparedStatement stmt = MyConnexion.getInstance().prepareStatement(sql);
            stmt.setInt(1, id_proprietaire);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                long id = rs.getLong("id");
                int id_expediteur = rs.getInt("id_expediteur");
                int id_destinataire = rs.getInt("id_destinataire");
                short vu = rs.getShort("vu");
                String contenu = rs.getString("contenu");
                B.ajouterMessage(new Message(id, contenu, vu, id_expediteur, id_destinataire));
            }

        } catch (SQLException ex) {
            Logger.getLogger(BoiteMessageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return B;
    }

}

package Interface;

import Entity.BoiteMessages;

/**
 *
 * @author Elyes
 */
public interface IBoiteMessageDAO {
    public void envoyerMessage(int id_expediteur,int id_destinataire,String contenu);
    public BoiteMessages getBoiteMessages(int id_proprietaire);
}

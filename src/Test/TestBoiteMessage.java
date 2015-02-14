package Test;

import DAO.BoiteMessageDAO;
import Entity.BoiteMessages;

/**
 *
 * @author Elyes
 */
public class TestBoiteMessage {

    public static void main(String[] args) {
        // Test envoi message
        BoiteMessageDAO B = new BoiteMessageDAO();
        //B.envoyerMessage(2, 1, "yoww");

        //Test récuperation BoiteMessages
        BoiteMessages Boite = B.getBoiteMessages(1);
        for (int i = 0; i < Boite.box.size(); i++) {
            System.out.println(Boite.box.get(i).getContenu());
        }
    }

}

/*
 * The content is available under the terms of the Creative Commons 
 * Attribution-ShareAlike license (CC-BY-SA), v2.5 or any later version
 */

package Interface;

import Entity.Offre;
import java.util.List;

/**
 *
 * @author FATHALLAH Wael
 */
public interface IOffresDAO {
        public List<Offre> getAllListOfOffre();
        public List<Offre> getAllListOfOffre(int id_gerant);
        public Offre getOffreByID(int id);
        public boolean deleteOffre(int id); 
        public boolean insertOffre(int id_gerant, int id_adresse, String etat, 
                                    String typeImmob,String nature,String payement, 
                                    float surface, int nbrPiece, String datePublication, 
                                    String dateModification, String dispobileAPartir, String description, 
                                    int etage, boolean ascenceur, boolean cuisineEquipe, boolean jardin, 
                                    boolean gazDeVille, boolean chauffage, boolean meuble, 
                                    boolean climatisation, float note, String urlImage); 
        public boolean alterNoteOffre(int id, float note);
}

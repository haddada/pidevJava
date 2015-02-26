package Entity;

import java.util.Objects;

/**
 *
 * @author user
 */
//Il manque un attribut Agence, c'est l'agence dans laquelle est affecté ce gerant
public class Gerant extends Utilisateur {

    //Attributs
   

//Constructeur
    public Gerant() {
        super();
    }

    public Gerant(String num_Fix, String numTel, int id, String mail, String password, String nom, String prenom, String numMobile, String numFix) {
        super(id, mail, password, nom, prenom, numMobile, numFix,1);
       
    }



 
}

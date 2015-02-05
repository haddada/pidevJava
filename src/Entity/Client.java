/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

import java.util.Objects;

/**
 *
 * @author user
 */
public class Client extends Utilisateur{

    //Attribut
    private String statusMatrimonial;
    
    
  //Constructeur
    public Client(int Id, String Nom, String Prenom, String Mail, String Password,String statusMatrimonial) {
        super(Id, Nom, Prenom, Mail, Password);
        this.statusMatrimonial=statusMatrimonial;
    }

    //Getters & Setters
    public String getStatusMatrimonial() {
        return statusMatrimonial;
    }

    public void setStatusMatrimonial(String statusMatrimonial) {
        this.statusMatrimonial = statusMatrimonial;
    }

    //Affichag
    @Override
    public String toString() {
        return "Client{" + "statusMatrimonial=" + statusMatrimonial + '}';
    }

   
//Equals
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Client other = (Client) obj;
        if (!Objects.equals(this.statusMatrimonial, other.statusMatrimonial)) {
            return false;
        }
        return true;
    }
    
    
    
  
    
    
}

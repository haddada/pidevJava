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
public class Gerant extends Utilisateur {
    //Attribus
  private String numFix;
  private String numTel;
//Constructeur
    public Gerant(int Id, String Nom, String Prenom, String Mail, String Password,String numFix,String numTel) {
        super(Id, Nom, Prenom, Mail, Password);
        this.numFix=numFix;
        this.numTel=numTel;
    }

    //Getters & Setters
    public String getNumFix() {
        return numFix;
    }

    public void setNumFix(String numFix) {
        this.numFix = numFix;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
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
        final Gerant other = (Gerant) obj;
        if (!Objects.equals(this.numFix, other.numFix)) {
            return false;
        }
        if (!Objects.equals(this.numTel, other.numTel)) {
            return false;
        }
        return true;
    }
//Affichage
    @Override
    public String toString() {
        return "Gerant{" + "numFix=" + numFix + ", numTel=" + numTel + '}';
    }
    
    
    
    
    
    
    
    
    
}

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
public class Agence {
    
  //Attribus
    private int Id;
    private String Nom;
    private String Ville;
    private String Description;
    private String Adresse;

    //Constructeur
    public Agence() {
    }
    
    public Agence(int Id, String Nom, String Ville, String Description, String Adresse) {
        this.Id = Id;
        this.Nom = Nom;
        this.Ville = Ville;
        this.Description = Description;
        this.Adresse = Adresse;
    }

    //Getters & Setters
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String Ville) {
        this.Ville = Ville;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
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
        final Agence other = (Agence) obj;
        if (this.Id != other.Id) {
            return false;
        }
        if (!Objects.equals(this.Nom, other.Nom)) {
            return false;
        }
        if (!Objects.equals(this.Ville, other.Ville)) {
            return false;
        }
        if (!Objects.equals(this.Description, other.Description)) {
            return false;
        }
        if (!Objects.equals(this.Adresse, other.Adresse)) {
            return false;
        }
        return true;
    }
//Affichage
    @Override
    public String toString() {
        return "Agence{" + "Id=" + Id + ", Nom=" + Nom + ", Ville=" + Ville + ", Description=" + Description + ", Adresse=" + Adresse + '}';
    }
    
    
    
   
}

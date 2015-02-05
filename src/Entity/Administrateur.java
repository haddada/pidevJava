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
public class Administrateur {
    
    //Declcaration des attribus
    private int Id;
    private String Nom;
    private String Prenom;
    private String Login;
    private String Password;

    //Constructeur
    public Administrateur(int Id, String Nom, String Prenom, String Login, String Password) {
        this.Id = Id;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Login = Login;
        this.Password = Password;
    }

  //Getters and Setters
    public int getId() {
        return Id;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public String getLogin() {
        return Login;
    }

    public String getPassword() {
        return Password;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

//Methode equals 
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Administrateur other = (Administrateur) obj;
        if (this.Id != other.Id) {
            return false;
        }
        if (!Objects.equals(this.Nom, other.Nom)) {
            return false;
        }
        if (!Objects.equals(this.Prenom, other.Prenom)) {
            return false;
        }
        if (!Objects.equals(this.Login, other.Login)) {
            return false;
        }
        if (!Objects.equals(this.Password, other.Password)) {
            return false;
        }
        return true;
    }

    //Affichage
    @Override
    public String toString() {
        return "Administrateur{" + "Id=" + Id + ", Nom=" + Nom + ", Prenom=" + Prenom + ", Login=" + Login + ", Password=" + Password + '}';
    }
    
    
}

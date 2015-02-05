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
public class Utilisateur {
    
    private int Id;
    private String Nom;
    private String Prenom;
    private String Mail;
    private String Password;

    public Utilisateur(int Id, String Nom, String Prenom, String Mail, String Password) {
        this.Id = Id;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Mail = Mail;
        this.Password = Password;
    }

    public int getId() {
        return Id;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public String getMail() {
        return Mail;
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

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "Id=" + Id + ", Nom=" + Nom + ", Prenom=" + Prenom + ", Mail=" + Mail + ", Password=" + Password + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Utilisateur other = (Utilisateur) obj;
        if (this.Id != other.Id) {
            return false;
        }
        if (!Objects.equals(this.Nom, other.Nom)) {
            return false;
        }
        if (!Objects.equals(this.Prenom, other.Prenom)) {
            return false;
        }
        if (!Objects.equals(this.Mail, other.Mail)) {
            return false;
        }
        if (!Objects.equals(this.Password, other.Password)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
    
}

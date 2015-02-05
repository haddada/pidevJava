/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

/**
 *
 * @author user
 */
public class Appartement extends BienImmobilier {

    //Attribus
    int nbrPiece;
    int locEtage;
    boolean ascenseur;

    //Constructeur
    public Appartement(int nbrPiece, int locEtage, boolean ascenseur, int Id, String Descritpion, String superFicie) {
        super(Id, Descritpion, superFicie);
        this.nbrPiece = nbrPiece;
        this.locEtage = locEtage;
        this.ascenseur = ascenseur;
    }

    //Getters & Setters
    public int getNbrPiece() {
        return nbrPiece;
    }

    public void setNbrPiece(int nbrPiece) {
        this.nbrPiece = nbrPiece;
    }

    public int getLocEtage() {
        return locEtage;
    }

    public void setLocEtage(int locEtage) {
        this.locEtage = locEtage;
    }

    public boolean isAscenseur() {
        return ascenseur;
    }

    public void setAscenseur(boolean ascenseur) {
        this.ascenseur = ascenseur;
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
        final Appartement other = (Appartement) obj;
        if (this.nbrPiece != other.nbrPiece) {
            return false;
        }
        if (this.locEtage != other.locEtage) {
            return false;
        }
        if (this.ascenseur != other.ascenseur) {
            return false;
        }
        return true;
    }

    //Affichage
    @Override
    public String toString() {
        return "Appartement{" + "nbrPiece=" + nbrPiece + ", locEtage=" + locEtage + ", ascenseur=" + ascenseur + '}';
    }
    
    
    }
    


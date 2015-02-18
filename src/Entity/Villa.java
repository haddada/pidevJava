/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

/**
 *
 * @author ShujiX
 */
public class Villa extends BienImmobilier{

    //constructeur vide
    public Villa() {
        super();
    }
    
    //avec id 
    public Villa(int id, float surface, String etat, Adresse adresse,String descritpion, int nbr_piece,
                int cuisineEquipe, int gaz_de_ville,int chauffage, int meuble,int climatisation) {
        super(id, surface, etat, adresse);
        this.typeImmob="v";
        this.nbr_piece=nbr_piece;
        this.cuisineEquipe=cuisineEquipe;
        this.gaz_de_ville=gaz_de_ville;
        this.chauffage=chauffage;
        this.climatisation=climatisation;
        this.meuble=meuble; 
        this.descritpion=descritpion;
    }
    
    //sans id 
    public Villa( float surface, String etat, Adresse adresse,String descritpion,int nbr_piece,
                int cuisineEquipe, int gaz_de_ville,int chauffage,int climatisation, int jardin,int meuble) {
        super(descritpion, surface, etat, adresse);
        this.typeImmob="v";
        this.nbr_piece=nbr_piece;
        this.cuisineEquipe=cuisineEquipe;
        this.gaz_de_ville=gaz_de_ville;
        this.climatisation=climatisation;
        this.chauffage=chauffage;
        this.jardin=jardin;
        this.meuble=meuble;

    }

    public String getDescritpion() {
        return descritpion;
    }

    public void setDescritpion(String descritpion) {
        this.descritpion = descritpion;
    }

    public float getSurface() {
        return surface;
    }

    public void setSurface(float surface) {
        this.surface = surface;
    }

    public String getTypeImmob() {
        return typeImmob;
    }

    public void setTypeImmob(String typeImmob) {
        this.typeImmob = typeImmob;
    }

    public int getNbr_piece() {
        return nbr_piece;
    }

    public void setNbr_piece(int nbr_piece) {
        this.nbr_piece = nbr_piece;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public int getMeuble() {
        return meuble;
    }

    public void setMeuble(int meuble) {
        this.meuble = meuble;
    }

    public int getJardin() {
        return jardin;
    }

    public void setJardin(int jardin) {
        this.jardin = jardin;
    }

    public int getGaz_de_ville() {
        return gaz_de_ville;
    }

    public void setGaz_de_ville(int gaz_de_ville) {
        this.gaz_de_ville = gaz_de_ville;
    }

    public int getCuisineEquipe() {
        return cuisineEquipe;
    }

    public void setCuisineEquipe(int cuisineEquipe) {
        this.cuisineEquipe = cuisineEquipe;
    }

    public int getClimatisation() {
        return climatisation;
    }

    public void setClimatisation(int climatisation) {
        this.climatisation = climatisation;
    }

    public int getChauffage() {
        return chauffage;
    }

    public void setChauffage(int chauffage) {
        this.chauffage = chauffage;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
    
    
    
    
    
    
}

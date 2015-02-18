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
public class Offre {
    
    //Attribus
    private int     Id;
    private int     id_gerant;
    private int     id_adresse;
    private String  etat;
    private String  typeImmob;
    private String  nature;
    private String  payement;
    private float    surface;
    private int     nbrPiece;
    private String  datePublication;
    private String  dateModification;
    private String  dispobileAPartir;
    private String  description;
    private int     etage;
    private boolean ascenceur;
    private boolean cuisineEquipe;
    private boolean jardin;
    private boolean entreeIndep;
    private boolean gazDeVille;
    private boolean chauffage;
    private boolean meuble;
    private boolean climatisation;
    private float   note;
    private String  urlImage;
    private String  position;

    //Constructeur
    public Offre(){}
    public Offre(int Id, int id_gerant, int id_adresse, String etat, String typeImmob, String nature, String payement, float surface, int nbrPiece, String datePublication, String dateModification, String dispobileAPartir, String description, int etage, boolean ascenceur, boolean cuisineEquipe, boolean jardin, boolean entreeIndep, boolean gazDeVille, boolean chauffage, boolean meuble, boolean climatisation, float note, String urlImage, String  position) {
        this.Id = Id;
        this.id_gerant = id_gerant;
        this.id_adresse = id_adresse;
        this.etat = etat;
        this.typeImmob = typeImmob;
        this.nature = nature;
        this.payement = payement;
        this.surface = surface;
        this.nbrPiece = nbrPiece;
        this.datePublication = datePublication;
        this.dateModification = dateModification;
        this.dispobileAPartir = dispobileAPartir;
        this.description = description;
        this.etage = etage;
        this.ascenceur = ascenceur;
        this.cuisineEquipe = cuisineEquipe;
        this.jardin = jardin;
        this.entreeIndep = entreeIndep;
        this.gazDeVille = gazDeVille;
        this.chauffage = chauffage;
        this.meuble = meuble;
        this.climatisation = climatisation;
        this.note = note;
        this.urlImage = urlImage;
        this.position = position;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getId_gerant() {
        return id_gerant;
    }

    public void setId_gerant(int id_gerant) {
        this.id_gerant = id_gerant;
    }

    public int getId_adresse() {
        return id_adresse;
    }

    public void setId_adresse(int id_adresse) {
        this.id_adresse = id_adresse;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getTypeImmob() {
        return typeImmob;
    }

    public void setTypeImmob(String typeImmob) {
        this.typeImmob = typeImmob;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getPayement() {
        return payement;
    }

    public void setPayement(String payement) {
        this.payement = payement;
    }

    public float getSurface() {
        return surface;
    }

    public void setSurface(float surface) {
        this.surface = surface;
    }

    public int getNbrPiece() {
        return nbrPiece;
    }

    public void setNbrPiece(int nbrPiece) {
        this.nbrPiece = nbrPiece;
    }

    public String getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(String datePublication) {
        this.datePublication = datePublication;
    }

    public String getDateModification() {
        return dateModification;
    }

    public void setDateModification(String dateModification) {
        this.dateModification = dateModification;
    }

    public String getDispobileAPartir() {
        return dispobileAPartir;
    }

    public void setDispobileAPartir(String dispobileAPartir) {
        this.dispobileAPartir = dispobileAPartir;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public boolean isAscenceur() {
        return ascenceur;
    }

    public void setAscenceur(boolean ascenceur) {
        this.ascenceur = ascenceur;
    }

    public boolean isCuisineEquipe() {
        return cuisineEquipe;
    }

    public void setCuisineEquipe(boolean cuisineEquipe) {
        this.cuisineEquipe = cuisineEquipe;
    }

    public boolean isJardin() {
        return jardin;
    }

    public void setJardin(boolean jardin) {
        this.jardin = jardin;
    }

    public boolean isEntreeIndep() {
        return entreeIndep;
    }

    public void setEntreeIndep(boolean entreeIndep) {
        this.entreeIndep = entreeIndep;
    }

    public boolean isGazDeVille() {
        return gazDeVille;
    }

    public void setGazDeVille(boolean gazDeVille) {
        this.gazDeVille = gazDeVille;
    }

    public boolean isChauffage() {
        return chauffage;
    }

    public void setChauffage(boolean chauffage) {
        this.chauffage = chauffage;
    }

    public boolean isMeuble() {
        return meuble;
    }

    public void setMeuble(boolean meuble) {
        this.meuble = meuble;
    }

    public boolean isClimatisation() {
        return climatisation;
    }

    public void setClimatisation(boolean climatisation) {
        this.climatisation = climatisation;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    @Override
    public String toString() {
        return "Offre{" + "Id=" + Id + ", id_gerant=" + id_gerant + ", id_adresse=" + id_adresse + ", etat=" + etat + ", typeImmob=" + typeImmob + ", nature=" + nature + ", payement=" + payement + ", surface=" + surface + ", nbrPiece=" + nbrPiece + ", datePublication=" + datePublication + ", dateModification=" + dateModification + ", dispobileAPartir=" + dispobileAPartir + ", description=" + description + ", etage=" + etage + ", ascenceur=" + ascenceur + ", cuisineEquipe=" + cuisineEquipe + ", jardin=" + jardin + ", gazDeVille=" + gazDeVille + ", chauffage=" + chauffage + ", meuble=" + meuble + ", climatisation=" + climatisation + ", note=" + note + ", urlImage=" + urlImage + '}';
    }
    
}
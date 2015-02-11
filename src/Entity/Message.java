package Entity;

/**
 *
 * @author Elyes
 */
public class Message {

    private long id;
    private String contenu;
    private short vu;
    private short minute;
    private short heure;
    private short jour;
    private short mois;
    private short annee;
    private int id_expediteur;
    private int id_destinataire;

    public Message() {
    }

    public Message(long id, String contenu, short vu, int id_expediteur, int id_destinataire) {
        this.id = id;
        this.contenu = contenu;
        this.vu = vu;
        this.id_expediteur = id_expediteur;
        this.id_destinataire = id_destinataire;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public short getVu() {
        return vu;
    }

    public void setVu(short vu) {
        this.vu = vu;
    }

    public short getMinute() {
        return minute;
    }

    public void setMinute(short minute) {
        this.minute = minute;
    }

    public short getHeure() {
        return heure;
    }

    public void setHeure(short heure) {
        this.heure = heure;
    }

    public short getMois() {
        return mois;
    }

    public void setMois(short mois) {
        this.mois = mois;
    }

    public short getAnnee() {
        return annee;
    }

    public void setAnnee(short annee) {
        this.annee = annee;
    }

    public int getId_expediteur() {
        return id_expediteur;
    }

    public void setId_expediteur(int id_expediteur) {
        this.id_expediteur = id_expediteur;
    }

    public int getId_destinataire() {
        return id_destinataire;
    }

    public void setId_destinataire(int id_destinataire) {
        this.id_destinataire = id_destinataire;
    }

}

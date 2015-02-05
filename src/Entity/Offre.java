/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

import java.util.Date;
import java.util.Objects;



/**
 *
 * @author user
 */
public class Offre {
    
    //Attribus
    private int Id;
    private String Type;
    private String Description;
    private String Etat;
    private Date datePublication;
    private Date dateModification;

    //Constructeur
    public Offre(int Id, String Type, String Description, String Etat, Date datePublication, Date dateModification) {
        this.Id = Id;
        this.Type = Type;
        this.Description = Description;
        this.Etat = Etat;
        this.datePublication = datePublication;
        this.dateModification = dateModification;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getEtat() {
        return Etat;
    }

    public void setEtat(String Etat) {
        this.Etat = Etat;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }

    public Date getDateModification() {
        return dateModification;
    }

    public void setDateModification(Date dateModification) {
        this.dateModification = dateModification;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Offre other = (Offre) obj;
        if (this.Id != other.Id) {
            return false;
        }
        if (!Objects.equals(this.Type, other.Type)) {
            return false;
        }
        if (!Objects.equals(this.Description, other.Description)) {
            return false;
        }
        if (!Objects.equals(this.Etat, other.Etat)) {
            return false;
        }
        if (!Objects.equals(this.datePublication, other.datePublication)) {
            return false;
        }
        if (!Objects.equals(this.dateModification, other.dateModification)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Offre{" + "Id=" + Id + ", Type=" + Type + ", Description=" + Description + ", Etat=" + Etat + ", datePublication=" + datePublication + ", dateModification=" + dateModification + '}';
    }

}

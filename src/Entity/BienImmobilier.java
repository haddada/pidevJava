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
public class BienImmobilier {
    
    //Attribus
    private int Id;
    private String Descritpion;
    private String superFicie;

   //Constructeur
    public BienImmobilier(int Id, String Descritpion, String superFicie) {
        this.Id = Id;
        this.Descritpion = Descritpion;
        this.superFicie = superFicie;
    }

    //Getters & Setters
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDescritpion() {
        return Descritpion;
    }

    public void setDescritpion(String Descritpion) {
        this.Descritpion = Descritpion;
    }

    public String getSuperFicie() {
        return superFicie;
    }

    public void setSuperFicie(String superFicie) {
        this.superFicie = superFicie;
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
        final BienImmobilier other = (BienImmobilier) obj;
        if (this.Id != other.Id) {
            return false;
        }
        if (!Objects.equals(this.Descritpion, other.Descritpion)) {
            return false;
        }
        if (!Objects.equals(this.superFicie, other.superFicie)) {
            return false;
        }
        return true;
    }

    //Affichage
    @Override
    public String toString() {
        return "BienImmobilier{" + "Id=" + Id + ", Descritpion=" + Descritpion + ", superFicie=" + superFicie + '}';
    }
   

    
}

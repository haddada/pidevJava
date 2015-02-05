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
public class Entrepot extends BienImmobilier {

    
    //Attribut
   private String Description;
   //Constructeur
    public Entrepot(int Id, String Descritpion, String superFicie,String Description) {
        super(Id, Descritpion, superFicie);
        this.Description=Description;
    }

    //Getters & Seters
    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
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
        final Entrepot other = (Entrepot) obj;
        if (!Objects.equals(this.Description, other.Description)) {
            return false;
        }
        return true;
    }
//Affichage
    @Override
    public String toString() {
        return "Entrepot{" + "Description=" + Description + '}';
    }
    
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

import Entity.Offre;
import java.util.List;

/**
 *
 * @author ShujiX
 */
public interface IOffreDAO {
     public void insertOffre(Offre o);
    public void deleteOffre(int id);
    public List<Offre> displayAll();
    public Offre findOffreById(int id);
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

import Entity.Gerant;
import java.util.List;

/**
 *
 * @author ShujiX
 */
public interface IGerantDAO {
    
    public void insertGerant(Gerant g);
    public void deleteGerant(int id);
    public List<Gerant> displayAll();
    public Gerant findGerantById(int id);
    
}

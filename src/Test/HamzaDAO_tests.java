/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;

import DAO.AdresseDAO;
import Entity.Adresse;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ShujiX
 */
public class HamzaDAO_tests {
    
    public static  void  main(String args[]){
    AdresseDAO d=new AdresseDAO();
    List<Adresse> lst=d.findInstant("28");
    Iterator<Adresse> it=lst.iterator();
    while(it.hasNext()){
        System.out.println(it.next().toString());
        }
    
    }
    
}

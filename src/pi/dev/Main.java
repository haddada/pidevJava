/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.dev;

import DAO.AdministrateurDAO;
import DAO.SuperAdminDAO;
import Entity.Administrateur;
import Entity.SuperAdmin;

/**
 *
 * @author seif
 */
public class Main {
    
    public static void main(String []args){
         SuperAdminDAO adDAO =new SuperAdminDAO();
        SuperAdmin adm=new SuperAdmin(1,"haddada", "seif", "root","root", "seif@gmail");
        adDAO.insertAdmin(adm);
    }
   
    
    
}

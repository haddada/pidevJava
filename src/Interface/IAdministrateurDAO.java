/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

/**
 *
 * @author user
 */
public interface IAdministrateurDAO {
    
//Authentification
    public boolean signIn(String Login,String Password);
   //Gestion des utilisateurs
    public void consulterGerant();
    public void trierGerant();
    public void supprimerGerant();
  
    public void consulterClient();
    public void trierClient();
    public void supprimerClient();
    
    //Génération des statistiques
    public void afficherStat();
    //Gestion des offres
    public void modifierOffre();
    public void consulterOffre();
    public void supprimerOffre();
    
    //Communication
    public void envoyerMsgGerant();
    public void envoyerMsgClient();
    public void consulterBoite();
    public void lireMsg();
    public void supprimerMsg();
    //Gestion des comptes
    public void modifierPassword();
    public void modifierNomUtilisateur();
    
    
    
  
    
}

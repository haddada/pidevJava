package Technique;

import DAO.UtilisateurDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MyConnection {
    
    
   
final private String url="jdbc:mysql://localhost:3306/agenceimmob";
final  private String login="root";
final  private String pwd="";
 private static Connection instance;
    
    
    private MyConnection()
    {
            try {instance=DriverManager.getConnection(url,login,pwd);
            System.out.println("Connected");
            }catch(SQLException e)
            {
               Logger.getLogger(UtilisateurDAO.class.getName()).log(Level.SEVERE, null, e);  
            }
    }
    
    public static Connection getInstance()
       { 
           if (instance==null)
                new MyConnection();
        
            return instance;
        }
}
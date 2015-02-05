/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Technique;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MyConnexion {
    
    
   
final private String url="jdbc:mysql://localhost/:3306/ds";
final private String login="root";
final private String pwd="root";
private static Connection instance;
    
    private MyConnexion()
    {
            try {instance=DriverManager.getConnection(url,login,pwd);
          System.out.println("Connected");
            }catch(SQLException e)
            {
                Logger.getLogger(MyConnexion.class.getName()).log(Level.SEVERE,null,e);
                
            }
    }
    
    public static Connection getInstance()
       { 
           if (instance==null)
                new MyConnexion();
        
            return instance;
        }
}
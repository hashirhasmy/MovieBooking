
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author choy
 */
public class dbcon {
    
        Connection con;
        Statement statement;
         
    public Connection getdbcon(){
             
         try {  
        Class.forName("com.mysql.jdbc.Driver");  
        // establish connection  
        con = DriverManager.getConnection("jdbc:mysql://localhost/test1", "root", "");  
        statement = con.createStatement();  
              
    } catch (SQLException | ClassNotFoundException e) {  
        JOptionPane.showMessageDialog(null, e);  
    }         
       return con;        
    }   
}

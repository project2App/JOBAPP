/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connect {
   public static Connection DBConnect() throws SQLException{
    
    String url="jdbc:derby://localhost:1527/JobApp";
    String user="admin1";
    String password="password1";
    
    Connection con =DriverManager.getConnection(url, user, password);
       return con;
    
    } 
}

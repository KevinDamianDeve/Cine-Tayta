/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kevin Damian
 */
public class Conexion
{
 public static Connection conectar() throws SQLException
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
          return  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/kevindamian2","root","");
        } catch (ClassNotFoundException ex) {
           return null;
        }
        catch(SQLException ex)
        {
            return null;
        }
    }    
}

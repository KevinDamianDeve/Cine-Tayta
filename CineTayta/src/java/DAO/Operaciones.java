/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
/**
 *
 * @author Kevin Damian
 */
public class Operaciones
{
    String driver;
    String url;
    String uss;
    String contra;

    public Operaciones() {
        this.driver = "com.mysql.jdbc.Driver";
        this.url = "jdbc:mysql://localhost:3306/kevindamian2";
        this.uss = "root";
        this.contra = "";
    }
    
    public int loguear(String us, String pass)
    {
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;
        
        int nivel=0;
        String sql=" select nivel from usuario where usuario='"+ us +"' and contraseña= '"+ pass+"' ";
        try {
            Class.forName(this.driver);
            conn=DriverManager.getConnection(
            this.url,
                    this.uss,
                    this.contra
            );
            
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
            
            while(rs.next())
            {
                nivel=rs.getInt(1);
              
                
            }
            conn.close();
            
            
            
        } catch (ClassNotFoundException | SQLException e) {
        }
        
        
        
        return nivel;
    }
    
    
}

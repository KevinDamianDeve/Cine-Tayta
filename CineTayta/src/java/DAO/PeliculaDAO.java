/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import MODEL.Pelicula;
/**
 *
 * @author Kevin Damian
 */
public class PeliculaDAO 
{
      public static boolean registrar(Pelicula p) throws SQLException
    {
        try{
        CallableStatement cs=null;
        
        Connection con=Conexion.conectar();
        CallableStatement sp=con.prepareCall("{call sp_ingresarpelicula(?,?,?,?,?,?,?,?,?,?)}");
        sp.setString(1,p.getNombre());
        sp.setString(2, p.getDuracion());
        sp.setString(3, p.getPais());
        sp.setString(4, p.getAño());
        sp.setString(5, p.getDirector());
        sp.setString(6, p.getProtagonistas());
        sp.setString(7, p.getIdgenero());
        sp.setString(8, p.getHora_c());
        sp.setFloat(9, p.getPrecio());
        sp.setString(10, p.getNsala());
        

        
        if(sp.executeUpdate()>0)
        { return true;    
        }else{
            return false;
        }
        }
        catch(SQLException ex)
        {
            return false;
        }
        
    }
      
            public static ArrayList<MODEL.Pelicula> listar() throws SQLException
    {
       String SQL="select * from pelicula";
       Connection con=Conexion.conectar();
        PreparedStatement st=con.prepareStatement(SQL);
        ResultSet resultado=st.executeQuery();
        ArrayList<MODEL.Pelicula> lista=new ArrayList<>();
        MODEL.Pelicula p;
        
        while(resultado.next())
        {
            p=new MODEL.Pelicula();
            p.setIdpelicula(resultado.getString("idpelicula"));
            p.setNombre(resultado.getString("nombre"));
            p.setDuracion(resultado.getString("duracion"));
            p.setPais(resultado.getString("pais"));
            p.setAño(resultado.getString("año"));
            p.setDirector(resultado.getString("director"));
            p.setProtagonistas(resultado.getString("protagonistas"));
            p.setIdgenero(resultado.getString("idgenero"));
            p.setHora_c(resultado.getString("hora_c"));
            p.setPrecio(resultado.getFloat("precio"));
            p.setNsala(resultado.getString("nsala"));
       
            lista.add(p);
        }
        return lista;
    }
      
                      public static MODEL.Pelicula getIdPelicula(String id)
{
    Pelicula p= new Pelicula();

try{
Connection con=DAO.Conexion.conectar();
PreparedStatement ps=con.prepareStatement("select * from  pelicula where idpelicula=?");
ps.setString(1, id);
ResultSet rs=ps.executeQuery();
if(rs.next())
{
p.setIdpelicula(rs.getString(1));
p.setNombre(rs.getString(2));
p.setDuracion(rs.getString(3));
p.setPais(rs.getString(4));
p.setAño(rs.getString(5));
p.setDirector(rs.getString(6));
p.setProtagonistas(rs.getString(7));
p.setIdgenero(rs.getString(8));
p.setHora_c(rs.getString(9));
p.setPrecio(rs.getFloat(10));
p.setNsala(rs.getString(11));



con.close();

}}
catch(SQLException ex)
{
ex.printStackTrace();
}
return p;
} 
      
    public static boolean modificarpelicula(MODEL.Pelicula pe) throws SQLException
    {
        try
        {
            CallableStatement cs=null;
            Connection con =Conexion.conectar();
            CallableStatement sp=con.prepareCall("{call sp_modificarpelicula(?,?,?,?,?,?,?,?,?,?,?)}");
            sp.setString(1,pe.getIdpelicula());
            sp.setString(2, pe.getNombre());
            sp.setString(3,pe.getDuracion());
            sp.setString(4,pe.getPais());
            sp.setString(5, pe.getAño());
            sp.setString(6, pe.getDirector());
            sp.setString(7, pe.getProtagonistas());
            sp.setString(8, pe.getIdgenero() );
            sp.setString(9,pe.getHora_c());
            sp.setFloat(10,pe.getPrecio());
            sp.setString(11, pe.getNsala());
           

            
            if (sp.executeUpdate()>0)
            {
                return true;
            }else
            {
                return false;
            }

       }
        catch (SQLException ex)
       {
           return false;
       }
        
        
        
  }  
    
    
    
                 public static boolean eliminar(Pelicula p) throws SQLException
    {
        try{
        CallableStatement cs=null;
        
        Connection con=Conexion.conectar();
        CallableStatement sp=con.prepareCall("{call sp_eliminarpelicula(?)}");
        sp.setString(1, p.getIdpelicula());
       
        if(sp.executeUpdate()>0)
        { return true;    
        }else{
            return false;
        }
        }catch(SQLException ex)
        { return false;}
        
    }
                      
                      
                      
    
}

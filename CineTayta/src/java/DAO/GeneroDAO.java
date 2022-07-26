/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
import MODEL.Genero;
import java.util.ArrayList;
/**
 *
 * @author Kevin Damian
 */
public class GeneroDAO 

{
    
      public static boolean registrar(Genero ge) throws SQLException
    {
        try{
        CallableStatement cs=null;
        
        Connection con=Conexion.conectar();
        CallableStatement sp=con.prepareCall("{call sp_ingresargenero(?)}");
        sp.setString(1,ge.getGenero());
        
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
      
               public static ArrayList<MODEL.Genero> listar() throws SQLException
    {
       String SQL="select * from genero";
       Connection con=Conexion.conectar();
        PreparedStatement st=con.prepareStatement(SQL);
        ResultSet resultado=st.executeQuery();
        ArrayList<MODEL.Genero> lista=new ArrayList<>();
        MODEL.Genero ge;
        
        while(resultado.next())
        {
            ge=new MODEL.Genero();
            ge.setIdgenero(resultado.getString("idgenero"));
            ge.setGenero(resultado.getString("genero"));
          
       
            lista.add(ge);
        }
        return lista;
    }
               
               
               
public static MODEL.Genero getIdGenero(String id)
{
    Genero ge= new Genero();

try{
Connection con=DAO.Conexion.conectar();
PreparedStatement ps=con.prepareStatement("select * from  genero where idgenero=?");
ps.setString(1, id);
ResultSet rs=ps.executeQuery();
if(rs.next())
{
ge.setIdgenero(rs.getString(1));
ge.setGenero(rs.getString(2));

con.close();

}}
catch(SQLException ex)
{
ex.printStackTrace();
}
return ge;
} 


 public static boolean modificargenero(MODEL.Genero ge) throws SQLException
    {
        try
        {
            CallableStatement cs=null;
            Connection con =Conexion.conectar();
            CallableStatement sp=con.prepareCall("{call sp_modificargenero(?,?)}");
            sp.setString(1,ge.getIdgenero());
            sp.setString(2, ge.getGenero());

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
  
                 public static boolean eliminar(Genero ge) throws SQLException
    {
        try{
        CallableStatement cs=null;
        
        Connection con=Conexion.conectar();
        CallableStatement sp=con.prepareCall("{call sp_eliminargenero(?)}");
        sp.setString(1, ge.getIdgenero());
       
        if(sp.executeUpdate()>0)
        { return true;    
        }else{
            return false;
        }
        }catch(SQLException ex)
        { return false;}
        
    }
      


      
      
    
}

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
import MODEL.Proveedor;
/**
 *
 * @author Kevin Damian
 */
public class ProveedorDAO 
{
      public static boolean registrar(Proveedor pr) throws SQLException
    {
        try{
        CallableStatement cs=null;
        
        Connection con=Conexion.conectar();
        CallableStatement sp=con.prepareCall("{call sp_ingresarproveedor(?,?,?)}");
        sp.setString(1,pr.getNombre());
        sp.setString(2,pr.getDireccion());
        sp.setString(3,pr.getTelefono());
        
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
      
         public static boolean modificarproveedor(MODEL.Proveedor pr) throws SQLException
    {
        try
        {
            CallableStatement cs=null;
            Connection con =Conexion.conectar();
            CallableStatement sp=con.prepareCall("{call sp_modificarproveedor(?,?,?,?)}");
            sp.setString(1, pr.getIdproveedor());
            sp.setString(2, pr.getNombre());
            sp.setString(3,pr.getDireccion());
            sp.setString(4,pr.getTelefono());
            
            if (sp.executeUpdate()>0)
            {
                return true;
            }else
            {
                return false;
            }

       }catch (SQLException ex)
       {
           return false;
       }
        
        
        
  }
         
             
         public static ArrayList<MODEL.Proveedor> listar() throws SQLException
    {
       String SQL="select * from proveedor";
       Connection con=Conexion.conectar();
        PreparedStatement st=con.prepareStatement(SQL);
        ResultSet resultado=st.executeQuery();
        ArrayList<MODEL.Proveedor> lista=new ArrayList<>();
        MODEL.Proveedor pr;
        
        while(resultado.next())
        {
            pr=new MODEL.Proveedor();
            pr.setIdproveedor(resultado.getString("idproveedor"));
            pr.setNombre(resultado.getString("nombre"));
            pr.setDireccion(resultado.getString("direccion"));
            pr.setTelefono(resultado.getString("telefono"));
            lista.add(pr);
        }
        return lista;
    }
    
            public static boolean eliminar(Proveedor pr) throws SQLException
    {
        try{
        CallableStatement cs=null;
        
        Connection con=Conexion.conectar();
        CallableStatement sp=con.prepareCall("{call sp_eliminarproveedor(?)}");
        sp.setString(1, pr.getIdproveedor());
       
        if(sp.executeUpdate()>0)
        { return true;    
        }else{
            return false;
        }
        }catch(SQLException ex)
        { return false;}
     
}
            
                          public static MODEL.Proveedor getIdproveedor(String id) throws SQLException
{
MODEL.Proveedor pr=new MODEL.Proveedor();
try{
Connection con=DAO.Conexion.conectar();
PreparedStatement ps=con.prepareStatement("select * from proveedor where idproveedor=?");
ps.setString(1, id);
ResultSet rs=ps.executeQuery();
if(rs.next())
{
pr.setIdproveedor(rs.getString(1));
pr.setNombre(rs.getString(2));
pr.setDireccion(rs.getString(3));
pr.setTelefono(rs.getString(4));
con.close();

}}
catch(SQLException ex)
{

}
return pr;
}
   }         
          
            






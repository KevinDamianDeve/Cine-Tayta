/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.Cliente;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Kevin Damian
 */
public class ClienteDAO 

{
   public static boolean registrar(Cliente cl) throws SQLException
    {
        try{
        CallableStatement cs=null;
        
        Connection con=Conexion.conectar();
        CallableStatement sp=con.prepareCall("{call sp_ingresarcliente(?,?,?,?)}");
        sp.setString(1,cl.getNombre());
        sp.setString(2,cl.getDireccion());
        sp.setString(3,cl.getTelefono());
        sp.setString(4,cl.getDni());
        
        if(sp.executeUpdate()>0)
        {
            return true;    
        }else{
            return false;
        }
        }
        catch(SQLException ex)
        {
            return false;
        }
        
    }
   
         
         public static boolean modificarcliente(MODEL.Cliente cl) throws SQLException
    {
        try
        {
            CallableStatement cs=null;
            Connection con =Conexion.conectar();
            CallableStatement sp=con.prepareCall("{call sp_modificarcliente(?,?,?,?,?)}");
            sp.setString(1, cl.getIdcliente());
            sp.setString(2, cl.getNombre());
            sp.setString(3,cl.getDireccion());
            sp.setString(4,cl.getTelefono());
            sp.setString(5, cl.getDni());
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
   
         public static ArrayList<MODEL.Cliente> listar() throws SQLException
    {
       String SQL="select * from cliente";
       Connection con=Conexion.conectar();
        PreparedStatement st=con.prepareStatement(SQL);
        ResultSet resultado=st.executeQuery();
        ArrayList<MODEL.Cliente> lista=new ArrayList<>();
        MODEL.Cliente cl;
        
        while(resultado.next())
        {
            cl=new MODEL.Cliente();
            cl.setIdcliente(resultado.getString("idcliente"));
            cl.setNombre(resultado.getString("nombre"));
            cl.setDireccion(resultado.getString("direccion"));
            cl.setTelefono(resultado.getString("telefono"));
            cl.setDni(resultado.getString("dni"));
            lista.add(cl);
        }
        return lista;
    } 
    
    
             public static boolean eliminar(Cliente  cl) throws SQLException
    {
        try{
        CallableStatement cs=null;
        
        Connection con=Conexion.conectar();
        CallableStatement sp=con.prepareCall("{call sp_eliminarcliente(?)}");
        sp.setString(1, cl.getIdcliente());
       
        if(sp.executeUpdate()>0)
        { return true;    
        }else{
            return false;
        }
        }catch(SQLException ex)
        { return false;}
     
}
             
public static MODEL.Cliente getICliente(String id) throws SQLException
{
MODEL.Cliente pr=new MODEL.Cliente();
try{
Connection con=DAO.Conexion.conectar();
PreparedStatement ps=con.prepareStatement("select * from cliente where idcliente=?");
ps.setString(1, id);
ResultSet rs=ps.executeQuery();
if(rs.next())
{ 
pr.setIdcliente(rs.getString(1));
pr.setNombre(rs.getString(2));
pr.setDireccion(rs.getString(3));
pr.setTelefono(rs.getString(4));
pr.setDni(rs.getString(5));
con.close();

}}
catch(SQLException ex)
{

}
return pr;
}
             
             
    
}

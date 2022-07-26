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
import MODEL.Producto;
/**
 *
 * @author Kevin Damian
 */
public class ProductoDAO 
{
       public static boolean registrar(Producto prod) throws SQLException
    {
        try{
        CallableStatement cs=null;
        
        Connection con=Conexion.conectar();
        CallableStatement sp=con.prepareCall("{call sp_ingresarproducto(?,?,?,?,?,?,?)}");
        sp.setString(1,prod.getDescripcion());
        sp.setFloat(2,prod.getPrecio());
        sp.setFloat(3, prod.getStock());
        sp.setString(4,prod.getFechav());
        sp.setString(5,prod.getPresentacion());
        sp.setString(6,prod.getEstado());
        sp.setString(7,prod.getObservacion());
        
        
        if(sp.executeUpdate()>0)
        {
            return true;    
        }
        else
        {
            return false;
        }
        }
        catch(SQLException ex)
        {
            return false;
        }
        
    }
    
    
      public static boolean modificarproducto(MODEL.Producto prod) throws SQLException
    {
        try
        {
            CallableStatement cs=null;
            Connection con =Conexion.conectar();
            CallableStatement sp=con.prepareCall("{call sp_modificarproducto(?,?,?,?,?,?,?,?)}");
            sp.setString(1,prod.getIdproducto());
            sp.setString(2,prod.getDescripcion());
        sp.setFloat(3,prod.getPrecio());
        sp.setFloat(4,prod.getStock());
        sp.setString(5, prod.getFechav());
        sp.setString(6,prod.getPresentacion());
        sp.setString(7,prod.getEstado());
        sp.setString(8,prod.getObservacion());

            
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
      
           public static MODEL.Producto getIdproducto(String id)
{
    Producto p= new Producto();

try{
Connection con=DAO.Conexion.conectar();
PreparedStatement ps=con.prepareStatement("select * from  v_productos where idproducto=?");
ps.setString(1, id);
ResultSet rs=ps.executeQuery();
if(rs.next())
{
p.setIdproducto(rs.getString(1));
p.setDescripcion(rs.getString(2));
p.setPrecio(rs.getFloat(3));
p.setStock(rs.getFloat(4));
p.setFechav(rs.getString(5));
p.setPresentacion(rs.getString(6));
p.setEstado(rs.getString(7));
p.setObservacion(rs.getString(8)); 

con.close();

}}
catch(SQLException ex)
{
ex.printStackTrace();
}
return p;
} 
      
        public static ArrayList<MODEL.Producto> listar() throws SQLException
    {
       String SQL="select * from producto";
       Connection con=Conexion.conectar();
        PreparedStatement st=con.prepareStatement(SQL);
        ResultSet resultado=st.executeQuery();
        ArrayList<MODEL.Producto> lista=new ArrayList<>();
        MODEL.Producto p;
        
        while(resultado.next())
        {
           p=new MODEL.Producto();
           p.setIdproducto(resultado.getString("idproducto"));
           p.setDescripcion(resultado.getString("descripcion"));
           p.setPrecio(resultado.getFloat("precio"));
           p.setStock(resultado.getFloat("stock"));
            p.setFechav(resultado.getString("fechav"));
           p.setPresentacion(resultado.getString("presentacion"));
           p.setEstado(resultado.getString("estado"));
           p.setObservacion(resultado.getString("observacion"));
      
           
           
            lista.add(p);
        }
        return lista;
    }     
      
      
      
      
      
              public static boolean eliminar(Producto p) throws SQLException
    {
        try{
        CallableStatement cs=null;
        
        Connection con=Conexion.conectar();
        CallableStatement sp=con.prepareCall("{call sp_eliminarproducto(?)}");
        sp.setString(1, p.getIdproducto());
       
        if(sp.executeUpdate()>0)
        { return true;    
        }else{
            return false;
        }
        }catch(SQLException ex)
        { return false;}
        
    }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
import MODEL.Butaca;
import java.util.ArrayList;
/**
 *
 * @author Kevin Damian
 */
public class ButacaDAO
{
    public static boolean registrar(Butaca bu) throws SQLException
    {
        try{
        CallableStatement cs=null;
        
        Connection con=Conexion.conectar();
        CallableStatement sp=con.prepareCall("{call sp_ingresarbutaca(?)}");
        sp.setString(1,bu.getEstado());
        
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
    
    public static ArrayList<MODEL.Butaca> listar() throws SQLException
    {
       String SQL="select * from butaca";
       Connection con=Conexion.conectar();
        PreparedStatement st=con.prepareStatement(SQL);
        ResultSet resultado=st.executeQuery();
        ArrayList<MODEL.Butaca> lista=new ArrayList<>();
        MODEL.Butaca bu;
        
        while(resultado.next())
        {
            bu=new MODEL.Butaca();
            bu.setNbutaca(resultado.getString("nbutaca"));
            bu.setEstado(resultado.getString("estado"));
          
       
            lista.add(bu);
        }
        return lista;
    }
     
    public static MODEL.Butaca getNButaca(String id)
{
    Butaca bu= new Butaca();

try{
Connection con=DAO.Conexion.conectar();
PreparedStatement ps=con.prepareStatement("select * from  butaca where nbutaca=?");
ps.setString(1, id);
ResultSet rs=ps.executeQuery();
if(rs.next())
{
bu.setNbutaca(rs.getString(1));
bu.setEstado(rs.getString(2));

con.close();

}}
catch(SQLException ex)
{
ex.printStackTrace();
}
return bu;
} 
    
     public static boolean modificarbutaca(MODEL.Butaca bu) throws SQLException
    {
        try
        {
            CallableStatement cs=null;
            Connection con =Conexion.conectar();
            CallableStatement sp=con.prepareCall("{call sp_modificarbutaca(?,?)}");
            sp.setString(1,bu.getNbutaca());
            sp.setString(2, bu.getEstado());

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
                public static boolean eliminar(Butaca bu) throws SQLException
    {
        try{
        CallableStatement cs=null;
        
        Connection con=Conexion.conectar();
        CallableStatement sp=con.prepareCall("{call sp_eliminarbutaca(?)}");
        sp.setString(1, bu.getNbutaca());
       
        if(sp.executeUpdate()>0)
        { return true;    
        }else{
            return false;
        }
        }catch(SQLException ex)
        { return false;}
        
    } 
    
    
    
    
    
}

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
import MODEL.Usuario;
/**
 *
 * @author Kevin Damian
 */
public class UsuarioDAO
{
     public static boolean registrar(Usuario us) throws SQLException
    {
        try{
        CallableStatement cs=null;
        
        Connection con=Conexion.conectar();
        CallableStatement sp=con.prepareCall("{call sp_ingresarusuario(?,?,?,?,?,?,?)}");
        sp.setString(1,us.getNombre());
        sp.setString(2,us.getTelefono());
        sp.setString(3,us.getDni());
        sp.setString(4, us.getCargo());
        sp.setString(5, us.getUsuario());
        sp.setString (6, us.getContraseña());
        sp.setInt(7, us.getNivel());
        
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
     
           public static boolean modificarusuario(MODEL.Usuario us) throws SQLException
    {
        try
        {
            CallableStatement cs=null;
            Connection con =Conexion.conectar();
            CallableStatement sp=con.prepareCall("{call sp_modificarusuario (?,?,?,?,?,?,?,?)}");
            sp.setString(1, us.getIdusuario());
            sp.setString(2, us.getNombre());
            sp.setString(3,us.getTelefono());
        sp.setString(4,us.getDni());
        sp.setString(5, us.getCargo());
        sp.setString(6, us.getUsuario());
        sp.setString (7, us.getContraseña());
        sp.setInt(8, us.getNivel());
            
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
     
     
         public static ArrayList<MODEL.Usuario> listar() throws SQLException
    {
       String SQL="select * from usuario";
       Connection con=Conexion.conectar();
        PreparedStatement st=con.prepareStatement(SQL);
        ResultSet resultado=st.executeQuery();
        ArrayList<MODEL.Usuario> lista=new ArrayList<>();
        MODEL.Usuario us;
        
        while(resultado.next())
        {
            us=new MODEL.Usuario();
            us.setIdusuario(resultado.getString("idusuario"));
            us.setNombre(resultado.getString("nombre"));
            us.setTelefono(resultado.getString("telefono"));
            us.setDni(resultado.getString("dni"));
            us.setCargo(resultado.getString("cargo"));
            us.setUsuario(resultado.getString("usuario"));
            us.setContraseña(resultado.getString("contraseña"));
            us.setNivel(resultado.getInt("nivel"));
            lista.add(us);
        }
        return lista;
    }  
         
               public static boolean eliminar(Usuario us) throws SQLException
    {
        try{
        CallableStatement cs=null;
        
        Connection con=Conexion.conectar();
        CallableStatement sp=con.prepareCall("{call sp_eliminarusuario(?)}");
        sp.setString(1, us.getIdusuario());
       
        if(sp.executeUpdate()>0)
        { return true;    
        }else{
            return false;
        }
        }catch(SQLException ex)
        { return false;}
     
}  
public static MODEL.Usuario getIdUsuario(String id) throws SQLException
{
MODEL.Usuario us=new MODEL.Usuario();
try{
Connection con=DAO.Conexion.conectar();
PreparedStatement ps=con.prepareStatement("select * from usuario where idusuario=?");
ps.setString(1, id);
ResultSet rs=ps.executeQuery();
if(rs.next())
{
us.setIdusuario(rs.getString(1));
us.setNombre(rs.getString(2));
us.setTelefono(rs.getString(3));
us.setDni(rs.getString(4));
us.setCargo(rs.getString(5));
us.setUsuario(rs.getString(6));
us.setContraseña(rs.getString(7));
us.setNivel(rs.getInt(8));

con.close();

}}
catch(SQLException ex)
{

}
return us;
}     
         
     
     
     
    
}

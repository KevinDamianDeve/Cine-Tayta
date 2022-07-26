/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
import MODEL.Sala;
import java.util.ArrayList;
/**
 *
 * @author Kevin Damian
 */
public class SalaDAO
{
       public static boolean registrar(Sala sa) throws SQLException
    {
        try{
        CallableStatement cs=null;
        
        Connection con=Conexion.conectar();
        CallableStatement sp=con.prepareCall("{call sp_ingresarsala(?)}");
        sp.setString(1,sa.getCapacidad());
        
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
       
                  public static ArrayList<MODEL.Sala> listar() throws SQLException
    {
       String SQL="select * from sala";
       Connection con=Conexion.conectar();
        PreparedStatement st=con.prepareStatement(SQL);
        ResultSet resultado=st.executeQuery();
        ArrayList<MODEL.Sala> lista=new ArrayList<>();
        MODEL.Sala sa;
        
        while(resultado.next())
        {
            sa=new MODEL.Sala();
            sa.setNsala(resultado.getString("nsala"));
            sa.setCapacidad(resultado.getString("capacidad"));
          
       
            lista.add(sa);
        }
        return lista;
    }
     

                  
public static MODEL.Sala getNSala(String id)
{
    Sala ge= new Sala();

try{
Connection con=DAO.Conexion.conectar();
PreparedStatement ps=con.prepareStatement("select * from  sala where nsala=?");
ps.setString(1, id);
ResultSet rs=ps.executeQuery();
if(rs.next())
{
ge.setNsala(rs.getString(1));
ge.setCapacidad(rs.getString(2));

con.close();

}}
catch(SQLException ex)
{
ex.printStackTrace();
}
return ge;
} 
       
       
  public static boolean modificarsala(MODEL.Sala sa) throws SQLException
    {
        try
        {
            CallableStatement cs=null;
            Connection con =Conexion.conectar();
            CallableStatement sp=con.prepareCall("{call sp_modificarsala(?,?)}");
            sp.setString(1,sa.getNsala());
            sp.setString(2, sa.getCapacidad());

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
       
              public static boolean eliminar(Sala sa) throws SQLException
    {
        try{
        CallableStatement cs=null;
        
        Connection con=Conexion.conectar();
        CallableStatement sp=con.prepareCall("{call sp_eliminarsala(?)}");
        sp.setString(1, sa.getNsala());
       
        if(sp.executeUpdate()>0)
        { return true;    
        }else{
            return false;
        }
        }catch(SQLException ex)
        { return false;}
        
    }       
       
    
    
}

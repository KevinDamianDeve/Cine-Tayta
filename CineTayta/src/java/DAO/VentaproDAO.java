/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
import MODEL.Ventapro ;
import java.util.ArrayList;

/**
 *
 * @author Kevin Damian
 */
public class VentaproDAO 
{
      public static boolean registrar(Ventapro dt) throws SQLException
    {
        try{
        CallableStatement cs=null;
        
        Connection con=Conexion.conectar();
        CallableStatement sp=con.prepareCall("{call sp_ventaproducto(?,?,?,?,?,?,?,?)}");
        sp.setString(1,dt.getSerie());
        sp.setString(2,dt.getFecha());
        sp.setString(3,dt.getEstado());
        sp.setFloat(4, dt.getSub_total());
        sp.setFloat(5,dt.getIgv());
        sp.setFloat(6,dt.getTotal());
        sp.setString(7, dt.getIdcliente());
        sp.setString(8, dt.getIdusuario());
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
     public static ArrayList<MODEL.Ventapro> listar() throws SQLException
    {
       String SQL="select * from ventapro";
       Connection con=Conexion.conectar();
        PreparedStatement st=con.prepareStatement(SQL);
        ResultSet resultado=st.executeQuery();
        ArrayList<MODEL.Ventapro> lista=new ArrayList<>();
        MODEL.Ventapro dt;
        
        while(resultado.next())
        {
            dt=new MODEL.Ventapro();
            dt.setIdventapro(resultado.getString("idventapro"));
            dt.setSerie(resultado.getString("serie"));
            dt.setFecha(resultado.getString("fecha"));
            dt.setEstado(resultado.getString("estado"));
            dt.setSub_total(resultado.getFloat("sub_total"));
            dt.setIgv(resultado.getFloat("igv"));
            dt.setTotal(resultado.getFloat("total"));
            dt.setIdcliente(resultado.getString("idcliente"));
            dt.setIdusuario(resultado.getString("idusuario"));
            lista.add(dt);
        }
        return lista;
    }
    
      public static MODEL.Ventapro getIdVentapro(String id)
{
    Ventapro p= new Ventapro();

try{
Connection con=DAO.Conexion.conectar();
PreparedStatement ps=con.prepareStatement("select * from  ventapro where idventapro=?");
ps.setString(1, id);
ResultSet rs=ps.executeQuery();
if(rs.next())
{
p.setIdventapro(rs.getString(1));
p.setSerie(rs.getString(2));
p.setFecha(rs.getString(3));
p.setEstado(rs.getString(4));
p.setSub_total(rs.getFloat(5));
p.setIgv(rs.getFloat(6));
p.setTotal(rs.getFloat(7));
p.setIdcliente(rs.getString(8));
p.setIdusuario(rs.getString(9));


con.close();

}}
catch(SQLException ex)
{
ex.printStackTrace();
}
return p;
}
       public static boolean modificarventaproducto(MODEL.Ventapro ge) throws SQLException
    {
        try
        {
            CallableStatement cs=null;
            Connection con =Conexion.conectar();
            CallableStatement sp=con.prepareCall("{call sp_modificarventaproducto(?,?,?,?,?,?,?,?,?)}");
            sp.setString(1,ge.getIdventapro());
            sp.setString(2, ge.getSerie());
            sp.setString(3,ge.getEstado());
            sp.setString(4,ge.getFecha());
            sp.setFloat(5,ge.getSub_total());
            sp.setFloat(6,ge.getIgv());
            sp.setFloat(7,ge.getTotal() );
            sp.setString(8,ge.getIdcliente() );
            sp.setString(9,ge.getIdusuario());


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
      
      
    
    
}

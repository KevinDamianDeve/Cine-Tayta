/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
import MODEL.VentaPelicula;
import java.util.ArrayList;
/**
 *
 * @author Kevin Damian
 */
public class VentaPeliculaDAO 
{
      public static boolean registrar(VentaPelicula dt) throws SQLException
    {
        try{
        CallableStatement cs=null;
        
        Connection con=Conexion.conectar();
        CallableStatement sp=con.prepareCall("{call sp_ventapelicula(?,?,?,?,?,?,?)}");
        sp.setString(1,dt.getDocumento());
        sp.setString(2,dt.getFecha());
        sp.setFloat(3,dt.getSubtotal());
        sp.setFloat(4,dt.getIgv());
        sp.setFloat(5,dt.getTotal());
        sp.setString(6, dt.getIdcliente());
        sp.setString(7, dt.getIdusuario());
        
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
      
    public static ArrayList<MODEL.VentaPelicula> listar() throws SQLException
    {
       String SQL="select * from ventapeli";
       Connection con=Conexion.conectar();
        PreparedStatement st=con.prepareStatement(SQL);
        ResultSet resultado=st.executeQuery();
        ArrayList<MODEL.VentaPelicula> lista=new ArrayList<>();
        MODEL.VentaPelicula dt;
        
        while(resultado.next())
        {
            dt=new MODEL.VentaPelicula();
            dt.setIdventa(resultado.getString("idventa"));
            dt.setDocumento(resultado.getString("documento"));
            dt.setFecha(resultado.getString("fecha"));
            dt.setSubtotal(resultado.getFloat("subtotal"));
            dt.setIgv(resultado.getFloat("igv"));
            dt.setTotal(resultado.getFloat("total"));
            dt.setIdcliente(resultado.getString("idcliente"));
            dt.setIdusuario(resultado.getString("idusuario"));
            lista.add(dt);
        }
        return lista;
    }
      
          
  public static MODEL.VentaPelicula getIdVentaPelicula(String id)
{
    VentaPelicula p= new VentaPelicula();

try{
Connection con=DAO.Conexion.conectar();
PreparedStatement ps=con.prepareStatement("select * from  ventapeli where idventa=?");
ps.setString(1, id);
ResultSet rs=ps.executeQuery();
if(rs.next())
{
p.setIdventa(rs.getString(1));
p.setDocumento(rs.getString(2));
p.setFecha(rs.getString(3));
p.setSubtotal(rs.getFloat(4));
p.setIgv(rs.getFloat(5));
p.setTotal(rs.getFloat(6));
p.setIdcliente(rs.getString(7));
p.setIdusuario(rs.getString(8));


con.close();

}}
catch(SQLException ex)
{
ex.printStackTrace();
}
return p;
}
  
   public static boolean modificarventapelicula(MODEL.VentaPelicula ge) throws SQLException
    {
        try
        {
            CallableStatement cs=null;
            Connection con =Conexion.conectar();
            CallableStatement sp=con.prepareCall("{call sp_modificarventapelicula(?,?,?,?,?,?,?,?)}");
            sp.setString(1,ge.getIdventa());
            sp.setString(2, ge.getDocumento());
            sp.setString(3,ge.getFecha());
            sp.setFloat(4,ge.getSubtotal());
            sp.setFloat(5,ge.getIgv());
            sp.setFloat(6,ge.getTotal() );
            sp.setString(7,ge.getIdcliente() );
            sp.setString(8,ge.getIdusuario());


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

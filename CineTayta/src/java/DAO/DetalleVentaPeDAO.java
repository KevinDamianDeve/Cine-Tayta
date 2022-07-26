/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
import MODEL.DetalleVentaPe;
import java.util.ArrayList;
/**
 *
 * @author Kevin Damian
 */
public class DetalleVentaPeDAO 
{
        public static boolean registrar(DetalleVentaPe dt) throws SQLException
     {
         try{
         CallableStatement cs=null;

         Connection con=Conexion.conectar();
         CallableStatement sp=con.prepareCall("{call sp_detallepeli(?,?,?,?)}");
         sp.setFloat(1,dt.getCantidad());
         sp.setString(2,dt.getIdventa());
         sp.setString(3,dt.getIdpelicula());
         sp.setString(4,dt.getNbutaca());

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
       
                public static ArrayList<MODEL.DetalleVentaPe> listar() throws SQLException
    {
       String SQL="select * from detalle_ventape";
       Connection con=Conexion.conectar();
        PreparedStatement st=con.prepareStatement(SQL);
        ResultSet resultado=st.executeQuery();
        ArrayList<MODEL.DetalleVentaPe> lista=new ArrayList<>();
        MODEL.DetalleVentaPe dt;
        
        while(resultado.next())
        {
            dt=new MODEL.DetalleVentaPe();
            dt.setIddetalle_ventape(resultado.getString("iddetalle_ventape"));
            dt.setPrecio(resultado.getFloat("precio"));
            dt.setCantidad(resultado.getFloat("cantidad"));
            dt.setValor_venta(resultado.getFloat("valor_venta"));
            dt.setIdventa(resultado.getString("idventa"));
            dt.setIdpelicula(resultado.getString("idpelicula"));
            dt.setNbutaca(resultado.getString("nbutaca"));
            lista.add(dt);
        }
        return lista;
    }
                
                
                
                
  public static MODEL.DetalleVentaPe getIdDetalleVentaPe(String id)
{
    DetalleVentaPe p= new DetalleVentaPe();

try{
Connection con=DAO.Conexion.conectar();
PreparedStatement ps=con.prepareStatement("select * from  detalle_ventape where iddetalle_ventape=?");
ps.setString(1, id);
ResultSet rs=ps.executeQuery();
if(rs.next())
{
p.setIddetalle_ventape(rs.getString(1));
p.setPrecio(rs.getFloat(2));
p.setCantidad(rs.getFloat(3));
p.setValor_venta(rs.getFloat(4));
p.setIdventa(rs.getString(5));
p.setIdpelicula(rs.getString(6));
p.setNbutaca(rs.getString(7));


con.close();

}}
catch(SQLException ex)
{
ex.printStackTrace();
}
return p;
}
       
       
       
    
}

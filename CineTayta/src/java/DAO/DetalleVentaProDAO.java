/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
import MODEL.Detalle_ventapro;
import java.util.ArrayList;
/**
 *
 * @author Kevin Damian
 */
public class DetalleVentaProDAO 
{
        public static boolean registrar(Detalle_ventapro dt) throws SQLException
    {
        try{
        CallableStatement cs=null;
        
        Connection con=Conexion.conectar();
        CallableStatement sp=con.prepareCall("{call sp_detallepro(?,?,?)}");
        sp.setFloat(1,dt.getCantidad());
        sp.setString(2,dt.getIdproducto());
        sp.setString(3,dt.getIdventapro());

        
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
             
                public static ArrayList<MODEL.Detalle_ventapro> listar() throws SQLException
    {
       String SQL="select * from detalle_ventapro";
       Connection con=Conexion.conectar();
        PreparedStatement st=con.prepareStatement(SQL);
        ResultSet resultado=st.executeQuery();
        ArrayList<MODEL.Detalle_ventapro> lista=new ArrayList<>();
        MODEL.Detalle_ventapro dt;
        
        while(resultado.next())
        {
            dt=new MODEL.Detalle_ventapro();
            dt.setIddetalle_ventapro(resultado.getString("iddetalle_ventapro"));
            dt.setPrecio(resultado.getFloat("precio"));
            dt.setCantidad(resultado.getInt("cantidad"));
            dt.setValor_venta(resultado.getFloat("valor_venta"));
            dt.setIdproducto(resultado.getString("idproducto"));
            dt.setIdventapro(resultado.getString("idventapro"));
            lista.add(dt);
        }
        return lista;
    }
        
                
                  public static MODEL.Detalle_ventapro getIdDetalle_ventapro(String id)
{
    Detalle_ventapro  p= new Detalle_ventapro();

try{
Connection con=DAO.Conexion.conectar();
PreparedStatement ps=con.prepareStatement("select * from  detalle_ventapro where iddetalle_ventapro=?");
ps.setString(1, id);
ResultSet rs=ps.executeQuery();
if(rs.next())
{
p.setIddetalle_ventapro(rs.getString(1));
p.setPrecio(rs.getFloat(2));
p.setCantidad(rs.getInt(3));
p.setValor_venta(rs.getFloat(4));
p.setIdproducto(rs.getString(5));
p.setIdventapro(rs.getString(6));


con.close();

}}
catch(SQLException ex)
{
ex.printStackTrace();
}
return p;
}
        
        
        
    
    
    
}

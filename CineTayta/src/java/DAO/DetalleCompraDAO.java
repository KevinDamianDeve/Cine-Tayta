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
import MODEL.DetalleCompra;
/**
 *
 * @author Kevin Damian
 */
public class DetalleCompraDAO
{
      public static boolean registrar(DetalleCompra dt) throws SQLException
    {
        try{
        CallableStatement cs=null;
        
        Connection con=Conexion.conectar();
        CallableStatement sp=con.prepareCall("{call sp_compra(?,?,?,?)}");
        sp.setFloat(1,dt.getPrecio());
        sp.setFloat(2,dt.getCantidad());
        sp.setString(3,dt.getIdproducto());
        sp.setString(4,dt.getIdproveedor());
        
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
      
           public static ArrayList<MODEL.DetalleCompra> listar() throws SQLException
    {
       String SQL="select * from detallecompra";
       Connection con=Conexion.conectar();
        PreparedStatement st=con.prepareStatement(SQL);
        ResultSet resultado=st.executeQuery();
        ArrayList<MODEL.DetalleCompra> lista=new ArrayList<>();
        MODEL.DetalleCompra dt;
        
        while(resultado.next())
        {
            dt=new MODEL.DetalleCompra();
            dt.setIddetallecompra(resultado.getString("iddetallecompra"));
            dt.setPrecio(resultado.getFloat("precio"));
            dt.setCantidad(resultado.getFloat("cantidad"));
            dt.setTotal(resultado.getFloat("total"));
            dt.setIdproducto(resultado.getString("idproducto"));
            dt.setIdproveedor(resultado.getString("idproveedor"));
            lista.add(dt);
        }
        return lista;
    }
      
                public static MODEL.DetalleCompra getIdDetalleCompra(String id)
{
    DetalleCompra p= new DetalleCompra();

try{
Connection con=DAO.Conexion.conectar();
PreparedStatement ps=con.prepareStatement("select * from  detallecompra where iddetallecompra=?");
ps.setString(1, id);
ResultSet rs=ps.executeQuery();
if(rs.next())
{
p.setIddetallecompra(rs.getString(1));
p.setPrecio(rs.getFloat(2));
p.setCantidad(rs.getFloat(3));
p.setTotal(rs.getFloat(4));
p.setIdproducto(rs.getString(5));
p.setIdproveedor(rs.getString(6));


con.close();

}}
catch(SQLException ex)
{
ex.printStackTrace();
}
return p;
} 
           
   
                
                
      
    
}

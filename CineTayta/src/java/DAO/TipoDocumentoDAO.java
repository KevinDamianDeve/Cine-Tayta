/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
import MODEL.TipoDocumento;
import java.util.ArrayList;
/**
 *
 * @author Kevin Damian
 */
public class TipoDocumentoDAO
{
        public static boolean registrar(TipoDocumento sa) throws SQLException
    {
        try{
        CallableStatement cs=null;
        
        Connection con=Conexion.conectar();
        CallableStatement sp=con.prepareCall("{call sp_ingresartipodocumento(?)}");
        sp.setString(1,sa.getTipo());
        
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
                       public static ArrayList<MODEL.TipoDocumento> listar() throws SQLException
    {
       String SQL="select * from tipo_documento";
       Connection con=Conexion.conectar();
        PreparedStatement st=con.prepareStatement(SQL);
        ResultSet resultado=st.executeQuery();
        ArrayList<MODEL.TipoDocumento> lista=new ArrayList<>();
        MODEL.TipoDocumento sa;
        
        while(resultado.next())
        {
            sa=new MODEL.TipoDocumento();
            sa.setIdtipo_documento(resultado.getString("idtipo_documento"));
            sa.setTipo(resultado.getString("tipo"));
          
       
            lista.add(sa);
        }
        return lista;
    }
                       
  public static MODEL.TipoDocumento  getidTipoDocumento(String id)
{
    TipoDocumento ge= new TipoDocumento();

try{
Connection con=DAO.Conexion.conectar();
PreparedStatement ps=con.prepareStatement("select * from  sala tipo_documento idtipo_documento=?");
ps.setString(1, id);
ResultSet rs=ps.executeQuery();
if(rs.next())
{
ge.setIdtipo_documento(rs.getString(1));
ge.setTipo(rs.getString(2));

con.close();

}}
catch(SQLException ex)
{
ex.printStackTrace();
}
return ge;
} 
        
        
    
    
}

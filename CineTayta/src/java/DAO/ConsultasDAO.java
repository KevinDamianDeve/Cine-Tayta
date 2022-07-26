/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Kevin Damian
 */
public class ConsultasDAO 
{
    
     private CallableStatement Cst;
    private ResultSet R;
    
    
    public DefaultTableModel ListaVentasxTipo(String id, Connection Cn)
    {
        try {
            DefaultTableModel c;
            String [] Titulos ={"Pelicula:","Duracion:","Hora_C:","Cantidad: ","Hora_C:" , "Cantidad:" , "Sala:","Butaca:","Precio:" ,"Total:","Cliente:","Usuario:"};
            Cst=Cn.prepareCall("call sp_ticketpelicula(?);");
            Cst.setString(1, id);
            Cn.setAutoCommit(false);
            R=Cst.executeQuery();
            c=new DefaultTableModel(null,Titulos);
            while(R.next()){
                Object dato[]=new Object[11];
                for(int i=0;i<10;i++)
                {
                    dato[i]=R.getString(i+1);
                }
                c.addRow(dato);
            }
            Cn.close();
            return c;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
 
    }
    
    
    
}

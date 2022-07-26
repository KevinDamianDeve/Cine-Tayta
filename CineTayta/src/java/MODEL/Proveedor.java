/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;
import java.io.Serializable;

/**
 *
 * @author Kevin Damian
 */
public class Proveedor implements Serializable
{

    public Proveedor(String idproveedor, String nombre, String direccion, String telefono) {
        this.idproveedor = idproveedor;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(String idproveedor) {
        this.idproveedor = idproveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    private String idproveedor;
    private String nombre;
    private String direccion;
    private String telefono;
    
    
    public Proveedor()
    {
        this.nombre = "";
        this.direccion = "";
        this.telefono = "";
        
    }
}

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
public class Producto implements Serializable
{

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String desripcion) {
        this.descripcion = desripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getStock() {
        return stock;
    }

    public void setStock(float stock) {
        this.stock = stock;
    }

    public String getFechav() {
        return fechav;
    }

    public void setFechav(String fechav) {
        this.fechav = fechav;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Producto(String idproducto, String descripcion, float precio, float stock, String fechav, String presentacion, String estado, String observacion) {
        this.idproducto = idproducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.fechav = fechav;
        this.presentacion = presentacion;
        this.estado = estado;
        this.observacion = observacion;
    }
    private String idproducto;
    private String descripcion;
private float precio;
private float stock;
private String fechav;
private String presentacion;
private String estado;
private String observacion;


public Producto()
{
        this.descripcion = "";
        this.precio = 0;
        this.stock = 0;
        this.fechav = "";
        this.presentacion = "";
        this.estado = " ";
        this.observacion = "";

}

}

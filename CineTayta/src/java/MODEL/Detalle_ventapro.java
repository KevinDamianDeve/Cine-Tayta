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
public class Detalle_ventapro implements Serializable
{
    private String iddetalle_ventapro;
    private float precio;
    private int cantidad;
    private float valor_venta;
    private String idproducto;
    private String idventapro;

    public Detalle_ventapro(String iddetalle_ventapro, float precio, int cantidad, float valor_venta, String idproducto, String idventapro) {
        this.iddetalle_ventapro = iddetalle_ventapro;
        this.precio = precio;
        this.cantidad = cantidad;
        this.valor_venta = valor_venta;
        this.idproducto = idproducto;
        this.idventapro = idventapro;
    }
    
     public Detalle_ventapro() {
        this.iddetalle_ventapro = "";
        this.precio = 0;
        this.cantidad =0;
        this.valor_venta = 0;
        this.idproducto = "";
        this.idventapro = "";
    }

    public String getIddetalle_ventapro() {
        return iddetalle_ventapro;
    }

    public void setIddetalle_ventapro(String iddetalle_ventapro) {
        this.iddetalle_ventapro = iddetalle_ventapro;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getValor_venta() {
        return valor_venta;
    }

    public void setValor_venta(float valor_venta) {
        this.valor_venta = valor_venta;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public String getIdventapro() {
        return idventapro;
    }

    public void setIdventapro(String idventapro) {
        this.idventapro = idventapro;
    }
    
    
}

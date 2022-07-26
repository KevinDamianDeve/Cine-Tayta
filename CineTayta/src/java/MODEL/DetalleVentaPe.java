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
public class DetalleVentaPe implements Serializable
{

    public String getIddetalle_ventape() {
        return iddetalle_ventape;
    }

    public void setIddetalle_ventape(String iddetalle_ventape) {
        this.iddetalle_ventape = iddetalle_ventape;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getValor_venta() {
        return valor_venta;
    }

    public void setValor_venta(float valor_venta) {
        this.valor_venta = valor_venta;
    }

    public String getIdventa() {
        return idventa;
    }

    public void setIdventa(String idventa) {
        this.idventa = idventa;
    }

    public String getIdpelicula() {
        return idpelicula;
    }

    public void setIdpelicula(String idpelicula) {
        this.idpelicula = idpelicula;
    }

    public String getNbutaca() {
        return nbutaca;
    }

    public void setNbutaca(String nbutaca) {
        this.nbutaca = nbutaca;
    }

    public DetalleVentaPe(String iddetalle_ventape, float precio, float cantidad, float valor_venta, String idventa, String idpelicula, String nbutaca) {
        this.iddetalle_ventape = iddetalle_ventape;
        this.precio = precio;
        this.cantidad = cantidad;
        this.valor_venta = valor_venta;
        this.idventa = idventa;
        this.idpelicula = idpelicula;
        this.nbutaca = nbutaca;
    }
    private String iddetalle_ventape;
    private float precio;
    private float cantidad;
    private float valor_venta;
    private String idventa;
    private String idpelicula;
    private String nbutaca;
    
    
      public DetalleVentaPe() {
        this.iddetalle_ventape = "";
        this.precio = 0;
        this.cantidad = 0;
        this.valor_venta = 0;
        this.idventa = "";
        this.idpelicula = "";
        this.nbutaca = "";
    }

}

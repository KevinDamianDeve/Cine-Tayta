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
public class VentaPelicula implements Serializable
{

    public VentaPelicula(String idventa, String documento, String fecha, float subtotal, float igv, float total, String idcliente, String idusuario) {
        this.idventa = idventa;
        this.documento = documento;
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.igv = igv;
        this.total = total;
        this.idcliente = idcliente;
        this.idusuario = idusuario;
    }

    public String getIdventa() {
        return idventa;
    }

    public void setIdventa(String idventa) {
        this.idventa = idventa;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getIgv() {
        return igv;
    }

    public void setIgv(float igv) {
        this.igv = igv;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }
    private String idventa;
    private String documento;
    private String fecha;
    private float subtotal;
    private float igv;
    private float total;
    private String idcliente;
    private String idusuario;

    
      public VentaPelicula() {
        this.idventa = "";
        this.documento ="";
        this.fecha = "";
        this.subtotal = 0;
        this.igv = 0;
        this.total = 0;
        this.idcliente = "";
        this.idusuario = "";
    }
    
}

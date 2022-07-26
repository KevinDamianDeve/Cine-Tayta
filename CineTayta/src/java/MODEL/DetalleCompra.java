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
public class DetalleCompra  implements Serializable
{

    public String getIddetallecompra() {
        return iddetallecompra;
    }

    public void setIddetallecompra(String iddetallecompra) {
        this.iddetallecompra = iddetallecompra;
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

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public String getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(String idproveedor) {
        this.idproveedor = idproveedor;
    }

    public DetalleCompra(String iddetallecompra, float precio, float cantidad, float total, String idproducto, String idproveedor) {
        this.iddetallecompra = iddetallecompra;
        this.precio = precio;
        this.cantidad = cantidad;
        this.total = total;
        this.idproducto = idproducto;
        this.idproveedor = idproveedor;
    }
    private String iddetallecompra;
    private float precio;
    private float cantidad;
    private float total;
    private String idproducto;
    private String idproveedor;
    
    
    public DetalleCompra ()
    {
        this.precio = 0;
        this.cantidad = 0;
        this.total = 0;
        this.idproducto = "";
        this.idproveedor = "";
    }
}

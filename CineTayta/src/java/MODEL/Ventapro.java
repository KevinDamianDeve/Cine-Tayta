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
public class Ventapro implements Serializable
{
   private String idventapro;
   private String serie;
   private String fecha;
   private String estado;
   private float sub_total;
   private float igv;
   private float total;
   private String idcliente;
   private String idusuario;
   private String idtipo_documento;

    public String getIdventapro() {
        return idventapro;
    }

    public void setIdventapro(String idventapro) {
        this.idventapro = idventapro;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getSub_total() {
        return sub_total;
    }

    public void setSub_total(float sub_total) {
        this.sub_total = sub_total;
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

    public String getIdtipo_documento() {
        return idtipo_documento;
    }

    public void setIdtipo_documento(String idtipo_documento) {
        this.idtipo_documento = idtipo_documento;
    }

    public Ventapro(String idventapro, String serie, String fecha, String estado, float sub_total, float igv, float total, String idcliente, String idusuario, String idtipo_documento) {
        this.idventapro = idventapro;
        this.serie = serie;
        this.fecha = fecha;
        this.estado = estado;
        this.sub_total = sub_total;
        this.igv = igv;
        this.total = total;
        this.idcliente = idcliente;
        this.idusuario = idusuario;
        this.idtipo_documento = idtipo_documento;
    }

    public Ventapro() 
    {
        this.idventapro = "";
        this.serie = "";
        this.fecha = "";
        this.estado = "";
        this.sub_total = 0;
        this.igv = 0;
        this.total = 0;
        this.idcliente = "";
        this.idusuario = "";
        this.idtipo_documento = "";
    }
   
    
}

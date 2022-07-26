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
public class Pelicula implements Serializable
{

    public String getIdpelicula() {
        return idpelicula;
    }

    public void setIdpelicula(String idpelicula) {
        this.idpelicula = idpelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProtagonistas() {
        return protagonistas;
    }

    public void setProtagonistas(String protagonistas) {
        this.protagonistas = protagonistas;
    }

    public String getIdgenero() {
        return idgenero;
    }

    public void setIdgenero(String idgenero) {
        this.idgenero = idgenero;
    }

    public String getHora_c() {
        return hora_c;
    }

    public void setHora_c(String hora_c) {
        this.hora_c = hora_c;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNsala() {
        return nsala;
    }

    public void setNsala(String nsala) {
        this.nsala = nsala;
    }

    public Pelicula(String idpelicula, String nombre, String duracion, String pais, String año, String director, String protagonistas, String idgenero, String hora_c, float precio, String nsala) {
        this.idpelicula = idpelicula;
        this.nombre = nombre;
        this.duracion = duracion;
        this.pais = pais;
        this.año = año;
        this.director = director;
        this.protagonistas = protagonistas;
        this.idgenero = idgenero;
        this.hora_c = hora_c;
        this.precio = precio;
        this.nsala = nsala;
    }
    private String idpelicula;
    private String nombre;
    private String duracion;
    private String pais;
    private String año;
    private String director;
    private String protagonistas;
    private String idgenero;
    private String hora_c;
    private float precio;
    private String nsala;
    
    
    
     public Pelicula() {
        this.idpelicula = "";
        this.nombre = "";
        this.duracion = "";
        this.pais = "";
        this.año = "";
        this.director = "";
        this.protagonistas = "";
        this.idgenero = "";
        this.hora_c = "";
        this.precio = 0;
        this.nsala = "";
    }
    
    
}

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
public class Sala implements Serializable
{

    public Sala(String nsala, String capacidad) {
        this.nsala = nsala;
        this.capacidad = capacidad;
    }

    public String getNsala() {
        return nsala;
    }

    public void setNsala(String nsala) {
        this.nsala = nsala;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
    private String nsala;
    private String capacidad;
   
    
    
     public Sala() {
        this.nsala = "";
        this.capacidad = "";
    }
}

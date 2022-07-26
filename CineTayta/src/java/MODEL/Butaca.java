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
public class Butaca implements Serializable
{

    public Butaca(String nbutaca, String estado) {
        this.nbutaca = nbutaca;
        this.estado = estado;
    }

    public String getNbutaca() {
        return nbutaca;
    }

    public void setNbutaca(String nbutaca) {
        this.nbutaca = nbutaca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    private String nbutaca;
    private String estado;
    
    
      public Butaca() {
        this.nbutaca = "";
        this.estado = "";
    }
}

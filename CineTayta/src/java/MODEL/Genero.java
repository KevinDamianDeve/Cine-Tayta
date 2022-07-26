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
public class Genero implements Serializable
{

    public String getIdgenero() {
        return idgenero;
    }

    public void setIdgenero(String idgenero) {
        this.idgenero = idgenero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Genero(String idgenero, String genero) {
        this.idgenero = idgenero;
        this.genero = genero;
    }
    private String idgenero;
    private String genero;
 
    
    
     public Genero() {
        this.idgenero = "";
        this.genero = "";
    }
}

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
public class TipoDocumento implements Serializable
{
    private String idtipo_documento;
    private String tipo;

    public String getIdtipo_documento() {
        return idtipo_documento;
    }

    public void setIdtipo_documento(String idtipo_documento) {
        this.idtipo_documento = idtipo_documento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public TipoDocumento(String idtipo_documento, String tipo) {
        this.idtipo_documento = idtipo_documento;
        this.tipo = tipo;
    }
    
    public TipoDocumento() {
        this.idtipo_documento = "";
        this.tipo = "";
    }
}

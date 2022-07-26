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
public class Usuario implements Serializable
{

    public Usuario(String idusuario, String nombre, String telefono, String dni, String cargo, String usuario, String contraseña, int nivel) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.telefono = telefono;
        this.dni = dni;
        this.cargo = cargo;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nivel = nivel;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    private String idusuario;
    private String nombre;
    private String telefono;
    private String dni;
    private String cargo;
    private String usuario;
    private String contraseña;
    private int nivel;
    
    
    
    
        public Usuario() {
        this.idusuario = "";
        this.nombre = "";
        this.telefono = "";
        this.dni = "";
        this.cargo = "";
        this.usuario = "";
        this.contraseña = "";
        this.nivel = 0;
    }
}

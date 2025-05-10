/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkup.objetosNegocio.admGrupo;

import java.time.LocalDateTime;

/**
 *
 * @author gael_
 */
public class Mensaje {
    private Usuario usuario;
    private Grupo grupo;
    private String contenido;
    private LocalDateTime fechaEnvio;

    public Mensaje(Usuario usuario, Grupo grupo, String contenido, LocalDateTime fechaEnvio) {
        this.usuario = usuario;
        this.grupo = grupo;
        this.contenido = contenido;
        this.fechaEnvio = fechaEnvio;
    }

    public Mensaje(String contenido, LocalDateTime fechaEnvio) {
        this.contenido = contenido;
        this.fechaEnvio = fechaEnvio;
    }
    
    

    public Usuario getUsuario() {
        return usuario;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public String getContenido() {
        return contenido;
    }

    public LocalDateTime getFechaEnvio() {
        return fechaEnvio;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "usuario=" + usuario + ", grupo=" + grupo + ", contenido=" + contenido + ", fechaEnvio=" + fechaEnvio + '}';
    }
    
    public String getMensaje(){
        return contenido + "  -  " +fechaEnvio;
    }
    
    
    
    
}

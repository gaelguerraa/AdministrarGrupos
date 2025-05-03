/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkup.dtosnegocio.admGrupo;

/**
 *
 * @author gael_
 */
public class MensajeDTO {
    private String emailUsuario;
    private String nombreGrupo; 
    private String contenido;

    public MensajeDTO(String emailUsuario, String nombreGrupo, String contenido) {
        this.emailUsuario = emailUsuario;
        this.nombreGrupo = nombreGrupo;
        this.contenido = contenido;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    
}

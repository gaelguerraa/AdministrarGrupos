/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkup.objetosNegocio.admGrupo;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author gael_
 */
public class Grupo {
    private String nombre;
    private LocalDateTime fechaCreaciom;
    private List<Usuario> miembros;
    private List<Mensaje> mensajes;

    public Grupo(String nombre, LocalDateTime fechaCreaciom, List<Usuario> miembros, List<Mensaje> mensajes) {
        this.nombre = nombre;
        this.fechaCreaciom = fechaCreaciom;
        this.miembros = miembros;
        this.mensajes = mensajes;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDateTime getFechaCreaciom() {
        return fechaCreaciom;
    }

    public List<Usuario> getMiembros() {
        return miembros;
    }

    public List<Mensaje> getMensajes() {
        return mensajes;
    }
    
    
}

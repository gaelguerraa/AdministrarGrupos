/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkup.dtosnegocio.admGrupo;

import java.util.ArrayList;
import java.util.List;
import linkup.objetosNegocio.admGrupo.Mensaje;

/**
 *
 * @author gael_
 */
public class GrupoDTO {
    private String nombre;
    private List<String> nombreMiembros; 
    private List<Mensaje> mensajes;

    public GrupoDTO(String nombre,  List<String> nombreMiembros) {
        this.nombre = nombre;
        this.nombreMiembros = nombreMiembros;
        this.mensajes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getNombreMiembros() {
        return nombreMiembros;
    }

    public void setNombreMiembros(List<String> nombreMiembros) {
        this.nombreMiembros = nombreMiembros;
    }

    public List<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(List<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }
    
    
    
    
}

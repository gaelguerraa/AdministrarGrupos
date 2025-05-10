/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkup.dtosnegocio.mapper.admGrupo;

import linkup.dtosnegocio.admGrupo.NuevoMensajeDTO;
import linkup.objetosNegocio.admGrupo.Mensaje;

/**
 *
 * @author gael_
 */
public class MensajeMapper {

    public MensajeMapper() {
    }
    
    public static Mensaje toEntidad(NuevoMensajeDTO nuevoMensaje){
        if (nuevoMensaje == null){
            return null;
        }
        
        return new Mensaje(
            nuevoMensaje.getContenido(),
            nuevoMensaje.getFechaHora()
        );
    }
}

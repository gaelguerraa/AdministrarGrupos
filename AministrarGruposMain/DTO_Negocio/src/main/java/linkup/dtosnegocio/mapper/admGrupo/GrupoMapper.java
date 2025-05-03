/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkup.dtosnegocio.mapper.admGrupo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import linkup.dtosnegocio.admGrupo.GrupoDTO;
import linkup.objetosNegocio.admGrupo.Grupo;
import linkup.objetosNegocio.admGrupo.Usuario;

/**
 *
 * @author gael_
 */
public class GrupoMapper {

    public GrupoMapper() {
    }
    
      public static Grupo toEntidad(GrupoDTO dto, List<Usuario> usuariosDisponibles) {
        if (dto == null) return null;

        // Mapeo de nombres a objetos Usuario
        List<Usuario> miembros = new ArrayList<>();
        for (String nombre : dto.getNombreMiembros()) {
            for (Usuario u : usuariosDisponibles) {
                if (u.getNombre().equalsIgnoreCase(nombre)) {
                    miembros.add(u);
                    break;
                }
            }
        }

        // Creamos el Grupo
        return new Grupo(
            dto.getNombre(),
            LocalDateTime.now(),
            miembros,
            dto.getMensajes() != null ? dto.getMensajes() : new ArrayList<>()
        );
    }

}

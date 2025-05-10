/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ISubsistema;

import java.util.List;
import linkup.exception.NegocioException;
import linkup.objetosNegocio.admGrupo.Grupo;
import linkup.objetosNegocio.admGrupo.Usuario;

/**
 *
 * @author gael_
 */
public interface IAdministrarGrupo {
    public abstract void eliminarUsuarioDeGrupo(Grupo grupo, Usuario usuario );
    public abstract void eliminarGrupo(Grupo grupo, List<Grupo> grupos);
    public abstract void cambiarNombreGrupo(Grupo grupo, String nuevoNombre) throws NegocioException;
}

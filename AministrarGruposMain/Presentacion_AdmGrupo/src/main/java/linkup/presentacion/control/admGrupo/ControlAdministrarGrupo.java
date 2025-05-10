/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkup.presentacion.control.admGrupo;

import ISubsistema.IAdministrarGrupo;
import Subsistema.AdministrarGrupo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import linkup.dtosnegocio.admGrupo.GrupoDTO;
import linkup.dtosnegocio.admGrupo.NuevoMensajeDTO;
import linkup.dtosnegocio.admGrupo.UsuariosMock;
import linkup.dtosnegocio.mapper.admGrupo.GrupoMapper;
import linkup.dtosnegocio.mapper.admGrupo.MensajeMapper;
import linkup.objetosNegocio.admGrupo.Grupo;
import linkup.objetosNegocio.admGrupo.Mensaje;
import linkup.objetosNegocio.admGrupo.Usuario;
import linkup.presentacion.admGrupo.frmCrearGrupo;
import linkup.presentacion.admGrupo.frmGruposPrincipal;
import linkup.presentacion.admGrupo.frmOpcionesGrupo;
import linkup.presentacion.admGrupo.frmVerGrupo;

/**
 *
 * @author gael_
 */
public class ControlAdministrarGrupo {
    private static ControlAdministrarGrupo instancia;
    private static IAdministrarGrupo administradorGrupos = new AdministrarGrupo(); 
    
    private frmGruposPrincipal gruposPrincipal;
    private frmVerGrupo verGrupo;
    private frmOpcionesGrupo opcionesGrupo;
    private frmCrearGrupo crearGrupo;
     
    private List<Grupo> grupos;
    private List<Usuario> usuariosDisponibles;
    
    public ControlAdministrarGrupo() {
        this.grupos = new ArrayList<>();
        this.usuariosDisponibles = new UsuariosMock().obtenerTodosLosUsuarios();
    }
    
    public void registrarGrupo(GrupoDTO grupoDTO) {
        Grupo grupo = GrupoMapper.toEntidad(grupoDTO, usuariosDisponibles);
        grupos.add(grupo);
        System.out.println("Grupo creado: " + grupo.getNombre());
    }
    
    public void registrarMensaje(Grupo grupo, NuevoMensajeDTO nuevoMensaje){
        Mensaje mensaje = MensajeMapper.toEntidad(nuevoMensaje);
        grupo.getMensajes().add(mensaje);
    }

    public List<Grupo> obtenerGrupos() {
        return grupos;
    }

    public List<Usuario> getUsuariosDisponibles() {
        return usuariosDisponibles;
    }
    
    public Grupo obtenerGrupoPorNombre(String nombre) {
        for (Grupo grupo : grupos) {
            if (grupo.getNombre().equals(nombre)) {
                return grupo;
            }
        }
        return null;
    }
     
    public void eliminarUsuario(Grupo grupo, Usuario usuario){
        administradorGrupos.eliminarUsuarioDeGrupo(grupo, usuario);
    } 
    
    public void eliminarGrupo(Grupo grupo) {
        administradorGrupos.eliminarGrupo(grupo, this.grupos);
    }

    public void cambiarNombreGrupo(Grupo grupo, String nuevoNombre){
         for (Grupo g : obtenerGrupos()) {
            if (!g.equals(grupo) && g.getNombre().equalsIgnoreCase(nuevoNombre)) {
                JOptionPane.showMessageDialog(null, "Ya existe un grupo con ese nombre.");
            return;
            }
        }
        administradorGrupos.cambiarNombreGrupo(grupo, nuevoNombre);
    }
    
    
    public static ControlAdministrarGrupo getInstancia(){
        if(instancia == null){
            instancia = new ControlAdministrarGrupo();
        }
        return instancia;
    }
    
    public void iniciarFlujoGrupos(){
        mostrarVentanaPrincipalGrupos();
    }
    
    public void mostrarVentanaPrincipalGrupos(){
        gruposPrincipal = new frmGruposPrincipal(this);
        gruposPrincipal.setVisible(true);
    }
    
    public void crearGrupo(){
        crearGrupo = new frmCrearGrupo(this);
        crearGrupo.setVisible(true);
    }
    
    public void accederGrupo(Grupo grupo) {
        frmVerGrupo verGrupo = new frmVerGrupo(this, grupo);
        verGrupo.setVisible(true);
    }

    
    public void verOpcionesGrupo(Grupo grupo){
        opcionesGrupo = new frmOpcionesGrupo(this, grupo);
        opcionesGrupo.setVisible(true); 
    }
    
    
}

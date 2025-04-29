/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkup.presentacion.control.admGrupo;

import linkup.presentacion.admGrupo.frmCrearGrupo;
import linkup.presentacion.admGrupo.frmGruposPrincipal;
import linkup.presentacion.admGrupo.frmNuevoNombreGrupo;
import linkup.presentacion.admGrupo.frmOpcionesGrupo;
import linkup.presentacion.admGrupo.frmUsuariosEliminar;
import linkup.presentacion.admGrupo.frmVerGrupo;

/**
 *
 * @author gael_
 */
public class ControlAdministrarGrupo {
    private static ControlAdministrarGrupo instancia;
    
    private frmGruposPrincipal gruposPrincipal;
    private frmVerGrupo verGrupo;
    private frmOpcionesGrupo opcionesGrupo;
    private frmCrearGrupo crearGrupo;
    private frmUsuariosEliminar usuariosAEliminar;
    private frmNuevoNombreGrupo nuevoNombreGrupo;
    
    public ControlAdministrarGrupo(){
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
    
    public void accederGrupo(){
        verGrupo = new frmVerGrupo(this);
        verGrupo.setVisible(true);
    }
    
    public void verOpcionesGrupo(){
        opcionesGrupo = new frmOpcionesGrupo(this);
        opcionesGrupo.setVisible(true); 
    }
    
    public void ventanaEliminarUsuario(){
        usuariosAEliminar = new frmUsuariosEliminar(this);
        usuariosAEliminar.setVisible(true);
    }
    
    public void ventanaNuevoNombreGrupo(){
        nuevoNombreGrupo = new frmNuevoNombreGrupo(this);
        nuevoNombreGrupo.setVisible(true);
    }
    
}

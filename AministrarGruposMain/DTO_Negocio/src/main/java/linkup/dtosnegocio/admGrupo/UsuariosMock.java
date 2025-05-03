/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkup.dtosnegocio.admGrupo;

import java.util.List;
import linkup.objetosNegocio.admGrupo.Usuario;

/**
 *
 * @author gael_
 */
public class UsuariosMock {
    private List<Usuario> usuariosMock;

    public UsuariosMock() {
        // Simulación de usuarios hardcodeados
        usuariosMock = List.of(
            new Usuario("Ana", "ana@email.com", "123"),
            new Usuario("Luis", "luis@email.com", "abc"),
            new Usuario("Karla", "karla@email.com", "pass"),
            new Usuario("Pablo", "pablo@email.com", "clave")
        );
    }
        
    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuariosMock;
    }

    public void mostrarUsuarios() {
        System.out.println("Usuarios registrados:");
        for (Usuario u : usuariosMock) {
            System.out.println("- " + u.getNombre() + " (" + u.getEmail() + ")");
        }
    }

    public Usuario buscarPorEmail(String email) {
        for (Usuario u : usuariosMock) {
            if (u.getEmail().equalsIgnoreCase(email)) {
                return u;
            }
        }
        return null;
    }    
}

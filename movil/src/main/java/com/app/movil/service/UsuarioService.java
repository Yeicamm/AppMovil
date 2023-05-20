package com.app.movil.service;

import com.app.movil.entity.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario crearUsuario(Usuario usuario);
    Usuario obtenerUsuario(Long usuarioId);
    void eliminarUsuario(Long usuarioId);
    List<Usuario> obtenerTodosLosUsuarios();
}

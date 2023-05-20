package com.app.movil.service;

import com.app.movil.entity.Rol;

import java.util.List;

public interface RolService {
    Rol crearRol(Rol rol);
    Rol obtenerRol(Long rolId);
    void eliminarRol(Long rolId);
    List<Rol> obtenerTodosLosRoles();
}

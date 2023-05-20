package com.app.movil.service.impl;

import com.app.movil.entity.Rol;
import com.app.movil.repository.RolRepository;
import com.app.movil.service.RolService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServiceImpl implements RolService {
    private final RolRepository rolRepository;

    public RolServiceImpl(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    @Override
    public Rol crearRol(Rol rol) {
        return rolRepository.save(rol);
    }

    @Override
    public Rol obtenerRol(Long rolId) {
        return rolRepository.findById(rolId).orElse(null);
    }

    @Override
    public void eliminarRol(Long rolId) {
        rolRepository.deleteById(rolId);
    }

    @Override
    public List<Rol> obtenerTodosLosRoles() {
        return rolRepository.findAll();
    }
}

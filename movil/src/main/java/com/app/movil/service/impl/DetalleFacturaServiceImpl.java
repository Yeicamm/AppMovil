package com.app.movil.service.impl;

import com.app.movil.entity.DetalleFactura;
import com.app.movil.repository.DetalleFacturaRepository;
import com.app.movil.service.DetalleFacturaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleFacturaServiceImpl implements DetalleFacturaService {
    private final DetalleFacturaRepository detalleFacturaRepository;

    public DetalleFacturaServiceImpl(DetalleFacturaRepository detalleFacturaRepository) {
        this.detalleFacturaRepository = detalleFacturaRepository;
    }

    @Override
    public DetalleFactura crearDetalleFactura(DetalleFactura detalleFactura) {
        return detalleFacturaRepository.save(detalleFactura);
    }

    @Override
    public DetalleFactura obtenerDetalleFactura(Long detalleFacturaId) {
        return detalleFacturaRepository.findById(detalleFacturaId).orElse(null);
    }

    @Override
    public void eliminarDetalleFactura(Long detalleFacturaId) {
        detalleFacturaRepository.deleteById(detalleFacturaId);
    }

    @Override
    public List<DetalleFactura> obtenerTodosLosDetallesFactura() {
        return detalleFacturaRepository.findAll();
    }
}

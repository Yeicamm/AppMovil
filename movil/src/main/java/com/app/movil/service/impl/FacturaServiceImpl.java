package com.app.movil.service.impl;

import com.app.movil.entity.Factura;
import com.app.movil.repository.FacturaRepository;
import com.app.movil.service.FacturaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaServiceImpl implements FacturaService {
    private final FacturaRepository facturaRepository;

    public FacturaServiceImpl(FacturaRepository facturaRepository) {
        this.facturaRepository = facturaRepository;
    }

    @Override
    public Factura crearFactura(Factura factura) {
        return facturaRepository.save(factura);
    }

    @Override
    public Factura obtenerFactura(Long facturaId) {
        return facturaRepository.findById(facturaId).orElse(null);
    }

    @Override
    public void eliminarFactura(Long facturaId) {
        facturaRepository.deleteById(facturaId);
    }

    @Override
    public List<Factura> obtenerTodasLasFacturas() {
        return facturaRepository.findAll();
    }
}

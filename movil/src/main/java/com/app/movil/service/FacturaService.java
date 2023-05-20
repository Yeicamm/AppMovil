package com.app.movil.service;

import com.app.movil.entity.Factura;

import java.util.List;

public interface FacturaService {
    Factura crearFactura(Factura factura);
    Factura obtenerFactura(Long facturaId);
    void eliminarFactura(Long facturaId);
    List<Factura> obtenerTodasLasFacturas();
}

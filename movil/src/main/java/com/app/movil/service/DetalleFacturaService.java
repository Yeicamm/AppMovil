package com.app.movil.service;

import com.app.movil.entity.DetalleFactura;

import java.util.List;

public interface DetalleFacturaService {
    DetalleFactura crearDetalleFactura(DetalleFactura detalleFactura);
    DetalleFactura obtenerDetalleFactura(Long detalleFacturaId);
    void eliminarDetalleFactura(Long detalleFacturaId);
    List<DetalleFactura> obtenerTodosLosDetallesFactura();
}

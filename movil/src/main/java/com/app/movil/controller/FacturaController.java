package com.app.movil.controller;

import com.app.movil.entity.Factura;
import com.app.movil.service.FacturaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facturas")
public class FacturaController {
    private final FacturaService facturaService;

    public FacturaController(FacturaService facturaService) {
        this.facturaService = facturaService;
    }

    @PostMapping
    public ResponseEntity<Factura> crearFactura(@RequestBody Factura factura) {
        Factura nuevaFactura = facturaService.crearFactura(factura);
        return ResponseEntity.ok(nuevaFactura);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Factura> obtenerFactura(@PathVariable Long id) {
        Factura factura = facturaService.obtenerFactura(id);
        if (factura != null) {
            return ResponseEntity.ok(factura);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Factura>> obtenerTodasLasFacturas() {
        List<Factura> facturas = facturaService.obtenerTodasLasFacturas();
        return ResponseEntity.ok(facturas);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarFactura(@PathVariable Long id) {
        facturaService.eliminarFactura(id);
        return ResponseEntity.noContent().build();
    }
}
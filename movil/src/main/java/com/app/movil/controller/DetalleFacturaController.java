package com.app.movil.controller;

import com.app.movil.entity.DetalleFactura;
import com.app.movil.service.DetalleFacturaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detallesFactura")
public class DetalleFacturaController {
    private final DetalleFacturaService detalleFacturaService;

    public DetalleFacturaController(DetalleFacturaService detalleFacturaService) {
        this.detalleFacturaService = detalleFacturaService;
    }

    @PostMapping
    public ResponseEntity<DetalleFactura> crearDetalleFactura(@RequestBody DetalleFactura detalleFactura) {
        DetalleFactura nuevoDetalleFactura = detalleFacturaService.crearDetalleFactura(detalleFactura);
        return ResponseEntity.ok(nuevoDetalleFactura);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetalleFactura> obtenerDetalleFactura(@PathVariable Long id) {
        DetalleFactura detalleFactura = detalleFacturaService.obtenerDetalleFactura(id);
        if (detalleFactura != null) {
            return ResponseEntity.ok(detalleFactura);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<DetalleFactura>> obtenerTodosLosDetallesFactura() {
        List<DetalleFactura> detallesFactura = detalleFacturaService.obtenerTodosLosDetallesFactura();
        return ResponseEntity.ok(detallesFactura);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarDetalleFactura(@PathVariable Long id) {
        detalleFacturaService.eliminarDetalleFactura(id);
        return ResponseEntity.noContent().build();
    }
}

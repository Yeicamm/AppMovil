package com.app.movil.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;
    private BigDecimal precioUnidad;
    private int cantidad;

    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<DetalleFactura> detallesFactura;
}

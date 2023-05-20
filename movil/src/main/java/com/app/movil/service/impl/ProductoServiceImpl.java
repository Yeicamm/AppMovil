package com.app.movil.service.impl;

import com.app.movil.entity.Producto;
import com.app.movil.repository.ProductoRepository;
import com.app.movil.service.ProductoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {
    private final ProductoRepository productoRepository;

    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public Producto crearProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto obtenerProducto(Long productoId) {
        return productoRepository.findById(productoId).orElse(null);
    }

    @Override
    public void eliminarProducto(Long productoId) {
        productoRepository.deleteById(productoId);
    }

    @Override
    public List<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }
}
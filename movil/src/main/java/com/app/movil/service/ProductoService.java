package com.app.movil.service;

import com.app.movil.entity.Producto;

import java.util.List;

public interface ProductoService {
    Producto crearProducto(Producto producto);
    Producto obtenerProducto(Long productoId);
    void eliminarProducto(Long productoId);
    List<Producto> obtenerTodosLosProductos();
}

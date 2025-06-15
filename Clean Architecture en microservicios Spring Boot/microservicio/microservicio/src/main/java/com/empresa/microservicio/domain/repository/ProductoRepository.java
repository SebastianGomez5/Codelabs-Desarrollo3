package com.empresa.microservicio.domain.repository;

import com.empresa.microservicio.domain.model.Producto;
import java.util.List;
import java.util.Optional;

public interface ProductoRepository {
    List<Producto> listarProductos();
    Optional<Producto> findById(Long id);
}
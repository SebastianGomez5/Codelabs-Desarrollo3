package com.example.pedido_service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "product-service")
public interface ProductoClient {

    @GetMapping("/productos")
    List<ProductoDTO> obtenerProductos();
}

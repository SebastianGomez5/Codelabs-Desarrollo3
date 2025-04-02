package com.example.pedido_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    @Autowired
    private final ProductoClient productoClient;
	
    public PedidoController(ProductoClient productoClient) {
        this.productoClient = productoClient;
    }

    @GetMapping("/crear")
    public ResponseEntity<?> crearPedido() {
        List<ProductoDTO> productos = productoClient.obtenerProductos();
        return ResponseEntity.ok("Pedido creado con productos: " + productos);
    }
}

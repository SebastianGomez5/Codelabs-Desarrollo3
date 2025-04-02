package com.example.pedido_service;

public record Pedido(String id, ProductoDTO producto, int cantidad) {}

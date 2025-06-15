package com.empresa.microservicio.domain.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private BigDecimal precio;

    public Producto() {} // Constructor vacío requerido por JPA

    public Producto(String nombre, BigDecimal precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public BigDecimal getPrecio() { return precio; }
}
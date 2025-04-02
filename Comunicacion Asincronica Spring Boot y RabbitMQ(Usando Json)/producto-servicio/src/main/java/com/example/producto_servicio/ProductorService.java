package com.example.producto_servicio;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductorService {

    private final AmqpTemplate customRabbitTemplate;

    public ProductorService(AmqpTemplate customRabbitTemplate) {
        this.customRabbitTemplate = customRabbitTemplate;
    }

    public void enviarListaProductos(List<ProductoDTO> productos) {
        // Enviamos la lista de productos en formato JSON
        customRabbitTemplate.convertAndSend(
            RabbitMQConfig.EXCHANGE_NAME,
            RabbitMQConfig.ROUTING_KEY,
            productos
        );
        System.out.println("Lista de productos enviada con éxito en formato JSON.");
    }
}

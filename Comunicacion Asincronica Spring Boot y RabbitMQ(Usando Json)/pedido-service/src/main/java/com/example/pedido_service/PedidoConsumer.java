package com.example.pedido_service;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PedidoConsumer {

    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
    public void recibirListaProductos(List<ProductoDTO> productos) {
        System.out.println("Pedido recibido con los siguientes productos: " + productos);
        // Aquí podrías guardar en DB, calcular totales, etc.
    }
}

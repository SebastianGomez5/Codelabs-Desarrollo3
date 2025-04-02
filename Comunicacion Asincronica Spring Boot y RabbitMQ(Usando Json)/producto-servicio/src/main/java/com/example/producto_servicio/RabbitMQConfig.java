package com.example.producto_servicio;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter; // JSON Converter
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    public static final String EXCHANGE_NAME = "productoExchange";
    public static final String QUEUE_NAME = "pedidoQueue";
    public static final String ROUTING_KEY = "pedido.key";

    // 1) Declarar Exchange
    @Bean
    public DirectExchange exchange() {
        return new DirectExchange(EXCHANGE_NAME);
    }

    // 2) Declarar Queue
    @Bean
    public Queue queue() {
        return new Queue(QUEUE_NAME);
    }

    // 3) Declarar Binding entre Exchange y Queue
    @Bean
    public Binding binding(Queue queue, DirectExchange exchange) {
        return BindingBuilder.bind(queue)
                             .to(exchange)
                             .with(ROUTING_KEY);
    }

    // 4) Convertidor JSON
    @Bean
    public MessageConverter jsonMessageConverter() {
        return new Jackson2JsonMessageConverter();
    }

    // 5) Configurar RabbitTemplate para usar JSON en vez de serialización nativa
    @Bean
    public AmqpTemplate customRabbitTemplate(ConnectionFactory connectionFactory) {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(jsonMessageConverter());
        return rabbitTemplate;
    }
}
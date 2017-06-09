package com.victornieto;

import com.rabbitmq.client.ConnectionFactory;
import org.springframework.amqp.core.*;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by victor.nieto.castan on 08/06/2017.
 */
@Configuration
public class QueueConfig {

    public static final String queueName = "mensajesCola" ;
    public static final String exchangeName = "mensajesExchange" ;
    public static final String routingKey = "mensajesKey" ;

    @Bean
    public Queue queue() {
        return new Queue(queueName, true) ;
    }

    @Bean
    public TopicExchange topicExc() {
        return new TopicExchange(exchangeName, true, false) ;
    }

    @Bean
    public Binding declareBinding() {
        return BindingBuilder.bind(queue()).to(topicExc()).with(routingKey) ;
    }
}
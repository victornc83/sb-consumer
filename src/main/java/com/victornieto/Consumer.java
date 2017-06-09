package com.victornieto;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger ;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * Created by victor.nieto.castan on 08/06/2017.
 */
@Service
public class Consumer {

    private static final Logger log = LoggerFactory.getLogger(Consumer.class);

    @RabbitListener(queues = QueueConfig.queueName)
    public void leeMensaje(final Mensaje mensaje) {
        log.info("Recibido mensaje: Texto={} - Prioridad={}", mensaje.getTexto(),mensaje.getPrioridad()) ;
    }

}

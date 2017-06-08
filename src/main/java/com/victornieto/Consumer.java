package com.victornieto;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

/**
 * Created by victor.nieto.castan on 08/06/2017.
 */
@RabbitListener(queues = "hello")
public class Consumer {

    @RabbitHandler
    public void cosume(String in) {
        System.out.println(" [x] Received '" + in + "'");
    }
}

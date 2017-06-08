package com.victornieto;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by victor.nieto.castan on 08/06/2017.
 */
@Configuration
public class QueueConfig {

    @Bean
    public Queue hello() {
        return new Queue("hello") ;
    }

    @Bean
    public Consumer consumer() {
        return new Consumer() ;
    }

}
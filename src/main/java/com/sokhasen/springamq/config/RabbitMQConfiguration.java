package com.sokhasen.springamq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfiguration {

  @Value("${spring.amqp.routeKey}")
  private String routeKey;

  public String getRouteKey() {
    return routeKey;
  }


  @Bean
  Queue simpleQueue() {

    return new Queue(routeKey, false);
  }
}

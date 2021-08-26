package com.sokhasen.springamq.consumer;

import com.sokhasen.springamq.config.RabbitMQConfiguration;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageQueueConsumer {

  @Autowired private RabbitMQConfiguration rabbitMQConfiguration;

  @RabbitListener(queues = "#{rabbitMQConfiguration.getRouteKey()}")
  public void handler(String message) {


    System.out.println(
        String.format("Message read from %s : %s", rabbitMQConfiguration.getRouteKey(), message));
  }
}

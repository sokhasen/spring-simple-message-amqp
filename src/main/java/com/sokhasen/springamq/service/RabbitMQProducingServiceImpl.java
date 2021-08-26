package com.sokhasen.springamq.service;

import com.sokhasen.springamq.config.RabbitMQConfiguration;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQProducingServiceImpl implements RabbitMQProducingService {

  @Autowired private RabbitTemplate rabbitProducer;

  @Autowired private RabbitMQConfiguration configuration;

  @Override
  public void produce(String message) {

    rabbitProducer.convertAndSend(configuration.getRouteKey(), message);
  }
}

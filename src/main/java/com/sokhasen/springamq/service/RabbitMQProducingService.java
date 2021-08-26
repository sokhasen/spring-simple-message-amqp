package com.sokhasen.springamq.service;

public interface RabbitMQProducingService {

  /**
   * Rabbit AMQ message producer
   *
   * @param message:
   */
  void produce(String message);
}

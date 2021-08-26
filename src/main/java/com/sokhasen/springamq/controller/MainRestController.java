package com.sokhasen.springamq.controller;

import com.sokhasen.springamq.model.BaseResponse;
import com.sokhasen.springamq.service.RabbitMQProducingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  @Autowired private RabbitMQProducingService rabbitMQProducingService;

  @PostMapping
  public ResponseEntity<Object> send(@RequestBody String message) {

    rabbitMQProducingService.produce(message);

    return ResponseEntity.accepted().body(new BaseResponse());
  }
}

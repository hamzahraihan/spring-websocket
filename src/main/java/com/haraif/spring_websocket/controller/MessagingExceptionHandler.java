package com.haraif.spring_websocket.controller;

import org.springframework.messaging.handler.annotation.MessageExceptionHandler;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MessagingExceptionHandler {

  @MessageExceptionHandler(Exception.class)
  @SendToUser("/queue/errors")
  public String handleException(Exception ex) {
    return ex.getMessage();
  }
}

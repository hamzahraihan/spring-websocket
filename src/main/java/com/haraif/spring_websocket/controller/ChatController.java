package com.haraif.spring_websocket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

import com.haraif.spring_websocket.dto.ChatMessageDTO;
import com.haraif.spring_websocket.service.ChatService;

import jakarta.validation.Valid;

@Controller
public class ChatController {

  @Autowired
  private ChatService chatService;

  @MessageMapping("/chat.send")
  public void sendMessage(@Valid ChatMessageDTO message) {
    chatService.handleMessage(message);
  }

}

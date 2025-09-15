package com.haraif.spring_websocket.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.haraif.spring_websocket.dto.ChatMessageDTO;

@Controller
public class ChatController {

  @MessageMapping("/chat.send")
  @SendTo("/topic/public")
  public ChatMessageDTO sendMessage(ChatMessageDTO message) {
    return message;
  }

}

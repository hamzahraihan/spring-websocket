package com.haraif.spring_websocket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import com.haraif.spring_websocket.dto.ChatMessageDTO;
import com.haraif.spring_websocket.model.ChatMessage;
import com.haraif.spring_websocket.service.ChatService;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ChatController {

  @Autowired
  private ChatService chatService;

  @Autowired
  private SimpMessagingTemplate messagingTemplate;

  @MessageMapping("/chat.send")
  public void sendMessage(@Valid ChatMessageDTO messageDto) {
    ChatMessage message = chatService.processMessage(messageDto);

    log.info("new message from {}: {}", message.getSender(), message.getContent());

    messagingTemplate.convertAndSend(message);
  }

}

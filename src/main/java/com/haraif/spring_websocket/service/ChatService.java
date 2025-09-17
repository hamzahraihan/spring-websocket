package com.haraif.spring_websocket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import com.haraif.spring_websocket.dto.ChatMessageDTO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ChatService {

  @Autowired
  private SimpMessagingTemplate template;

  public void handleMessage(ChatMessageDTO dto) {
    dto.setTimestamp(System.currentTimeMillis());
    template.convertAndSend("/topic/public", dto);
  }

}

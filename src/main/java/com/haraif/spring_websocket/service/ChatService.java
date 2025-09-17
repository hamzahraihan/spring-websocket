package com.haraif.spring_websocket.service;

import org.springframework.stereotype.Service;

import com.haraif.spring_websocket.dto.ChatMessageDTO;
import com.haraif.spring_websocket.model.ChatMessage;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ChatService {

  public ChatMessage processMessage(ChatMessageDTO dto) {
    return new ChatMessage(
        dto.getSender(),
        dto.getContent(),
        dto.getTimestamp(),
        dto.getMessageType());
  }

}

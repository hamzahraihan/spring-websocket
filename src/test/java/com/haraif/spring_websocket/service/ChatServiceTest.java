package com.haraif.spring_websocket.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.haraif.spring_websocket.dto.ChatMessageDTO;
import com.haraif.spring_websocket.model.ChatMessage;
import com.haraif.spring_websocket.util.MessageType;

@SpringBootTest
public class ChatServiceTest {

  @Autowired
  private ChatService chatService;

  @Test
  void processMessage_shouldReturnChatMessageWithTypeChat() throws Exception {
    ChatMessageDTO messageDTO = new ChatMessageDTO();
    messageDTO.setSender("Joe");
    messageDTO.setContent("test content");
    messageDTO.setTimestamp(System.currentTimeMillis());
    messageDTO.setMessageType(MessageType.CHAT);

    ChatMessage result = chatService.processMessage(messageDTO);

    assertEquals(messageDTO.getSender(), result.getSender());
    assertEquals(messageDTO.getContent(), result.getContent());
    assertEquals(messageDTO.getTimestamp(), result.getTimestamp());
    assertEquals(messageDTO.getMessageType(), result.getMessageType());
  }

}

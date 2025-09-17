package com.haraif.spring_websocket.dto;

import com.haraif.spring_websocket.util.MessageType;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ChatMessageDTO {

  @NotBlank(message = "sender required")
  @Size(max = 50)
  private String sender;

  @Size(max = 100)
  private String content;

  private long timestamp;
  private MessageType messageType;

  public ChatMessageDTO() {

  }

  public ChatMessageDTO(
      String sender,
      String content,
      long timestamp,
      MessageType messageType) {
    this.sender = sender;
    this.content = content;
    this.timestamp = timestamp;
    this.messageType = messageType;
  }

  public String getSender() {
    return this.sender;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }

  public String getContent() {
    return this.content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public long getTimestamp() {
    return this.timestamp;
  }

  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
  }

  public MessageType getMessageType() {
    return this.messageType;
  }

  public void setMessageType(MessageType messageType) {
    this.messageType = messageType;
  }

}

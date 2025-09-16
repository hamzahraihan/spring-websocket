package com.haraif.spring_websocket.model;

import com.haraif.spring_websocket.util.MessageType;

public class ChatMessage {
  private String sender;
  private String content;
  private long timestamp;
  private MessageType messageType;

  public ChatMessage() {
  }

  public ChatMessage(
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

package com.haraif.spring_websocket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSocketMessageBroker
@RequiredArgsConstructor
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
  @Override
  public void configureMessageBroker(@NonNull MessageBrokerRegistry config) {
    // simple in-memory broker; clients subscribe to destination like "/topic/*"
    config.enableSimpleBroker("/topic", "/queue");

    // message whose destination starts with "/app" routed to @MessageMapping
    config.setApplicationDestinationPrefixes("/app");
  }

  @Override
  public void registerStompEndpoints(@NonNull StompEndpointRegistry registry) {
    // clients connect to "/ws" sockJS fallback enabled
    registry
        .addEndpoint("/ws")
        .setAllowedOrigins("http://localhost:5173")
        .setAllowedOriginPatterns("*")
        .withSockJS();
  }

}

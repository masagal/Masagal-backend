package tech.masagal.markusai.chat.http;

import tech.masagal.markusai.chat.ChatService;
import tech.masagal.markusai.chat.ai.AiManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import tech.masagal.markusai.user.UserRepository;

@Configuration
@EnableWebSocket
public class BrokerConfiguration implements WebSocketConfigurer {
    AiManager aiManager;
    ChatService chatService;
    UserRepository userRepo;

    public BrokerConfiguration(AiManager aiManager, ChatService chatService, UserRepository userRepo) {
        this.aiManager = aiManager;
        this.chatService = chatService;
        this.userRepo = userRepo;
    }

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(chatHandler(), "/chat").setAllowedOrigins("*");
    }

    @Bean
    public WebSocketHandler chatHandler() {
        return new ChatSocketHandler(aiManager, chatService, userRepo);
    }
}

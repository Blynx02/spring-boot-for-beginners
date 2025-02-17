package com.example;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class AIService {
    private ChatClient chatClient;

    public AIService(ChatClient.Builder builder) {
        chatClient = builder.build();
    }

    public  String chat(String prompt) {
        return chatClient.prompt(prompt).call().content();
    }

}

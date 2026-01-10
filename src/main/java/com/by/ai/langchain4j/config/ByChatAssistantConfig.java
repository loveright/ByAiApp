package com.by.ai.langchain4j.config;

import com.by.ai.langchain4j.store.MongoChatMemoryStore;
import dev.langchain4j.memory.chat.ChatMemoryProvider;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhouboyang
 * @version 1.0
 * @ClassName ByChatAssistantConfig
 * @description: TODO
 * @date 2026/1/7 20:52
 */
@Configuration
public class ByChatAssistantConfig {

    @Autowired
    private MongoChatMemoryStore chatMemoryStore;

    @Bean
    public ChatMemoryProvider ByChatMemoryProvider() {

        return memoryId -> MessageWindowChatMemory
                .builder()
                .id(memoryId)
                .chatMemoryStore(chatMemoryStore)
                .maxMessages(10).build();
    }
}

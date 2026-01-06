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
 * @ClassName SeparateChatAssistantConfig
 * @description: TODO
 * @date 2026/1/5 20:57
 */
@Configuration
public class SeparateChatAssistantConfig {

    @Autowired
    private MongoChatMemoryStore chatMemoryStore;

    @Bean
    public ChatMemoryProvider chatMemoryProvider() {
        return memoryId -> MessageWindowChatMemory
                .builder()
                .id(memoryId)
                // .chatMemoryStore(new InMemoryChatMemoryStore())
                .chatMemoryStore(chatMemoryStore)
                .maxMessages(10).build();
    }
}

package com.by.ai.langchain4j.config;

import dev.langchain4j.memory.chat.ChatMemoryProvider;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
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

    @Bean
    public ChatMemoryProvider chatMemoryProvider() {
        return memoryId -> MessageWindowChatMemory.builder().id(memoryId).maxMessages(10).build();
    }
}

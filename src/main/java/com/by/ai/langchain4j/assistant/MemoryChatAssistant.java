package com.by.ai.langchain4j.assistant;

import dev.langchain4j.service.spring.AiService;
import dev.langchain4j.service.spring.AiServiceWiringMode;

/**
 * @author zhouboyang
 * @version 1.0
 * @ClassName MemoryChatAssistant
 * @description: 初级智能体
 * @date 2026/1/5 20:30
 */
@AiService(
        wiringMode = AiServiceWiringMode.EXPLICIT,
        chatModel = "qwenChatModel",
        chatMemory = "chatMemory"
)
public interface MemoryChatAssistant {

    String chat(String message);
}

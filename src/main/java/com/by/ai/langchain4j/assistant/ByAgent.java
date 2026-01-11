package com.by.ai.langchain4j.assistant;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;
import dev.langchain4j.service.spring.AiServiceWiringMode;

/**
 * @author zhouboyang
 * @version 1.0
 * @ClassName ByAssistant
 * @description: TODO
 * @date 2026/1/7 20:37
 */
@AiService(
        wiringMode = AiServiceWiringMode.EXPLICIT,
        chatModel = "qwenChatModel",
        chatMemoryProvider = "ByChatMemoryProvider",
        tools = "appointmentTools",
        contentRetriever = "contentRetrieverByPincone"
)
public interface ByAgent {

    @SystemMessage(fromResource = "by-promopt-templete.txt")
    String chat(@MemoryId Long memoryId, @UserMessage String userMessage);
}

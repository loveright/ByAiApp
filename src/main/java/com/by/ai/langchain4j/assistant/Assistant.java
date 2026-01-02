package com.by.ai.langchain4j.assistant;

import dev.langchain4j.service.spring.AiService;

import static dev.langchain4j.service.spring.AiServiceWiringMode.EXPLICIT;

/**
 * @author zhouboyang
 * @version 1.0
 * @ClassName Assistant
 * @description: TODO
 * @date 2026/1/2 21:23
 */
@AiService(wiringMode = EXPLICIT, chatModel = "qwenChatModel")
public interface Assistant {

    String chat(String userMessage);
}

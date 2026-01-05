package com.by.ai.langchain4j;

import com.by.ai.langchain4j.assistant.Assistant;
import com.by.ai.langchain4j.assistant.MemoryChatAssistant;
import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.service.AiServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author zhouboyang
 * @version 1.0
 * @ClassName ChatMemoryTest
 * @description: TODO
 * @date 2026/1/2 21:49
 */
@SpringBootTest
public class ChatMemoryTest {

    @Autowired
    private Assistant assistant;

    @Autowired
    private QwenChatModel qwenChatModel;

    @Autowired
    private MemoryChatAssistant memoryChatAssistant;

    @Test
    public void testChatMemory() {
        String chat = assistant.chat("我是by");
        System.out.println(chat);
        String chat1 = assistant.chat("我是谁");
        System.out.println(chat1);
    }

    @Test
    public void testChatMemory2() {
        MessageWindowChatMemory chatMemory = MessageWindowChatMemory.withMaxMessages(10);
        Assistant assistant1 = AiServices.builder(Assistant.class)
                .chatLanguageModel(qwenChatModel)
                .chatMemory(chatMemory)
                .build();
        String answer1 = assistant1.chat("我是by");
        System.out.println(answer1);
        String answer2 = assistant1.chat("我是谁");
        System.out.println(answer2);
    }

    @Test
    public void testChatMemory3() {
        String answer1 = memoryChatAssistant.chat("我是张三");
        System.out.println(answer1);
        String answer2 = memoryChatAssistant.chat("我是谁");
        System.out.println(answer2);
    }
}

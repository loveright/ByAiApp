package com.by.ai.langchain4j;

import com.by.ai.langchain4j.assistant.SeparateChatAssistant;
import dev.langchain4j.model.input.Prompt;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author zhouboyang
 * @version 1.0
 * @ClassName PromptTest
 * @description: TODO
 * @date 2026/1/6 21:44
 */
@SpringBootTest
public class PromptTest {

    @Autowired
    private SeparateChatAssistant separateChatAssistant;

    @Test
    public void testSystemMessage() {
        String answer = separateChatAssistant.chat(4, "今天是几号");
        System.out.println(answer);
    }
}

package com.by.ai.langchain4j;

import com.by.ai.langchain4j.assistant.MemoryChatAssistant;
import com.by.ai.langchain4j.assistant.SeparateChatAssistant;
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

    @Autowired
    private MemoryChatAssistant memoryChatAssistant;

    @Test
    public void testSystemMessage() {
        String answer = separateChatAssistant.chat(5, "今天是几号");
        System.out.println(answer);
    }

    @Test
    public void testUserMessage() {
        String answer = memoryChatAssistant.chat("我是by");
        System.out.println(answer);
        String answer1 = memoryChatAssistant.chat("我是谁");
        System.out.println(answer1);
    }

    @Test
    public void testV() {
        String answer = separateChatAssistant.chat2(10, "我是by");
        System.out.println(answer);
        String answer1 = separateChatAssistant.chat2(10, "我是谁");
        System.out.println(answer1);
    }

    @Test
    public void testUserInfo() {
        String answer = separateChatAssistant.chat3(20, "我是谁，我多大了", "翠花", 18);
        System.out.println(answer);
    }

}

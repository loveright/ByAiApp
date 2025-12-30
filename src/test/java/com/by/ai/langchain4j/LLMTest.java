package com.by.ai.langchain4j;

import dev.langchain4j.model.openai.OpenAiChatModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author zhouboyang
 * @version 1.0
 * @ClassName LLMTest
 * @description: TODO
 * @date 2025/12/27 13:16
 */
@SpringBootTest
public class LLMTest {

    @Test
    public void testGPTDemo() {
        OpenAiChatModel model = OpenAiChatModel.builder()
                .baseUrl("http://langchain4j.dev/demo/openai/v1")
                .apiKey("demo")
                .modelName("gpt-4o-mini")
                .build();

        String chat = model.chat("你好");
        System.out.println(chat);
    }

    @Autowired
    private OpenAiChatModel model;

    @Test
    public void testSpringbootDemo() {
        String chat = model.chat("我是谁");
        System.out.println(chat);
    }
}

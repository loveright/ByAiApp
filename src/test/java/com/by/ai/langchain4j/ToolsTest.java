package com.by.ai.langchain4j;

import com.by.ai.langchain4j.assistant.SeparateChatAssistant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author zhouboyang
 * @version 1.0
 * @ClassName ToolsTest
 * @description: TODO
 * @date 2026/1/10 15:10
 */
@SpringBootTest
public class ToolsTest {

    @Autowired
    private SeparateChatAssistant separateChatAssistant;

    @Test
    public void testCalculatorTools() {
        String answer = separateChatAssistant.chat(2, "1+2等于几，16的平方根是多少");
        System.out.println(answer);
    }

}

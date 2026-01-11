package com.by.ai.langchain4j.controller;

import com.by.ai.langchain4j.assistant.ByAgent;
import com.by.ai.langchain4j.bean.ChatForm;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouboyang
 * @version 1.0
 * @ClassName ByAgentController
 * @description: TODO
 * @date 2026/1/7 21:01
 */
@Tag(name = "By小智")
@RestController
@RequestMapping("/agent")
public class ByAgentController {

    @Autowired
    private ByAgent byAssistant;

    @Operation(summary = "对话")
    @PostMapping("/chat")
    public String chat(@RequestBody ChatForm chatForm) {
        return byAssistant.chat(chatForm.getMemoryId(),chatForm.getMessage());
    }
}

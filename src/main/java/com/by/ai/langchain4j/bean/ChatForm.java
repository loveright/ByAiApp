package com.by.ai.langchain4j.bean;

import lombok.Data;

/**
 * @author zhouboyang
 * @version 1.0
 * @ClassName ChatForm
 * @description: TODO
 * @date 2026/1/7 20:58
 */
@Data
public class ChatForm {

    private Long memoryId;//对话id
    private String message;//用户问题
}

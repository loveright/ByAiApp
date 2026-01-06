package com.by.ai.langchain4j.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author zhouboyang
 * @version 1.0
 * @ClassName ChatMessages
 * @description: TODO
 * @date 2026/1/6 19:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("chat_messages")
public class ChatMessages {

    @Id
    private ObjectId messageId;

    private String memoryId;

    private String content;


}

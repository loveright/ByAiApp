package com.by.ai.langchain4j;

import com.by.ai.langchain4j.bean.ChatMessages;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

/**
 * @author zhouboyang
 * @version 1.0
 * @ClassName MongoCrudTest
 * @description: TODO
 * @date 2026/1/6 19:45
 */
@SpringBootTest
public class MongoCrudTest {

    @Autowired
    MongoTemplate mongoTemplate;

    // @Test
    // public void testInsert() {
    //     mongoTemplate.insert(new ChatMessages(1L,"聊天记录"));
    // }

    @Test
    public void testInsert2() {
        ChatMessages chatMessages = new ChatMessages();
        chatMessages.setContent("聊天记录列表");
        mongoTemplate.insert(chatMessages);
    }

    @Test
    public void testFindById() {
        ChatMessages messages = mongoTemplate.findById("695cfeaa56ca141ed179d58a", ChatMessages.class);
        System.out.println(messages);
    }

    @Test
    public void testUpdate() {
        // Criteria criteria = Criteria.where("_id").is("695cfeaa56ca141ed179d58a");
        Criteria criteria = Criteria.where("_id").is("100");
        Query query = new Query(criteria);
        Update update = new Update();
        update.set("content", "新聊天记录列表");
        // 修改或新增
        mongoTemplate.upsert(query, update, ChatMessages.class);
    }

    @Test
    public void testDelete() {
        Criteria criteria = Criteria.where("_id").is("100");
        Query query = new Query(criteria);
        mongoTemplate.remove(query, ChatMessages.class);
    }
}

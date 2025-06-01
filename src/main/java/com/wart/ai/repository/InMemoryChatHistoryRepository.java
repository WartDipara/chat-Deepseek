package com.wart.ai.repository;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Yips
 */
@Component
public class InMemoryChatHistoryRepository implements  ChatHistoryRepository{

    private final Map<String,List<String>>  chatHistory = new HashMap<>();

    @Override
    public void save(String type, String chatId) {
        List<String> chatIds = chatHistory.computeIfAbsent( type, k -> new ArrayList<>());
        if(!chatIds.contains(chatId)){
             chatIds.add(chatId);
        }
    }

    @Override
    public List<String> getChatIds(String type) {
//        List<String> chatIds = chatHistory.get(type);
//        return  chatIds == null ? new ArrayList<>() : chatIds;
        return  chatHistory.getOrDefault(type,List.of()); //等价于上面两行代码
    }
}

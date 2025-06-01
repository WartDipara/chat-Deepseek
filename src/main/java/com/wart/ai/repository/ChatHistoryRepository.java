package com.wart.ai.repository;

import java.util.List;

/**
 * @author Yips
 */
public interface ChatHistoryRepository {
    /**
     * 保存 会话记录
     * @param type 服务类型
     * @param chatId
     */
    void save(String type, String chatId);

    /**
     * 查询 会话ID列表
     * @param type
     * @return 会话ID列表
     */
    List<String> getChatIds(String type);


}

package com.wart.ai.entity.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.ai.chat.messages.Message;

/**
 * @author Yips
 */
@NoArgsConstructor
@Data
public class MessageVO {
    private String role;
    private String content;
    public MessageVO(Message message){
        switch(message.getMessageType()){
            case USER:
                this.role = "user";
                break;
            case ASSISTANT:
                this.role = "assistant";
                break;
            default:
                this.role = "unknown";
        }
        this.content = message.getText();
    }
}

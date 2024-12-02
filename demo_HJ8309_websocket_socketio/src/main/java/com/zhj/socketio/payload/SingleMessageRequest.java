package com.zhj.socketio.payload;

import lombok.Data;

@Data
public class SingleMessageRequest {
    /**
     * 消息发送方用户id
     */
    private String fromUid;

    /**
     * 消息接收方用户id
     */
    private String toUid;

    /**
     * 消息内容
     */
    private String message;
}

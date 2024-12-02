package com.zhj.socketio.payload;

import lombok.Data;

@Data
public class BroadcastMessageRequest {
    /**
     * 消息内容
     */
    private String message;
}


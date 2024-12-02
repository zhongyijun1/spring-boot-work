package com.zhj.socketio.payload;

import lombok.Data;

@Data
public class GroupMessageRequest {
    /**
     * 消息发送方用户id
     */
    private String fromUid;

    /**
     * 群组id
     */
    private String groupId;

    /**
     * 消息内容
     */
    private String message;
}


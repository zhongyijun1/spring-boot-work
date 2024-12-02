package com.zhj.socketio.payload;

import lombok.Data;

@Data
public class JoinRequest {
    /**
     * 用户id
     */
    private String userId;

    /**
     * 群名称
     */
    private String groupId;
}

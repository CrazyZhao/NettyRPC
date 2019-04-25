package com.zbl.nettyrpc.netty.protocol.request;

import com.zbl.nettyrpc.netty.protocol.Packet;

import static com.zbl.nettyrpc.netty.protocol.Command.LOGIN_REQUEST;

/**
 * Created by Administrator on 2019/4/25.
 */
public class LoginRequestPacket extends Packet {

    private String userId;

    private String username;

    private String password;

    @Override
    public Byte getCommand() {
        return LOGIN_REQUEST;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

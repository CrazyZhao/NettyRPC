package com.zbl.nettyrpc.netty.protocol.request;

import com.zbl.nettyrpc.netty.protocol.Packet;

import static com.zbl.nettyrpc.netty.protocol.Command.MESSAGE_REQUEST;

/**
 * Created by Administrator on 2019/4/25.
 */
public class MessageRequestPacket extends Packet {

    private String message;

    @Override
    public Byte getCommand() {
        return MESSAGE_REQUEST;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

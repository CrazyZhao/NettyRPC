package com.zbl.nettyrpc.netty.protocol.response;

import com.zbl.nettyrpc.netty.protocol.Packet;

import static com.zbl.nettyrpc.netty.protocol.Command.MESSAGE_RESPONSE;

/**
 * Created by Administrator on 2019/4/25.
 */
public class MessageResponsePacket extends Packet {

    private String message;

    @Override
    public Byte getCommand() {
        return MESSAGE_RESPONSE;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

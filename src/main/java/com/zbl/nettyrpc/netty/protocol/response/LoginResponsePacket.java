package com.zbl.nettyrpc.netty.protocol.response;

import com.zbl.nettyrpc.netty.protocol.Packet;

import static com.zbl.nettyrpc.netty.protocol.Command.LOGIN_RESPONSE;

/**
 * Created by Administrator on 2019/4/25.
 */
public class LoginResponsePacket extends Packet {

    private boolean success;

    private String reason;

    @Override
    public Byte getCommand() {
        return LOGIN_RESPONSE;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}

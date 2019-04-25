package com.zbl.nettyrpc.netty.protocol;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by Administrator on 2019/4/25.
 */
public abstract class Packet {

    /**
     * 协议版本
     */
    @JSONField(deserialize = false, serialize = false)
    private Byte version = 1;


    @JSONField(serialize = false)
    public abstract Byte getCommand();

    public Byte getVersion() {
        return version;
    }

    public void setVersion(Byte version) {
        this.version = version;
    }
}

package com.zbl.nettyrpc.netty.serialize.impl;

import com.alibaba.fastjson.JSON;
import com.zbl.nettyrpc.netty.serialize.Serializer;
import com.zbl.nettyrpc.netty.serialize.SerializerAlogrithm;

/**
 * Created by Administrator on 2019/4/25.
 */
public class JSONSerializer implements Serializer {
    @Override
    public byte getSerializerAlogrithm() {
        return SerializerAlogrithm.JSON;
    }

    @Override
    public byte[] serialize(Object object) {
        return JSON.toJSONBytes(object);
    }

    @Override
    public <T> T deserialize(Class<T> clazz, byte[] bytes) {
        return JSON.parseObject(bytes, clazz);
    }
}

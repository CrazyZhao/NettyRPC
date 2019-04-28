package com.zbl.nettyrpc.netty.attribute;

import io.netty.util.AttributeKey;

/**
 * Created by Administrator on 2019/4/25.
 */
public interface Attributes {

    AttributeKey<Boolean> LOGIN = AttributeKey.newInstance("login");
}

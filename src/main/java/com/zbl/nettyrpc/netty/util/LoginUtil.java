package com.zbl.nettyrpc.netty.util;

import com.zbl.nettyrpc.netty.attribute.Attributes;
import io.netty.channel.Channel;
import io.netty.util.Attribute;

/**
 * Created by Administrator on 2019/4/25.
 */
public class LoginUtil {

    /**
     * 设置登录标志位
     * @param channel
     */
    public static void markAsLogin(Channel channel){
        channel.attr(Attributes.LOGIN).set(true);
    }

    /**
     * 判断是否有登录标志位
     * @param channel
     * @return
     */
    public static boolean hasLogin(Channel channel){
        Attribute<Boolean> loginAttr = channel.attr(Attributes.LOGIN);
        return loginAttr != null;
    }
}

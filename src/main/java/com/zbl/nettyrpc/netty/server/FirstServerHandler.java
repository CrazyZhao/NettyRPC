package com.zbl.nettyrpc.netty.server;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.joda.time.DateTime;

import java.nio.charset.Charset;

/**
 * Created by Administrator on 2019/4/24.
 * 服务端数据读写处理逻辑-逻辑处理器
 */
public class FirstServerHandler extends ChannelInboundHandlerAdapter{
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        // 接收数据逻辑
        ByteBuf byteBuf = (ByteBuf) msg;
        System.out.println(DateTime.now().toDate() + ":服务端读到数据 -> " + byteBuf.toString(Charset.forName("utf-8")));

        // 回复数据到客户端
        System.out.println(DateTime.now().toDate() + ":服务端回复数据");
        ByteBuf out = getByteBuf(ctx);
        ctx.channel().writeAndFlush(out);
    }

    private ByteBuf getByteBuf(ChannelHandlerContext ctx){
        byte[] bytes = "你好，欢迎关注微信公众号-后端开发者中心！".getBytes(Charset.forName("utf-8"));

        ByteBuf buffer = ctx.alloc().buffer();
        buffer.writeBytes(bytes);
        return buffer;
    }
}

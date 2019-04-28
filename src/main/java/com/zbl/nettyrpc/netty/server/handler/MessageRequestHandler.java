package com.zbl.nettyrpc.netty.server.handler;

import com.zbl.nettyrpc.netty.protocol.request.MessageRequestPacket;
import com.zbl.nettyrpc.netty.protocol.response.MessageResponsePacket;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.Date;

/**
 * Created by Administrator on 2019/4/28.
 */
public class MessageRequestHandler extends SimpleChannelInboundHandler<MessageRequestPacket> {

    /**
     * 实现该方法,专注于要处理的消息逻辑（无需解码编码,传递本handler处理不了的逻辑等）
     * @param channelHandlerContext
     * @param messageRequestPacket
     * @throws Exception
     */
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, MessageRequestPacket messageRequestPacket) throws Exception {
        MessageResponsePacket messageResponsePacket = new MessageResponsePacket();
        System.out.println(new Date() + ": 收到客户端消息: " + messageRequestPacket.getMessage());
        messageResponsePacket.setMessage("服务端回复【" + messageRequestPacket.getMessage() + "】");

        channelHandlerContext.channel().writeAndFlush(messageResponsePacket);
    }
}

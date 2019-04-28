package com.zbl.nettyrpc.netty.codec;

import com.zbl.nettyrpc.netty.protocol.Packet;
import com.zbl.nettyrpc.netty.protocol.PacketCodeC;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * Created by Administrator on 2019/4/28.
 */
public class PacketEncoder extends MessageToByteEncoder<Packet>{
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, Packet packet, ByteBuf out) throws Exception {
       PacketCodeC.INSTANCE.encode(out, packet);
    }
}

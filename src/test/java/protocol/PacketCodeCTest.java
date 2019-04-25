package protocol;

import com.zbl.nettyrpc.netty.protocol.LoginRequestPacket;
import com.zbl.nettyrpc.netty.protocol.Packet;
import com.zbl.nettyrpc.netty.protocol.PacketCodeC;
import com.zbl.nettyrpc.netty.serialize.Serializer;
import com.zbl.nettyrpc.netty.serialize.impl.JSONSerializer;
import io.netty.buffer.ByteBuf;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Administrator on 2019/4/25.
 */
public class PacketCodeCTest {

    @Test
    public void encode() {

        Serializer serializer = new JSONSerializer();
        LoginRequestPacket loginRequestPacket = new LoginRequestPacket();

        loginRequestPacket.setVersion(((byte) 1));
        loginRequestPacket.setUserId(123);
        loginRequestPacket.setUsername("zhangsan");
        loginRequestPacket.setPassword("password");

        PacketCodeC packetCodeC = new PacketCodeC();
        ByteBuf byteBuf = packetCodeC.encode(loginRequestPacket);
        Packet decodedPacket = packetCodeC.decode(byteBuf);

        Assert.assertArrayEquals(serializer.serialize(loginRequestPacket), serializer.serialize(decodedPacket));


    }
}

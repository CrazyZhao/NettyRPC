import com.zbl.nettyrpc.netty.old.ServerHandler;

public class NettyTest {

    public static void main(String[] args) throws Exception {

        ServerHandler serverHandler = new ServerHandler();
        serverHandler.channelRead(null, "");
    }
}

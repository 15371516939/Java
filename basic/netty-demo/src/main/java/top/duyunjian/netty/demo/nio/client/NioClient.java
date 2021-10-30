package top.duyunjian.netty.demo.nio.client;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

/**
 * @program: netty-demo-1-00
 * @description:
 * @author: duyunjian
 * @create: 2021-10-30 19:36
 **/
public class NioClient {
    public static void main(String[] args) throws IOException {
        Selector selector = Selector.open();
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.configureBlocking(false);

        boolean isConnect = socketChannel.connect(new InetSocketAddress("10.30.186.220", 4000));
        if (isConnect) {
            socketChannel.register(selector, SelectionKey.OP_READ);
        } else {
            socketChannel.register(selector, SelectionKey.OP_CONNECT);
        }
        System.out.println("NIO客户端启动成功！");
        new NioClientHandler(selector, StandardCharsets.UTF_8).start();
    }

}
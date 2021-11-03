package top.duyunjian.netty.demo.client;


import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import top.duyunjian.netty.demo.util.MsgUtil;

/**
 * @description: NettyClient
 * @author: mqxu
 * @date: 2021-11-02
 */
public class NettyClient {

    public static void main(String[] args) {
        new NettyClient().connect("127.0.0.1", 7397);
    }

    private void connect(String host, int port) {
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap();
            b.group(workerGroup);
            b.channel(NioSocketChannel.class);
            b.option(ChannelOption.AUTO_READ, true);
            b.handler(new MyChannelInitializer());
            ChannelFuture f = b.connect(host, port).sync();
            System.out.println("Netty客户端启动成功！");

            f.channel().writeAndFlush(MsgUtil.buildMsg(f.channel().id().toString(), "你好，海绵宝宝。"));
            f.channel().writeAndFlush(MsgUtil.buildMsg(f.channel().id().toString(), "你好，派大星。"));
            f.channel().writeAndFlush(MsgUtil.buildMsg(f.channel().id().toString(), "你好，蟹老板。"));
            f.channel().writeAndFlush(MsgUtil.buildMsg(f.channel().id().toString(), "谢谢，许老师。"));
            f.channel().writeAndFlush(MsgUtil.buildMsg(f.channel().id().toString(), "你好，章鱼哥。"));

            f.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            workerGroup.shutdownGracefully();
        }
    }
}

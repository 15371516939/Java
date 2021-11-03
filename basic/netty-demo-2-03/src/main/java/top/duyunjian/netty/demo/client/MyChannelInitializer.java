package top.duyunjian.netty.demo.client;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import top.duyunjian.netty.demo.codec.ObjDecoder;
import top.duyunjian.netty.demo.codec.ObjEncoder;
import top.duyunjian.netty.demo.domain.MsgInfo;

/**
 * @description: MyChannelInitializer
 * @author: mqxu
 * @date: 2021-11-02
 */
public class MyChannelInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel channel) throws Exception {
        //对象传输处理
        channel.pipeline().addLast(new ObjDecoder(MsgInfo.class));
        channel.pipeline().addLast(new ObjEncoder(MsgInfo.class));
        // 在管道中添加我们自己的接收数据实现方法
        channel.pipeline().addLast(new MyClientHandler());
    }

}
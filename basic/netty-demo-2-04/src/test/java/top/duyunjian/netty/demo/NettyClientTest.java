package top.duyunjian.netty.demo;


import io.netty.channel.ChannelFuture;
import top.duyunjian.netty.demo.client.NettyClient;
import top.duyunjian.netty.demo.domain.FileTransferProtocol;
import top.duyunjian.netty.demo.util.MsgUtil;

import java.io.File;

/**
 * @description: NettyClientTest
 * @author: mqxu
 * @date: 2021-11-02
 **/
public class NettyClientTest {

    public static void main(String[] args) {
        //启动客户端
        ChannelFuture channelFuture = new NettyClient().connect("10.30.193.26", 4000);

        //文件信息{文件大于1024kb方便测试断点续传}
        File file = new File("C:\\Users\\Dyj\\Desktop\\111.zip");
        FileTransferProtocol fileTransferProtocol = MsgUtil.buildRequestTransferFile(file.getAbsolutePath(), file.getName(), file.length());
        //发送信息；请求传输文件
        channelFuture.channel().writeAndFlush(fileTransferProtocol);
    }

}
package top.duyunjian.netty.demo;

import top.duyunjian.netty.demo.server.NettyServer;

/**
 * @description: NettyServerTest
 * @author: duyunjian
 * @date: 2021-11-02
 **/
public class NettyServerTest {

    public static void main(String[] args) {
        System.out.println("凡是过往，皆为序章");
        new NettyServer().bing(4000);
    }
}
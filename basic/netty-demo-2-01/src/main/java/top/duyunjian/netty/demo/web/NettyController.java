package top.duyunjian.netty.demo.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.duyunjian.netty.demo.server.NettyServer;

import javax.annotation.Resource;

/**
 * @description: NettyController
 * @author: mqxu
 * @date: 2021-11-02
 **/
@RestController
@RequestMapping(value = "/server")
public class NettyController {

    @Resource
    private NettyServer nettyServer;

    @GetMapping("/address")
    public String localAddress() {
        return "Netty Server local Address：" + nettyServer.getChannel().localAddress();
    }

    @GetMapping("/open")
    public String isOpen() {
        return "Netty Server isOpen？" + nettyServer.getChannel().isOpen();
    }
}
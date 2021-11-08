package top.duyunjian.chat.domain.inet.service;


import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import top.duyunjian.chat.application.InetService;
import top.duyunjian.chat.domain.inet.model.ChannelUserInfo;
import top.duyunjian.chat.domain.inet.model.ChannelUserReq;
import top.duyunjian.chat.domain.inet.model.InetServerInfo;
import top.duyunjian.chat.domain.inet.repository.IInetRepository;
import top.duyunjian.chat.infrastructure.common.SocketChannelUtil;
import top.duyunjian.chat.socket.NettyServer;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author duyunjian
 */
@Service("inetService")
public class InetServiceImpl implements InetService {

    private final Logger logger = LoggerFactory.getLogger(InetServiceImpl.class);

    @Value("${netty.ip}")
    private String ip;

    @Value("${netty.port}")
    private int port;

    @Resource
    private NettyServer nettyServer;

    @Resource
    private IInetRepository inetRepository;

    @Override
    public InetServerInfo queryNettyServerInfo() {
        InetServerInfo inetServerInfo = new InetServerInfo();
        inetServerInfo.setIp(ip);
        inetServerInfo.setPort(port);
        inetServerInfo.setStatus(nettyServer.channel().isActive());
        return inetServerInfo;
    }

    @Override
    public Long queryChannelUserCount(ChannelUserReq req) {
        return inetRepository.queryChannelUserCount(req);
    }

    @Override
    public List<ChannelUserInfo> queryChannelUserList(ChannelUserReq req) {
        List<ChannelUserInfo> channelUserInfoList = inetRepository.queryChannelUserList(req);
        for (ChannelUserInfo channelUserInfo : channelUserInfoList) {
            Channel channel = SocketChannelUtil.getChannel(channelUserInfo.getUserId());
            if (null == channel || !channel.isActive()) {
                channelUserInfo.setStatus(false);
            } else {
                channelUserInfo.setStatus(true);
            }
        }
        return channelUserInfoList;
    }
}
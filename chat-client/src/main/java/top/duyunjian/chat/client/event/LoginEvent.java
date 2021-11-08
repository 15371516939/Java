package top.duyunjian.chat.client.event;

import io.netty.channel.Channel;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.duyunjian.chat.client.infrastructure.util.BeanUtil;
import top.duyunjian.chat.client.infrastructure.util.CacheUtil;
import top.duyunjian.chat.protocol.login.LoginRequest;
import top.duyunjian.chat.ui.view.login.ILoginEvent;

/**
 * 事件实现；登陆窗口
 *
 * @author duyunjian
 */
@Slf4j
public class LoginEvent implements ILoginEvent {

    @Override
    public void doLoginCheck(String userId, String userPassword) {
        Channel channel = BeanUtil.getBean("channel", Channel.class);
        channel.writeAndFlush(new LoginRequest(userId, userPassword));
        CacheUtil.userId = userId;
    }

}
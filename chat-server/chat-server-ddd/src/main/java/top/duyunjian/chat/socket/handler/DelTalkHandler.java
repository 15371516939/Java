package top.duyunjian.chat.socket.handler;

import io.netty.channel.Channel;
import top.duyunjian.chat.application.UserService;
import top.duyunjian.chat.protocol.talk.DelTalkRequest;
import top.duyunjian.chat.socket.MyBizHandler;

/**
 * @author duyunjian
 */
public class DelTalkHandler extends MyBizHandler<DelTalkRequest> {

    public DelTalkHandler(UserService userService) {
        super(userService);
    }

    @Override
    public void channelRead(Channel channel, DelTalkRequest msg) {
        userService.deleteUserTalk(msg.getUserId(), msg.getTalkId());
    }
}

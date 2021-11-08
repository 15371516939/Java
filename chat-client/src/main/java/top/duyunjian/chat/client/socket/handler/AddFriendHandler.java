package top.duyunjian.chat.client.socket.handler;

import top.duyunjian.chat.client.application.UIService;
import io.netty.channel.Channel;
import javafx.application.Platform;
import top.duyunjian.chat.client.application.UIService;
import top.duyunjian.chat.client.socket.MyBizHandler;
import top.duyunjian.chat.protocol.friend.AddFriendResponse;
import top.duyunjian.chat.ui.view.chat.IChatMethod;
import java.nio.channels.Channel;

public class AddFriendHandler extends MyBizHandler<AddFriendResponse> {

    public AddFriendHandler(UIService uiService) {
        super(uiService);
    }

    @Override
    public void channelRead(Channel channel, AddFriendResponse msg) {
        IChatMethod chat = uiService.getChat();
        Platform.runLater(() -> chat.addFriendUser(true, msg.getFriendId(), msg.getFriendNickName(), msg.getFriendHead()));
    }

}

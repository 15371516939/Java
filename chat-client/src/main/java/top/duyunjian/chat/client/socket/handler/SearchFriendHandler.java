package top.duyunjian.chat.client.socket.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import javafx.application.Platform;
import top.duyunjian.chat.client.application.UIService;
import top.duyunjian.chat.protocol.friend.SearchFriendResponse;
import top.duyunjian.chat.protocol.friend.dto.UserDto;
import top.duyunjian.chat.ui.view.chat.IChatMethod;

import java.util.List;

/**
 * @author duyunjian
 */
public class SearchFriendHandler extends SimpleChannelInboundHandler<SearchFriendResponse> {

    private final UIService uiService;

    public SearchFriendHandler(UIService uiService) {
        this.uiService = uiService;
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, SearchFriendResponse msg) throws Exception {
        List<UserDto> list = msg.getList();
        if (null == list || list.isEmpty()) {
            return;
        }
        IChatMethod chat = uiService.getChat();
        Platform.runLater(() -> {
            for (UserDto user : list) {
                chat.addNewFriend(user.getUserId(), user.getUserNickName(), user.getUserHead(), user.getStatus());
            }
        });
    }

}

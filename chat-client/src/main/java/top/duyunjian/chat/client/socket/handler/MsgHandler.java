package top.duyunjian.chat.client.socket.handler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import javafx.application.Platform;
import top.duyunjian.chat.client.application.UIService;
import top.duyunjian.chat.protocol.msg.MsgResponse;
import top.duyunjian.chat.ui.view.chat.IChatMethod;

/**
 * @author duyunjian
 */
public class MsgHandler extends SimpleChannelInboundHandler<MsgResponse> {

    private final UIService uiService;

    public MsgHandler(UIService uiService) {
        this.uiService = uiService;
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MsgResponse msg) throws Exception {
        IChatMethod chat = uiService.getChat();
        Platform.runLater(() -> {
            chat.addTalkMsgUserLeft(msg.getFriendId(), msg.getMsgText(), msg.getMsgType(), msg.getMsgDate(), true, false, true);
        });
    }

}

package top.duyunjian.chat.protocol.login;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import top.duyunjian.chat.protocol.friend.Command;
import top.duyunjian.chat.protocol.friend.Packet;


/**
 * 重连请求
 * @author duyunjian
 */
@Getter
@Setter
@ToString
public class ReconnectRequest extends Packet {

    private String userId;

    public ReconnectRequest(String userId) {
        this.userId = userId;
    }

    @Override
    public Object getCommand() {
        return Command.ReconnectRequest;
    }
}

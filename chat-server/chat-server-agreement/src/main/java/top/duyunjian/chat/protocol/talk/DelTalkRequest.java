package top.duyunjian.chat.protocol.talk;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import top.duyunjian.chat.protocol.friend.Command;
import top.duyunjian.chat.protocol.friend.Packet;

/**
 * 删除对话框请求
 *
 * @author duyunjian
 */
@Getter
@Setter
@ToString
public class DelTalkRequest extends Packet {

    private String userId;
    private String talkId;

    public DelTalkRequest() {
    }

    public DelTalkRequest(String userId, String talkId) {
        this.userId = userId;
        this.talkId = talkId;
    }

    @Override
    public Object getCommand() {
        return Command.DelTalkRequest;
    }
}

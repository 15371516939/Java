package top.duyunjian.chat.protocol.msg;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import top.duyunjian.chat.protocol.friend.Command;
import top.duyunjian.chat.protocol.friend.Packet;

import java.util.Date;

/**
 * 消息请求
 *
 * @author duyunjian
 */
@Getter
@Setter
@ToString
public class MsgRequest extends Packet {

    private String userId;
    /**
     * 好友ID[对方]
     */
    private String friendId;
    /**
     * 传输消息内容
     */
    private String msgText;
    /**
     * 消息类型；0文字消息、1固定表情
     */
    private Integer msgType;
    /**
     * 消息时间
     */
    private Date msgDate;

    public MsgRequest() {
    }

    public MsgRequest(String userId, String friendId, String msgText, Integer msgType, Date msgDate) {
        this.userId = userId;
        this.friendId = friendId;
        this.msgText = msgText;
        this.msgType = msgType;
        this.msgDate = msgDate;
    }

    @Override
    public Object getCommand() {
        return Command.MsgRequest;
    }

}

package top.duyunjian.chat.protocol.friend;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * 添加好友应答
 * @author duyunjian
 */
@Getter
@Setter
@ToString
public class AddFriendResponse extends Packet {

    private String friendId;
    private String friendNickName;
    private String friendHead;

    public AddFriendResponse() {
    }

    public AddFriendResponse(String friendId, String friendNickName, String friendHead) {
        this.friendId = friendId;
        this.friendNickName = friendNickName;
        this.friendHead = friendHead;
    }

    @Override
    public Object getCommand() {
        return Command.AddFriendResponse;
    }
}

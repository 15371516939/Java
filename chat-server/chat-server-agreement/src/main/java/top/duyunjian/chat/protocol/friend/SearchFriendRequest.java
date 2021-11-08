package top.duyunjian.chat.protocol.friend;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * 搜索好友请求
 *
 * @author duyunjian
 */
@Getter
@Setter
@ToString
public class SearchFriendRequest extends Packet {

    /**
     * 用户ID
     */
    private String userId;
    /**
     * 搜索字段
     */
    private String searchKey;

    public SearchFriendRequest() {
    }

    public SearchFriendRequest(String userId, String searchKey) {
        this.userId = userId;
        this.searchKey = searchKey;
    }


    @Override
    public Object getCommand() {
        return Command.SearchFriendRequest;
    }

}

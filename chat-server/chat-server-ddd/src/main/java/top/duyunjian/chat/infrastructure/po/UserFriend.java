package top.duyunjian.chat.infrastructure.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 用户好友
 *
 * @author duyunjian
 */

@Data
public class UserFriend {

    private Long id;
    private String userId;
    private String userFriendId;
    private Date createTime;
    private Date updateTime;

    public UserFriend() {
    }

    public UserFriend(String userId, String userFriendId) {
        this.userId = userId;
        this.userFriendId = userFriendId;
    }

}

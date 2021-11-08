package top.duyunjian.chat.domain.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 好友信息
 *
 * @author duyunjian
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserFriendInfo {

    private String friendId;
    private String friendName;
    private String friendHead;

}

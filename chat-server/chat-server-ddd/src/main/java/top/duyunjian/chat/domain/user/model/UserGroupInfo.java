package top.duyunjian.chat.domain.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户群组信息
 *
 * @author duyunjian
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserGroupInfo {

    private String userId;
    private String userNickName;
    private String userHead;

}
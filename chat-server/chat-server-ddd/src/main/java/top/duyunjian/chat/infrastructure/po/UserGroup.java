package top.duyunjian.chat.infrastructure.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 用户群组
 *
 * @author duyunjian
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserGroup {

    private Long id;
    private String userId;
    private String groupId;
    private Date createTime;
    private Date updateTime;
}
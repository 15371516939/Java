package top.duyunjian.chat.infrastructure.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


/**
 * @author duyunjian
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TalkBox {

    private Long id;
    private String userId;
    private String talkId;
    private Integer talkType;
    private Date createTime;
    private Date updateTime;

}
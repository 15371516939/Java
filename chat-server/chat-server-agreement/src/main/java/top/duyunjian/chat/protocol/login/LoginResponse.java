package top.duyunjian.chat.protocol.login;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import top.duyunjian.chat.protocol.friend.Command;
import top.duyunjian.chat.protocol.friend.Packet;
import top.duyunjian.chat.protocol.login.dto.ChatTalkDto;
import top.duyunjian.chat.protocol.login.dto.GroupsDto;
import top.duyunjian.chat.protocol.login.dto.UserFriendDto;

import java.util.ArrayList;
import java.util.List;

/**
 * 登录响应
 *
 * @author duyunjian
 */
@Getter
@Setter
@ToString
public class LoginResponse extends Packet {
    /**
     * 登陆反馈
     */
    private boolean success;
    private String userId;
    private String userHead;
    private String userNickName;
    /**
     * 聊天对话框数据[success is true]
     */
    private List<ChatTalkDto> chatTalkList = new ArrayList<>();
    /**
     * 群组列表
     */
    private List<GroupsDto> groupsList = new ArrayList<>();
    /**
     * 好友列表
     */
    private List<UserFriendDto> userFriendList = new ArrayList<>();

    public LoginResponse() {
    }

    public LoginResponse(boolean success) {
        this.success = success;
    }


    @Override
    public Object getCommand() {
        return Command.LoginResponse;
    }

}





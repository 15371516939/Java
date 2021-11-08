package top.duyunjian.chat.protocol.login;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import top.duyunjian.chat.protocol.friend.Command;
import top.duyunjian.chat.protocol.friend.Packet;

/**
 * 登录请求
 *
 * @author duyunjian
 */
@Getter
@Setter
@ToString
public class LoginRequest extends Packet {

    private String userId;
    private String userPassword;

    public LoginRequest(String userId, String userPassword) {
        this.userId = userId;
        this.userPassword = userPassword;
    }


    @Override
    public Object getCommand() {
        return Command.LoginRequest;
    }

}

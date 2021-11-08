package top.duyunjian.chat.client.application;

import top.duyunjian.chat.ui.view.chat.IChatMethod;
import top.duyunjian.chat.ui.view.login.ILoginMethod;

/**
 * 网络服务
 *
 * @author duyunjian
 */
public class UIService {


    private ILoginMethod login;
    private IChatMethod chat;

    public ILoginMethod getLogin() {
        return login;
    }

    public void setLogin(ILoginMethod login) {
        this.login = login;
    }

    public IChatMethod getChat() {
        return chat;
    }

    public void setChat(IChatMethod chat) {
        this.chat = chat;
    }
}

package top.mqxu.chat.ui.view.login;

/**
 * @author duyunjian
 */
public interface ILoginEvent {

    /**
     * 登陆验证
     * @param userId        用户 ID
     * @param userPassword  用户密码
     */
    void doLoginCheck(String userId, String userPassword);

}
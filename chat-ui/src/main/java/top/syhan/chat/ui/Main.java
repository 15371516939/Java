package top.syhan.chat.ui;

import javafx.application.Application;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import top.syhan.chat.ui.view.chat.ChatController;
import top.syhan.chat.ui.view.chat.IChatEvent;
import top.syhan.chat.ui.view.chat.IChatMethod;
import top.syhan.chat.ui.view.login.ILoginMethod;
import top.syhan.chat.ui.view.login.LoginController;

import java.io.IOException;
import java.util.Date;

/**
 * @program: chat-ui
 * @description:
 * @author: SYH
 * @Create: 2021-10-21 23:44
 **/
public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        //ILoginMethod login = new LoginController((userId, userPassword, loginController) -> {
            //if ("180".equals(userId) && "123".equals(userPassword)) {
            //    loginController.doLoginSuccess();
                IChatMethod chat = new ChatController(new IChatEvent() {
                    @Override
                    public void doQuit() {

                    }

                    @Override
                    public void doSendMsg(String userId, String talkId, Integer talkType, String msg, Date msgDate) {

                    }

                    @Override
                    public void doEventAddTalkUser(String userId, String userFriendId) {

                    }

                    @Override
                    public void doEventAddTalkGroup(String userId, String groupId) {

                    }

                    @Override
                    public void doEventDelTalkUser(String userId, String talkId) {

                    }

                    @Override
                    public void addFriendNew(String userId, ListView<Pane> listView) {

                    }

                    @Override
                    public void doFriendNewSearch(String userId, String text) {

                    }

                    @Override
                    public void doEventAddNewUser(String userId, String friendId) {

                    }
                });
                chat.doShow();
                chat.setUserInfo("1000001", "duyunjian", "https://obohe.com/i/2021/10/28/nh12xv.jpg");

                // 好友 - 对话框
                chat.addTalkBox(-1, 0, "1000001", "李伟立", "https://obohe.com/i/2021/10/28/ne5hhj.jpg", "", new Date(), false);
                chat.addTalkMsgRight("1000001", "你是谁?", new Date(), true, true, false);
                chat.addTalkMsgUserLeft("1000001", "我是东山的小乌龟", new Date(), true, false, true);

                chat.addTalkBox(-1, 0, "1000002", "孙周", "https://obohe.com/i/2021/10/28/ne5tbz.jpg", "", new Date(), false);
                chat.addTalkMsgRight("1000002", "你是谁?", new Date(), true, false, false);
                chat.addTalkMsgUserLeft("1000002", "我是西山的小乌龟", new Date(), true, true, true);
//                chat.addTalkMsgUserLeft("1000002", "你所了解的网络往往也是冰山一角", new Date(), true, false, true);

                chat.addTalkBox(-1, 0, "1000003", "刘一飞", "https://obohe.com/i/2021/10/28/ne5ukx.jpg", "", new Date(), false);
                chat.addTalkMsgRight("1000003", "你是谁?", new Date(), true, false, false);
                chat.addTalkMsgUserLeft("1000003", "我是练习时长7年半的街舞老师", new Date(), true, false, true);
//                chat.addTalkMsgUserLeft("1000003", "自傲，清高，闷骚，也属于这个群体鲜明标签。", new Date(), true, true, true);

                chat.addTalkBox(-1, 0, "1000004", "赵源", "https://obohe.com/i/2021/10/28/ne5pt8.jpg", "", new Date(), false);
                chat.addTalkMsgRight("1000004", "How are you?", new Date(), true, false, false);
                chat.addTalkMsgUserLeft("1000004", "hello", new Date(), true, true, true);
//                chat.addTalkMsgUserLeft("1000004", "唯一不变的，是人与人之间的江湖", new Date(), true, false, true);


                chat.addTalkBox(-1, 0, "1000005", "杜运健", "https://obohe.com/i/2021/10/28/ne5qwt.jpg", "", new Date(), false);
                chat.addTalkMsgRight("1000005", "我是你自己?", new Date(), true, false, false);
                chat.addTalkMsgUserLeft("1000005", "我们是五号床", new Date(), true, true, true);
//                chat.addTalkMsgUserLeft("1000005", "唯一不变的，是人与人之间的江湖", new Date(), true, false, true);

                chat.addTalkBox(-1, 0, "1000007", "陶然然", "https://t.ly/HEjv", "", new Date(), false);
                chat.addTalkMsgRight("1000007", "许老师好", new Date(), true, false, false);
                chat.addTalkMsgUserLeft("1000007", "Nice to meet you", new Date(), true, true, true);

                chat.addTalkBox(-1, 0, "1000006", "梁吴俊", "https://obohe.com/i/2021/10/28/ne5ulw.png", "", new Date(), false);
                chat.addTalkMsgRight("1000006", "操场跑步去", new Date(), true, false, false);
                chat.addTalkMsgUserLeft("1000006", "冲冲冲", new Date(), true, true, true);
//                chat.addTalkMsgUserLeft("1000006", "唯一不变的，是人与人之间的江湖", new Date(), true, false, true);
                // 群组 - 对话框
                chat.addTalkBox(0, 1, "5307397", "筠竹苑307", "https://obohe.com/i/2021/10/28/ne5sk4.png", "", new Date(), true);
                chat.addTalkMsgRight("5307397", "307班", new Date(), true, true, false);
                chat.addTalkMsgGroupLeft("5307397", "1000002", "副班长-孙周", "https://obohe.com/i/2021/10/28/ne5tbz.jpg", "我是正班长", new Date(), true, false, true);
                chat.addTalkMsgGroupLeft("5307397", "1000006", "班长-赵源", "https://obohe.com/i/2021/10/28/ne5pt8.jpg", "我才是", new Date(), true, false, true);

                // 好友
                chat.addFriendUser(false,"1000001", "陶然然", "https://t.ly/HEjv");
                chat.addFriendUser(false, "1000002", "孙周", "https://obohe.com/i/2021/10/28/ne5tbz.jpg");
                chat.addFriendUser(false, "1000003", "赵源", "https://obohe.com/i/2021/10/28/ne5pt8.jpg");

            }

    public static void main(String[] args) {
        launch(args);
    }
        //    else {
        //        loginController.doLoginError();
        //    }
        //});
        //login.doShow();
    }



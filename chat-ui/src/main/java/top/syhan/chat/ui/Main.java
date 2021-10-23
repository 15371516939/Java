package top.syhan.chat.ui;

import javafx.application.Application;
import javafx.stage.Stage;
import top.syhan.chat.ui.view.chat.ChatController;
import top.syhan.chat.ui.view.chat.IChatMethod;
import top.syhan.chat.ui.view.login.ILoginMethod;
import top.syhan.chat.ui.view.login.LoginController;

import java.io.IOException;
import java.util.Date;

/**
 * @program: chat-ui
 * @description:
 * @author: duyunjian
 * @Create: 2021-10-21 23:44
 **/
//public class Main extends Application {
//    //@Override
//    //public void start(Stage stage) throws IOException {
//    //    IChatMethod chat = new ChatController();
//    //    chat.doShow();
//    //}
//    //
//    //public static void main(String[] args) {
//    //    launch(args);
//    //}
//    public class Main extends Application {
//
//        @Override
//        public void start(Stage stage) throws IOException {
//            ILoginMethod login = new LoginController((userId, userPassword) -> {
//                System.out.println("登陆 userId：" + userId + "userPassword：" + userPassword);
//            });
//
//            login.doShow();
//        }
//
//        public static void main(String[] args) {
//            launch(args);
//        }
//    }

//    @Override
//    public void start(Stage stage) throws IOException {
//        ILoginMethod login = new LoginController((userId, userPassword) -> {
//            System.out.println("登陆 userId：" + userId + "userPassword：" + userPassword);
//        });
//
//        login.doShow();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view/login/login.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 540, 420);
//        stage.setTitle("Login");
//        stage.setScene(scene);
//        stage.initStyle(StageStyle.TRANSPARENT);
//        stage.show();
//    }
//
//    public static void main(String[] args) {
//        launch();
//    }
//
//}
public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view/login/login.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 540, 420);
        //stage.setTitle("Login");
        //stage.setScene(scene);
        //stage.initStyle(StageStyle.TRANSPARENT);
        //stage.show();


        ILoginMethod login = new LoginController((userId, userPassword) -> {
            System.out.println("登陆 userId：" + userId + "userPassword：" + userPassword);
        });

        IChatMethod chat = new ChatController();
        chat.doShow();
        // 填充对话框测试数据
        chat.addTalkBox(-1, 0, "1000001", "杜运健", "https://obohe.com/i/2021/10/24/j9yeu.png", "傻蛋不傻", new Date(), true);
        chat.addTalkBox(-1, 0, "1000002", "杨阳", "https://obohe.com/i/2021/10/24/j9vgd.jpg", "这世界只有10种人，一种是程序员，一种不是。", new Date(), false);
        chat.addTalkBox(-1, 0, "1000003", "尚宇驰", "https://obohe.com/i/2021/10/24/ja0en.png", "PuTTY本无树，MinGW亦非台。", new Date(), false);
        chat.addTalkBox(-1, 0, "1000004", "陈蓉琪", "https://obohe.com/i/2021/10/24/j9vsa.jpg", "Write the code. Change the world.", new Date(), false);
        chat.addTalkBox(-1, 0, "1000005", "王林", "https://obohe.com/i/2021/10/24/k9vcl.jpg", "生产队的驴", new Date(), false);
        chat.addTalkBox(0, 1, "5307397", "ssy松山院", "https://obohe.com/i/2021/10/24/k9w1d.png", "松山院~学习之路", new Date(), false);
    }


}
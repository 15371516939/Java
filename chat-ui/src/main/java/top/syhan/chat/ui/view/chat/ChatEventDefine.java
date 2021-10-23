package top.syhan.chat.ui.view.chat;


import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

/**
 * 窗体事件定义
 *
 * @author mqxu
 */
public class ChatEventDefine {

    private final ChatInit chatInit;

    public ChatEventDefine(ChatInit chatInit) {
        this.chatInit = chatInit;
        chatInit.move();
        this.barChat();
        this.barFriend();
        this.barLocation();
        this.barSet();
    }

    private void barSet() {
    }

    private void switchBarChat(Button barChat, Pane groupBarChat, boolean toggle) {
        if (toggle) {
            groupBarChat.setVisible(true);
            barChat.getGraphic().setStyle("-fx-icon-color:'#9E99EE'");
        } else {
            groupBarChat.setVisible(false);
            barChat.getGraphic().setStyle("-fx-icon-color:'#6F6F70'");
        }
    }

    private void switchBarFriend(Button barFriend, Pane groupBarFriend, boolean toggle) {
        if (toggle) {
            groupBarFriend.setVisible(true);
            barFriend.getGraphic().setStyle("-fx-icon-color:'#9E99EE'");
        } else {
            groupBarFriend.setVisible(false);
            barFriend.getGraphic().setStyle("-fx-icon-color:'#6F6F70'");

        }
    }

    private void switchBarLocation(Button barLocation, Pane groupBarLocation, boolean toggle) {
        if (toggle) {
            groupBarLocation.setVisible(true);
            barLocation.getGraphic().setStyle("-fx-icon-color:'#9E99EE'");
        } else {
            groupBarLocation.setVisible(false);
            barLocation.getGraphic().setStyle("-fx-icon-color:'#6F6F70'");
        }
    }


    private void barChat() {
        Button barChat = chatInit.$("barChat", Button.class);
        Pane groupBarChat = chatInit.$("groupBarChat", Pane.class);
        barChat.setOnAction(event -> {
            switchBarChat(barChat, groupBarChat, true);
            switchBarFriend(chatInit.$("barFriend", Button.class), chatInit.$("groupBarFriend", Pane.class), false);
            switchBarLocation(chatInit.$("barLocation", Button.class), chatInit.$("groupBarLocation", Pane.class), false);
        });

        barChat.setOnMouseEntered(event -> {
            boolean visible = groupBarChat.isVisible();
            if (visible) {
                return;
            }
            barChat.getGraphic().setStyle("-fx-icon-color:'#F6F6F6'");
        });
        barChat.setOnMouseExited(event -> {
            boolean visible = groupBarChat.isVisible();
            if (visible) {
                return;
            }
            barChat.getGraphic().setStyle("-fx-icon-color:'#6F6F70'");
        });
    }

    private void barFriend() {
        Button barFriend = chatInit.$("barFriend", Button.class);
        Pane groupBarFriend = chatInit.$("groupBarFriend", Pane.class);
        barFriend.setOnAction(event -> {
                    switchBarChat(chatInit.$("barChat", Button.class), chatInit.$("groupBarChat", Pane.class), false);
                    switchBarFriend(barFriend, groupBarFriend, true);
                    switchBarLocation(chatInit.$("barLocation", Button.class), chatInit.$("groupBarLocation", Pane.class), false);
                }
        );
        barFriend.setOnMouseEntered(event -> {
            boolean visible = groupBarFriend.isVisible();
            if (visible) {
                return;
            }
            barFriend.getGraphic().setStyle("-fx-icon-color:'#F6F6F6'");
        });
        barFriend.setOnMouseExited(event -> {
            boolean visible = groupBarFriend.isVisible();
            if (visible) {
                return;
            }
            barFriend.getGraphic().setStyle("-fx-icon-color:'#6F6F70'");
        });
    }

    private void barLocation() {
        Button barLocation = chatInit.$("barLocation", Button.class);
        Pane groupBarLocation = chatInit.$("groupBarLocation", Pane.class);
        barLocation.setOnAction(event -> {
                    switchBarChat(chatInit.$("barLocation", Button.class), chatInit.$("groupBarLocation", Pane.class), false);
                    switchBarFriend(chatInit.$("barFriend", Button.class), chatInit.$("groupBarFriend", Pane.class), false);
                    switchBarLocation(barLocation, groupBarLocation, true);
                }
        );
        barLocation.setOnMouseEntered(event -> {
            boolean visible = groupBarLocation.isVisible();
            if (visible) {
                return;
            }
            barLocation.getGraphic().setStyle("-fx-icon-color:'#F6F6F6'");
        });
        barLocation.setOnMouseExited(event -> {
            boolean visible = groupBarLocation.isVisible();
            if (visible) {
                return;
            }
            barLocation.getGraphic().setStyle("-fx-icon-color:'#6F6F70'");
        });
    }


}
module top.duyunjian.chatserveragreement {
    requires javafx.controls;
    requires javafx.fxml;

    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;


    opens top.duyunjian.chat to javafx.fxml;
    exports top.duyunjian.chat;
}
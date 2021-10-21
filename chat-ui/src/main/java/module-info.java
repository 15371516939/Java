module top.mqxu.chatui {
    requires javafx.controls;
    requires javafx.fxml;


    opens top.mqxu.chat.ui to javafx.fxml;
    exports top.mqxu.chat.ui;
}
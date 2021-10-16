module io.duyunjian.linechar {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.duyunjian.linechar to javafx.fxml;
    exports io.duyunjian.linechar;
}
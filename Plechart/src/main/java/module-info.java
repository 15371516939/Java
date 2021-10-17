module io.github.duyunjian.plechart {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.github.duyunjian.plechart to javafx.fxml;
    exports io.github.duyunjian.plechart;

    requires com.github.oshi;
    requires fastjson;
}
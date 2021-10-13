module io.duyunjian.weather.weather {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;


    opens io.duyunjian.weather to javafx.fxml;
    exports io.duyunjian.weather;

    opens io.duyunjian.weather.view to javafx.fxml;
    exports io.duyunjian.weather.view;
    exports io.duyunjian.weather.util;

}
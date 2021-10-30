module com.example.control {
    requires javafx.controls;
    requires javafx.fxml;
    requires  javafx.web;


    opens com.example.control to javafx.fxml;
    exports com.example.control;


    exports com.example.control.dyj;
    opens com.example.control.dyj to javafx.fxml;

}
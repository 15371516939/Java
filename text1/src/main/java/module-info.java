module com.example.text1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.text1 to javafx.fxml;
    exports com.example.text1;
    exports com.example.text1.view;
    opens com.example.text1.view to javafx.fxml;
}
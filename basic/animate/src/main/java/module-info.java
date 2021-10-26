module com.example.animate {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.animate to javafx.fxml;
    exports com.example.animate;
}
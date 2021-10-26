module com.example.trayicon {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.trayicon to javafx.fxml;
    exports com.example.trayicon;

    requires java.desktop;
}
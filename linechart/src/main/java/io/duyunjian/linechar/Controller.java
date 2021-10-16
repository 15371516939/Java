package io.duyunjian.linechar;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;
/**
 * @author mqxu
 */
public class Controller implements Initializable {
    private double x = 0, y = 0;
    @FXML
    private LineChart<?, ?> lineChart;
    @FXML
    private AnchorPane sideBar;
    private Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        sideBar.setOnMousePressed(mouseEvent -> {
            x = mouseEvent.getSceneX();
            y = mouseEvent.getSceneY();
        });
        sideBar.setOnMouseDragged(mouseEvent -> {
            stage.setX(mouseEvent.getScreenX() - x);
            stage.setY(mouseEvent.getScreenY() - y);
        });
        lineChart.getXAxis().setLabel("X轴");
        lineChart.getYAxis().setLabel("Y轴");
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data("1", 1.0));
        series1.getData().add(new XYChart.Data("2", 3.0));

        series1.getData().add(new XYChart.Data("3", 4.0));
        XYChart.Series series2 = new XYChart.Series();

        series2.getData().add(new XYChart.Data("3", 4.0));
        series2.getData().add(new XYChart.Data("4", 3.0));

        series2.getData().add(new XYChart.Data("5", 1.0));
        XYChart.Series series3 = new XYChart.Series();
        series3.getData().add(new XYChart.Data("1", 1));
        series3.getData().add(new XYChart.Data("2", 1));
        series3.getData().add(new XYChart.Data("3", 1));
        series3.getData().add(new XYChart.Data("4", 1));
        series3.getData().add(new XYChart.Data("5", 1));
        lineChart.getData().addAll(series1, series2, series3);
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    void closeProgram(ActionEvent event) {
        stage.close();
    }
}


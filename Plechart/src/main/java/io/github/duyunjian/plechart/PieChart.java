package io.github.duyunjian.plechart;

import com.alibaba.fastjson.JSONObject;
import io.github.duyunjian.plechart.utli.SystemInfoUtil;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @description: 饼图
 * @author: duyunjian
 * @date: 2021/10/17
 */
 public class PieChart extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        javafx.scene.chart.PieChart pieChart = new javafx.scene.chart.PieChart();
        pieChart.setData(getChartData());
        pieChart.setTitle("内存");
        pieChart.setLegendSide(Side.LEFT);
        pieChart.setClockwise(false);
        pieChart.setLabelsVisible(false);
        StackPane root = new StackPane();
        root.getChildren().add(pieChart);
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
    }

    private ObservableList<javafx.scene.chart.PieChart.Data> getChartData() {
        JSONObject message = SystemInfoUtil.getInfo();
        System.out.println(message);
        String mem = message.getJSONObject("memInfo").get("usageRate").toString();
        Double memInfo = Double.valueOf(mem.substring(0, mem.length() - 1));
        String jvm = message.getJSONObject("jvmInfo").get("usageRate").toString();
        Double jvmInfo = Double.valueOf(jvm.substring(0, jvm.length() - 1));
        String cpu = message.getJSONObject("cpuInfo").get("cSys").toString();
        Double cpuInfo = Double.valueOf(cpu.substring(0, cpu.length() - 1));
        ObservableList<javafx.scene.chart.PieChart.Data> answer = FXCollections.observableArrayList();
        answer.addAll(new javafx.scene.chart.PieChart.Data("未使用", memInfo),
                new javafx.scene.chart.PieChart.Data("使用", cpuInfo));
        return answer;
    }

    public static void main(String[] args) {
        launch();
    }

}
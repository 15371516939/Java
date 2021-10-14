package com.example.text1.view;

import com.example.text1.MainApp;
import javafx.fxml.FXML;

/**
 * @description
 * @author duyunjian
 * @date 2021/10/11
 */

public class RootController {
    private MainApp mainApp;//传主类

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
    private void handleShowBirthdayStatistics(){
        mainApp.showBirthdayStatistics();//调用主类当中的显示生日统计图面板
    }
}

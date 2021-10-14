package com.example.text1.view;

import com.example.text1.MainApp;
import com.example.text1.config.AppConstant;
import com.example.text1.model.Person;
import com.example.text1.util.DateUtli;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;


public class PersonController {
    private FilteredList<Person> filteredData;

    @FXML
    private TableView<Person> personTable;

    @FXML
    private TableColumn<Person,String>nameColumn;

    @FXML
    private TableColumn<Person,String>clazzColumn;

    @FXML
    private Label nameLabel;

    @FXML
    private Label clazzLabel;

    @FXML
    private Label genderLabel;

    @FXML
    private Label addressLabel;

    @FXML
    private Label birthdayLabel;

    @FXML
    private ImageView avatar;

    private MainApp mainApp;
    private ObservableList<Person> personData;

    @FXML
    private TextField inputField;


    public PersonController(){

    }
    @FXML
    private void initialize(){
        nameColumn.setCellValueFactory(cellData->cellData.getValue().nameProperty());
        clazzColumn.setCellValueFactory(cellData->cellData.getValue().clazzProperty());
        personTable.getSelectionModel().selectedItemProperty().addListener(
                (Observable,oldValue,newValue)->showPersonDatails(newValue));
    }

    //public void setMainApp(MainApp mainApp){
    //    this.mainApp = mainApp;
    //    ObservableList<Person>personData = mainApp.getPersonData();
    //    personTable.setItems(personData);
    //}
    private void showPersonDatails(Person person){
        if(person !=null) {
            nameLabel.setText(person.getName());
            clazzLabel.setText(person.getClazz());
            genderLabel.setText(person.getGender());
            addressLabel.setText(person.getAddress());
            birthdayLabel.setText(DateUtli.format(person.getBirthday()));
            avatar.setImage(person.getAvatar());
        }else{
            nameLabel.setText("");
            clazzLabel.setText("");
            genderLabel.setText("");
            addressLabel.setText("");
            birthdayLabel.setText("");
            avatar.setImage(new Image("https://obohe.com/i/2021/10/08/12qezsc.jpg"));


        }
    }

    /**
     * 接收主窗体对象，获取数据
     * @param mainApp mainApp
     */
    public void setMainApp(MainApp mainApp){
        this.mainApp = mainApp;
        filteredData = new FilteredList<>(mainApp.getPersonData(), p ->true);
        inputField.textProperty().addListener((observable,oldValue,newValue) ->filteredData.setPredicate(person -> {
            if (newValue == null || newValue.isEmpty()){
            return true;
            }
            String lowerCaseFilter = newValue.toLowerCase();
            return person.getName().toLowerCase().contains(lowerCaseFilter)
            || person.getClazz().toLowerCase().contains(lowerCaseFilter)
            || person.getAddress().toLowerCase().contains(lowerCaseFilter);

        }));
        personTable.setItems(filteredData);
        showPersonDatails(personData.get(0));
        personTable.getSelectionModel().select(0);
    }

    /**
     * 查询用户
     */
    public void handleSearchPerson(){
        String keywords = inputField.getText().trim();
        ObservableList<Person> items = personTable.getItems();
        List<Person> list = items.stream()
                .filter(p -> p.getName().contains(keywords) || p.getClazz().contains(keywords))
                .collect(Collectors.toList());
        if(list.size() != 0){
            personTable.setItems(FXCollections.observableList(list));
            showPersonDatails(list.get(0));
        }
        inputField.setText("");
    }

    /**
     * 重置
     */
    public void handleResetPerson(){
        personData = mainApp.getPersonData();
        personTable.setItems(personData);
        showPersonDatails(personData.get(0));
    }



    /**
     * 显示用户详情
     *
     * @param
     */
    private void showPersonDetails(Person person) {
        if (person != null) {
            nameLabel.setText(person.getName());
            genderLabel.setText(person.getGender());
            addressLabel.setText(person.getAddress());
            birthdayLabel.setText(DateUtli.format(person.getBirthday()));
            avatar.setImage(person.getAvatar());
        } else {
            nameLabel.setText("姓名");
            genderLabel.setText("性别");
            addressLabel.setText("地址");
            birthdayLabel.setText("生日");
            avatar.setImage(new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/avatar/me.jpg"));
        }
    }
    /**
     * 删除用户
     */
    public void handleDeletePerson() {
        int selectedIndex = personTable.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            mainApp.getPersonData().remove(selectedIndex);
        } else {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("提示");
            a.setHeaderText("错误操作");
            a.setContentText("必须选择人员才能删除");
            a.showAndWait();
        }
    }

    /**
     * 新增人员
     */

    public void handleNewPerson() {
        Person temPerson = new Person("杜运健", "软件", "男", "江苏连云港", LocalDate.of(2000,02,14),
        new Image("https://obohe.com/i/2021/10/11/yqjr8p.jpg"));
        mainApp.showEditPerson(temPerson, AppConstant.NEW_PERSON);
    }
    /**
     * 编辑人员
     */
    public void handleEditPerson(){
        Person selectedPerson = personTable.getSelectionModel().getSelectedItem();
        if(selectedPerson != null) {
            mainApp.showEditPerson(selectedPerson, AppConstant.EDIT_PERSON);
        }else {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("提示");
            a.setHeaderText("错误操作");
            a.setContentText("必须选择人员才能编辑");
            a.showAndWait();
        }

        }

}
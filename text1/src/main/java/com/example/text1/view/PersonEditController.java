package com.example.text1.view;

import com.example.text1.MainApp;
import com.example.text1.config.AppConstant;
import com.example.text1.model.Person;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;


/**
 * @description:
 * @author: duyunjian
 * @date: 2021/10/10
 */


public class PersonEditController {

    private MainApp mainApp;
    private String type;
    private Person person;


    @FXML
    private TextField nameField;

    @FXML
    private TextField clazzField;

    @FXML
    private ToggleGroup group;

    @FXML
    private TextField addressField;

    @FXML
    private DatePicker birthdayPicker;

    @FXML
    private TextField avatarField;

    @FXML
    private void initialize() {
        person = new Person();
        group.selectedToggleProperty().addListener((ob, oldValue, newValue) -> {
            RadioButton radioButton = (RadioButton) group.getSelectedToggle();
            if (radioButton != null) {
                person.setGender(radioButton.getText());
            }
        });
    }


    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    public void setArgs(Person person, String type) {
        this.person = person;
        this.type = type;
        nameField.setText(person.getName());
        clazzField.setText(person.getClazz());
        group.getToggles().forEach(toggle -> {
            if (toggle.getUserData().toString().equals(person.getGender())) {
                toggle.setSelected(true);
            }
        });
        addressField.setText(person.getAddress());
        avatarField.setText(person.getAvatar().getUrl());
        birthdayPicker.setValue(person.getBirthday());
    }


    public void handleSubmit() {
        Person person = new Person();
        person.setName(nameField.getText());
        person.setClazz(clazzField.getText());
        person.setAddress(addressField.getText());
        person.setAvatar(new Image(avatarField.getText()));
        person.setBirthday(birthdayPicker.getValue());
        if (this.type.equals(AppConstant.NEW_PERSON)) {
            mainApp.getPersonData().add(person);
        }
        mainApp.showPerson();
    }

    public void handleCancel() {

        mainApp.showPerson();
    }
}
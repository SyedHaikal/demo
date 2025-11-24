package com.example.demo;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class ViewTaskController  {

    @FXML
    private TableView<ToDo> table;

    @FXML
    private TableColumn<ToDo, String> titlecolumn;

    @FXML
    private TableColumn<ToDo, String> descriptioncolumn;

    @FXML
    private TableColumn<ToDo, LocalDate> duedatecolumn;

    @FXML
    private TableColumn<ToDo, String> categorycolumn;

    @FXML
    private TableColumn<ToDo, Integer> prioritycolumn;



}

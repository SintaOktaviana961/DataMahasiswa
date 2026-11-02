/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Thinkpad
 */
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Mahasiswa;

public class DashboardController {
    @FXML private TextField txtNama, txtNim, txtEmail;
    @FXML private TableView<Mahasiswa> tableMahasiswa;
    @FXML private TableColumn<Mahasiswa, String> colNama, colNim, colEmail;

    private final ObservableList<Mahasiswa> data = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        colNama.setCellValueFactory(new PropertyValueFactory<>("nama"));
        colNim.setCellValueFactory(new PropertyValueFactory<>("nim"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        tableMahasiswa.setItems(data);
    }

    @FXML
    private void handleAdd() {
        data.add(new Mahasiswa(txtNama.getText(), txtNim.getText(), txtEmail.getText()));
        txtNama.clear();
        txtNim.clear();
        txtEmail.clear();
    }

    @FXML
    private void handleDelete() {
        Mahasiswa m = tableMahasiswa.getSelectionModel().getSelectedItem();
        if (m != null) data.remove(m);
    }
}

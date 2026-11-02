package controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thinkpad
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class KalkulatorController {
    @FXML private TextField txtAngka1, txtAngka2;
    @FXML private Label lblHasil;

    @FXML private void handleTambah(ActionEvent event) { hitung('+'); }
    @FXML private void handleKurang(ActionEvent event) { hitung('-'); }
    @FXML private void handleKali(ActionEvent event) { hitung('*'); }
    @FXML private void handleBagi(ActionEvent event) { hitung('/'); }

    @FXML
    private void handleReset(ActionEvent event) {
        txtAngka1.clear();
        txtAngka2.clear();
        lblHasil.setText("0");
    }

    private void hitung(char operator) {
        try {
            double a = Double.parseDouble(txtAngka1.getText());
            double b = Double.parseDouble(txtAngka2.getText());
            double hasil;
            switch (operator) {
                case '+': hasil = a + b; break;
                case '-': hasil = a - b; break;
                case '*': hasil = a * b; break;
                default:
                    if (b == 0) {
                        tampilPesan("Tidak bisa membagi dengan nol!");
                        return;
                    }
                    hasil = a / b;
            }
            if (hasil == Math.floor(hasil)) {
                lblHasil.setText(String.valueOf((long) hasil));
            } else {
                lblHasil.setText(String.valueOf(hasil));
            }
        } catch (NumberFormatException e) {
            tampilPesan("Masukkan angka yang valid!");
        }
    }

    private void tampilPesan(String pesan) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Peringatan");
        alert.setContentText(pesan);
        alert.show();
    }
}
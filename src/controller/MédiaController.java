package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import main.Main;

import java.io.IOException;

public class MédiaController {

    @FXML
    private TextField nomeField;
    @FXML
    private TextField nota1;
    @FXML
    private TextField nota2;
    @FXML
    private TextField nota3;
    @FXML
    private TextField nota4;
    @FXML
    private TextField média;
    @FXML
    private TextField situação;

    public void realizarOperação(){
        double valor1, valor2, valor3, valor4 , media;
        valor1 = Double.parseDouble(nota1.getText()); //O valor1 pegou o primeiro textField
        valor2 = Double.parseDouble(nota2.getText()); //O valor2 pegou o segundo textField
        valor3 = Double.parseDouble(nota3.getText()); //O valor3 pegou o terceiro textField
        valor4 = Double.parseDouble(nota4.getText()); //O valor3 pegou o terceiro textField

        media = (valor1 + valor2 + valor3 + valor4) / 4; //A variável "media" é encarregada por realizar a operação
        média.setText(String.valueOf(media)); //E o textField4 simplesmente mostra os valores.

        }

    public void bak() throws IOException {
        Parent root = FXMLLoader.load(Main.class.getResource("/pages/Home.fxml"));
        Main.stage.setScene(new Scene(root));
    }

}

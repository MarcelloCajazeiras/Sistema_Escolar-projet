package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import main.Main;
import models.Wood;

import java.io.IOException;

public class AlunosCadastradosController {

    @FXML
    private VBox vBox;


    public void initialize(){

        for (Wood wood : Main.woodList) {
            vBox.getChildren().add(new Label("ALUNO CADASTRADO"));
            vBox.getChildren().add(new Label("Nome: " + wood.getNome()));
            vBox.getChildren().add(new Label("Endereço: "+ wood.getEndereço()));
            vBox.getChildren().add(new Label("CEP: "+ wood.getCep()));
            vBox.getChildren().add(new Label("Complemento: " + wood.getComplemento()));
            vBox.getChildren().add(new Label("Nascimento: " + wood.getNascimento()));
            vBox.getChildren().add(new Label("Email: " + wood.getEmail()));
            vBox.getChildren().add(new Label("Número: " + wood.getNumero()));
            vBox.getChildren().add(new Label("Cidade: "+ wood.getCidade()));
            vBox.getChildren().add(new Label("Estado: " + wood.getEstado()));

        }

    }

    public void back() throws IOException {
        Parent root = FXMLLoader.load(Main.class.getResource("/pages/Home.fxml"));
        Main.stage.setScene(new Scene(root));
    }

}

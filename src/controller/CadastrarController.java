package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import main.Main;
import models.Wood;

import java.io.IOException;

public class CadastrarController {

    @FXML
    private TextField nomeField;
    @FXML
    private TextField endereçoField;
    @FXML
    private TextField cepField;
    @FXML
    private TextField complementoField;
    @FXML
    private TextField nascimentoField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField numeroField;
    @FXML
    private TextField cidadeField;
    @FXML
    private TextField estadoField;


    public void voltar() throws IOException {
        Parent root = FXMLLoader.load(Main.class.getResource("/pages/Home.fxml"));
        Main.stage.setScene(new Scene(root));
    }

    public void salvar() {
        String nome = nomeField.getText();
        String endereço = endereçoField.getText();
        String cep = cepField.getText();
        String complemento = complementoField.getText();
        String nascimento = nascimentoField.getText();
        String email = emailField.getText();
        String numero = numeroField.getText();
        String cidade = cidadeField.getText();
        String estado = estadoField.getText();

        Wood wood = new Wood(nome,endereço,cep,complemento,nascimento,email,numero,cidade,estado);

        Main.woodList.add(wood);

        nomeField.clear();
        endereçoField.clear();
        cepField.clear();
        complementoField.clear();
        nascimentoField.clear();
        emailField.clear();
        numeroField.clear();
        cidadeField.clear();
        estadoField.clear();
    }}

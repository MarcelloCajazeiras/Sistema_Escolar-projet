package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import main.Main;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Paths;

public class LoginController {

    @FXML
    private TextField login;

    @FXML
    private TextField senha;

    @FXML
    public void home() throws IOException {
        if (login.getText().equals("MARCELLO")&&(senha.getText().equals("123")) ){
            Parent home = FXMLLoader.load(Main.class.getResource("/pages/Home.fxml"));
            Main.stage.setScene(new Scene(home));
        }
        else{
            JOptionPane.showMessageDialog(null,"Usuário ou senha estão incorreta(s)");
        }
    }


    @FXML
    private ImageView imageView;



    public void initialize() {
        imageView.setImage(new Image(Paths.get("src/imagens/NO.1.png").toUri().toString()));
    }


    public void Home() throws IOException {
        Parent root = FXMLLoader.load(Main.class.getResource("/pages/Login.fxml"));
        Main.stage.setScene(new Scene(root));

    }

    public void Entrar() throws IOException {
        Parent root = FXMLLoader.load(Main.class.getResource("/pages/Home.fxml"));
        Main.stage.setScene(new Scene(root));

}

}
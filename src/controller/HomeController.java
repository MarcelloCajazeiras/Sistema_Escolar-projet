package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import main.Main;

import java.io.IOException;
import java.nio.file.Paths;

public class HomeController {


    @FXML
    private ImageView imageView;

    @FXML
    private ImageView imagem;


    public void initialize() {
        imageView.setImage(new Image(Paths.get("src/imagens/oo.png").toUri().toString()));
        imagem.setImage(new Image(Paths.get("src/imagens/3.png").toUri().toString()));

    }

    public void cadastrarAluno() throws IOException {
        Parent root = FXMLLoader.load(Main.class.getResource("/pages/Cadastrar.fxml"));
        Main.stage.setScene(new Scene(root));
    }

    public void alunoCadastrado() throws IOException {
        Parent root = FXMLLoader.load(Main.class.getResource("/pages/AlunosCadastrados.fxml"));
        Main.stage.setScene(new Scene(root));

    }

    public void volta() throws IOException {
        Parent root = FXMLLoader.load(Main.class.getResource("/pages/Login.fxml"));
        Main.stage.setScene(new Scene(root));
    }

    public void irparamédia() throws IOException {
        Parent root = FXMLLoader.load(Main.class.getResource("/pages/Média.fxml"));
        Main.stage.setScene(new Scene(root));
    }

    public void informações() throws IOException {
        Parent root = FXMLLoader.load(Main.class.getResource("/pages/Informações.fxml"));
        Main.stage.setScene(new Scene(root));
    }
}

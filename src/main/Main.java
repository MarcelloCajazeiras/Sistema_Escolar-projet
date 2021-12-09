package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import models.Wood;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    public static Stage stage;
    public static List<Wood> woodList = new ArrayList<>();

    public static void main(String[] args) {launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Main.stage = stage;
        Parent root = FXMLLoader.load(Main.class.getResource("/pages/Login.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("Sistema Escolar (CEE+)");

        stage.show();
    }

}

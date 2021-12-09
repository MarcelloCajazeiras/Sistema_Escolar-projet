package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import main.Main;

import java.io.IOException;

public class InformaçõesController {


    public void voltarr() throws IOException {
        Parent root = FXMLLoader.load(Main.class.getResource("/pages/Home.fxml"));
        Main.stage.setScene(new Scene(root));
    }
}

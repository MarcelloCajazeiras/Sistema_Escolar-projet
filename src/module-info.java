module my.project {
    requires java.desktop;
    requires javafx.fxml;
    requires javafx.controls;
    opens main;
    opens controller;
}
module borab.jfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens borab.jfx to javafx.fxml;
    exports borab.jfx;
}
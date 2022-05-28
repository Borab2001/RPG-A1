module borab.jfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens borab.jfx to javafx.fxml;
    exports borab.jfx;
}
module sample.javajdb {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.javajdb to javafx.fxml;
    exports sample.javajdb;
}
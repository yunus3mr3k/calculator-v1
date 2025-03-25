module com.example.calculator_v1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculator_v1 to javafx.fxml;
    exports com.example.calculator_v1;
}
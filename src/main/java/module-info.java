module com.example.cartes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cartes to javafx.fxml;
    exports com.example.cartes;
}
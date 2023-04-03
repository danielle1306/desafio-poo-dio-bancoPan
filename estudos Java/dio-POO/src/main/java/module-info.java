module com.desafio.diopoo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.desafio.diopoo to javafx.fxml;
    exports com.desafio.diopoo;
}
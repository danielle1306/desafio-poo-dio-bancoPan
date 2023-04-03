module com.banco.exercicio {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.banco.exercicio to javafx.fxml;
    exports com.banco.exercicio;
    exports com.banco.exercicio.application;
    opens com.banco.exercicio.application to javafx.fxml;
}
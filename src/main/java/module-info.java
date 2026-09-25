module com.example.Muttakin_2207061_GPA_Calculator {
    requires java.sql;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.example.Muttakin_2207061_GPA_Calculator to javafx.fxml;
    exports com.example.Muttakin_2207061_GPA_Calculator;
}
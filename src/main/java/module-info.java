module com.example.drawrect {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.drawrect to javafx.fxml;
    exports com.example.drawrect;
}
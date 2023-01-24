module com.tlaw.javafxcss {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.tlaw.javafxcss to javafx.fxml;
    exports com.tlaw.javafxcss;
}
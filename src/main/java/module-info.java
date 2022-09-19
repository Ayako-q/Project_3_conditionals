module com.example.project_3_conditionals {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.project_3_conditionals to javafx.fxml;
    exports com.example.project_3_conditionals;
}
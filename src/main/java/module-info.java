module com.alpcashierin.cashierin {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.alpcashierin.cashierin to javafx.fxml;
//    exports com.alpcashierin.cashierin.controller;
    exports com.alpcashierin.cashierin;

}
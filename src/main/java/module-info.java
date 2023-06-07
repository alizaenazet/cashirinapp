module com.alpcashierin.cashierin {
    requires javafx.controls;
    requires javafx.fxml;
    requires retrofit2;
    requires retrofit2.converter.gson;

    requires  java.sql;
    requires gson;

    opens com.alpcashierin.cashierin to javafx.fxml;
    opens com.alpcashierin.apiCalls.pojosModel.productResponse to gson;

    exports com.alpcashierin.apiCalls.pojosModel.productResponse;
    //    exports com.alpcashierin.cashierin.controller;
    exports com.alpcashierin.cashierin;

}
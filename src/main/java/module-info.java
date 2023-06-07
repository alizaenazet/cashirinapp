module com.alpcashierin.cashierin {
    requires javafx.controls;
    requires javafx.fxml;
    requires retrofit2;
    requires retrofit2.converter.gson;
    requires  java.sql;
    requires gson;
    requires okhttp3;
    opens com.alpcashierin.cashierin to javafx.fxml;

    exports com.alpcashierin.cashierin;
    exports com.alpcashierin.apiCalls.pojosModel.productResponse.getProduct;
    opens com.alpcashierin.apiCalls.pojosModel.productResponse.getProduct to gson;

}
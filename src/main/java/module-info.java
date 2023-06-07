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
    opens com.alpcashierin.apiCalls.pojosModel.productResponse.getProducts to gson;
    opens com.alpcashierin.apiCalls.pojosModel.productResponse.CreateProductResp to gson;
    opens com.alpcashierin.apiCalls.pojosModel.productResponse.getProduct to gson;
    opens com.alpcashierin.apiCalls.pojosModel.productResponse.editProductResp to gson;
    opens com.alpcashierin.apiCalls.pojosModel.productResponse.editMerchant to gson;
    opens com.alpcashierin.apiCalls.pojosModel.productResponse.loginMerchant to gson;
    opens com.alpcashierin.apiCalls.pojosModel.categoryResponse.getCategory to gson;
    opens com.alpcashierin.apiCalls.pojosModel.categoryResponse.createCategory to gson;
}
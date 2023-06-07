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
    exports com.alpcashierin.apiCalls.pojosModel.getProduct;
    opens com.alpcashierin.apiCalls.pojosModel.getProducts to gson;
    opens com.alpcashierin.apiCalls.pojosModel.productResponse.CreateProductResp to gson;
    opens com.alpcashierin.apiCalls.pojosModel.getProduct to gson;
    opens com.alpcashierin.apiCalls.pojosModel.editProductResp to gson;
    opens com.alpcashierin.apiCalls.pojosModel.editMerchant to gson;
    opens com.alpcashierin.apiCalls.pojosModel.loginMerchant to gson;
    opens com.alpcashierin.apiCalls.pojosModel.loginUserAccount to gson;
    opens com.alpcashierin.apiCalls.pojosModel.registerUserAccount to gson;
    opens com.alpcashierin.apiCalls.pojosModel.editUserAccount to gson;
    opens com.alpcashierin.apiCalls.pojosModel.getUserAccount to gson;
    opens com.alpcashierin.apiCalls.pojosModel.loginAdminAccount to gson;
    opens com.alpcashierin.apiCalls.pojosModel.registerAdminAccount to gson;
    opens com.alpcashierin.apiCalls.pojosModel.editAdminAccount to gson;
    opens com.alpcashierin.apiCalls.pojosModel.getAdminAccount to gson;
    opens com.alpcashierin.apiCalls.pojosModel.registerOwnerAccount to gson;
    opens com.alpcashierin.apiCalls.pojosModel.categoryResponse.getCategory to gson;
    opens com.alpcashierin.apiCalls.pojosModel.categoryResponse.createCategory to gson;
    opens com.alpcashierin.apiCalls.pojosModel.orderResponse.getOrder to gson;

}
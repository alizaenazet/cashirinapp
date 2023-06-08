package com.alpcashierin.cashierin;

import com.alpcashierin.cashierin.repository.*;
import com.alpcashierin.cashierin.service.*;
import com.alpcashierin.cashierin.utilities.ServiceLocator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        AccountRepository accountRepository = new AccountRepositoryImpl();
        ServiceLocator.getInstance().registerService(AccountRepository.class,accountRepository);
        AccountService accountService = new AccountServiceImpl();
        ServiceLocator.getInstance().registerService(AccountService.class,accountService);
        CategoryRepository categoryRepository = new CategoryRepositoryImpl();
        ServiceLocator.getInstance().registerService(CategoryRepository.class,categoryRepository);
        CategoryService categoryService = new CategoryServiceImpl();
        ServiceLocator.getInstance().registerService(CategoryService.class,categoryService);
        MerchantRepository merchantRepository = new MerchantRepositoryImpl();
        ServiceLocator.getInstance().registerService(MerchantRepository.class,merchantRepository);
        MerchantService merchantService = new MerchantServiceImpl();
        ServiceLocator.getInstance().registerService(MerchantService.class,merchantService);
        OrderRepository orderRepository = new OrderRepositoryImpl();
        ServiceLocator.getInstance().registerService(OrderRepository.class,orderRepository);
        OrderService orderService = new OrderServiceIml();
        ServiceLocator.getInstance().registerService(OrderService.class,orderService);
        ProductRepository productRepository = new ProductRepositoryImpl();
        ServiceLocator.getInstance().registerService(ProductRepository.class,productRepository);
        ProductService productService = new ProductServiceImpl();
        ServiceLocator.getInstance().registerService(ProductService.class,productService);
        TransactionRepository transactionRepository = new TransactionRepositoryImpl();
        ServiceLocator.getInstance().registerService(TransactionRepository.class,transactionRepository);
        TransactionService transactionService = new TransactionServiceImpl();
        ServiceLocator.getInstance().registerService(TransactionService.class,transactionService);

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("welcome-page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1200, 800);
        stage.setTitle("Cashirin App😎!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
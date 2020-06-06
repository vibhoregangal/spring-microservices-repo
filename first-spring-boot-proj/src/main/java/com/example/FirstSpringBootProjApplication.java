package com.example;

import com.example.dao.ProductDAO;
import com.example.model.Product;
import com.example.model.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringBootProjApplication implements CommandLineRunner
{

    private ProductDAO productDAO;

    @Autowired
    public FirstSpringBootProjApplication(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public static void main(String[] args) {

        SpringApplication.run(FirstSpringBootProjApplication.class, args);
    }

    public void run(String... args) throws Exception {

        Product product1=new Product(ProductType.BOOK,80);
        Product product2=new Product(ProductType.ELECTRONICS, 280);
        Product product3=new Product(ProductType.COSMETICS, 10);
        productDAO.createProduct(product1);
        productDAO.createProduct(product2);
        productDAO.createProduct(product3);


    }

}

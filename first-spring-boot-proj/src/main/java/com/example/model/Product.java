package com.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
public class Product {

    public Product() {
        super();
    }
    public Product(ProductType productType, double productPrice) {
        super();
        this.productType = productType;
        this.productPrice = productPrice;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private int productId;
    @Column(name = "product_type")
    @Enumerated(EnumType.STRING)
    private ProductType productType;
    @Column(name = "product_price")
    private double productPrice;

}
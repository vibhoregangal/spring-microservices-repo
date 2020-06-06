package com.example.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.model.Product;
@Repository("productDAO")
@EnableAutoConfiguration
@EnableTransactionManagement
public class ProductDAOImpl implements ProductDAO {
    private EntityManager entityManager;
    @Autowired
    public ProductDAOImpl(EntityManager entityManager) {
        super();
        this.entityManager = entityManager;
    }
    @Override
    @Transactional
    public List<Product> getAllProduct() {
        Session session=entityManager.unwrap(Session.class);
        TypedQuery<Product> query=session.createQuery("From Product",Product.class);
        return query.getResultList();
    }
    @Override
    @Transactional
    public void createProduct(Product product) {
        // TODO Auto-generated method stub
        Session session=entityManager.unwrap(Session.class);
        session.save(product);
    }

}

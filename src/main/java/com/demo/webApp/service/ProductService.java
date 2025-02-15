package com.demo.webApp.service;

import com.demo.webApp.model.Product;
import com.demo.webApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(String id) {
        return repo.findById(id).orElse(null);
    }

    public void createProduct(Product product) {
        repo.save(product);
    }

    public void updateProduct(Product product) {
        repo.save(product);
    }

    public void deleteProduct(String id) {
        repo.deleteById(id);
    }
}

package com.hkuber.MyWebApp.service;

import com.hkuber.MyWebApp.model.Product;
import com.hkuber.MyWebApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getProductList() {

        return productRepository.findAll();
    }

    public Product getProduct(int id) {
        return productRepository.findById(id).orElse(new Product());
    }

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public void updateProduct(Product product) {
        productRepository.save(product);
    }

    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
}

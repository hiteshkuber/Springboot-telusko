package com.hkuber.MyWebApp.service;

import com.hkuber.MyWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(new Product(1, "Omen", 125000), new Product(2, "Charger", 300));
    public List<Product> getProductList() {

        return products;
    }
}

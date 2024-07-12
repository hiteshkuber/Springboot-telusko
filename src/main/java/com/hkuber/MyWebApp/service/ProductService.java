package com.hkuber.MyWebApp.service;

import com.hkuber.MyWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(new Product(1, "Omen", 125000), new Product(2, "Charger", 300)));
    public List<Product> getProductList() {

        return products;
    }

    public Product getProduct(int id) {
        return products.stream().filter(a -> a.getProdId() == id).findFirst().orElse(new Product());
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {
        int pos = -1;

        for(int i = 0; i < products.size(); i++)
        {
            if(product.getProdId() == products.get(i).getProdId()) {
                pos = i;
                break;
            }
        }

        if(pos == -1) {
            return;
        }

        products.set(pos, product);
    }

    public void deleteProduct(int id) {
        int pos = -1;

        for(int i = 0; i < products.size(); i++)
        {
            if(products.get(i).getProdId() == id) {
                products.remove(i);
                break;
            }
        }
    }
}

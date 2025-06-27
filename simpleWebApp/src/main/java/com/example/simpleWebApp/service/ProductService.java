package com.example.simpleWebApp.service;

import com.example.simpleWebApp.model.Product;
import com.example.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101, "Iphone", 5000),
//            new Product(102, "Canon camera", 70000),
//            new Product(103, "camera", 10000)));

    public List<Product> getProducts() {

//        return products;
        return repo.findAll();

    }

    public Product getProductById(int prodId) {
//        return products.stream()
//                .filter(p -> p.getProdID() == prodId)
//                .findFirst().get();
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod) {
//        products.add(prod);
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
//        int index = 0;
//        for (int i = 0; i < products.size(); i++)
//            if (products.get(i).getProdID() == prod.getProdID())
//                index = i;
//        products.set(index, prod);
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
//        int index = 0;
//        for (int i = 0; i < products.size(); i++)
//            if (products.get(i).getProdID() == prodId)
//                index = i;
//        products.remove(index);
        repo.deleteById(prodId);
    }
}

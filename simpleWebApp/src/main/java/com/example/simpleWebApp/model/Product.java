package com.example.simpleWebApp.model;

//import lombok.AllArgsConstructor;
//import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

//@Data
//@AllArgsConstructor
/*
@Component
✅ What is a POJO?
A POJO is:

A simple Java class

Not bound by any special Java framework restrictions or annotations

Just used to hold data


 */
@Component
@Entity
public class Product {
    @Id
    private int prodID;
    private String prodName;
    private  int price;

    public Product(int prodID, String prodName, int price) {
        this.prodID = prodID;
        this.prodName = prodName;
        this.price = price;
    }

    public Product() {

    }

    public int getProdID() { return prodID; }
    public void setProdID(int prodID) { this.prodID = prodID; }

    public String getProdName() { return prodName; }
    public void setProdName(String prodName) { this.prodName = prodName; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }



}

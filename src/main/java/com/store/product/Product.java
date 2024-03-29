package com.store.product;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {




    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String name;
    private String brand;
    private Integer stock;
    private double price;

    public Product() {
    }

    public Product(String name, String brand, Integer stock, double price) {
        this.name = name;
        this.brand = brand;
        this.stock = stock;
        this.price = price;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                '}';
    }
}

package com.store.store;

public class Product {

    private  String name;
    private String brand;
    private int stock;
    private double price;

    public Product() {
    }

    public Product(String name, String brand, int stock, double price) {
        this.name = name;
        this.brand = brand;
        this.stock = stock;
        this.price = price;
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

    public int getStock() {
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

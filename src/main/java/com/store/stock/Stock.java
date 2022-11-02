package com.store.stock;

import com.store.product.Product;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Stock")
public class Stock implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quant;
    @OneToOne
    private Product product;

    public Stock() {
    }

    public Stock(Long id, Integer quant, Product product) {
        this.id = id;
        this.quant = quant;
        this.product = product;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuant(Integer quant) {
        return this.quant;
    }

    public void setQuant(Integer quant) {
        this.quant = quant;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", quant=" + quant +
                ", product=" + product +
                '}';
    }
}

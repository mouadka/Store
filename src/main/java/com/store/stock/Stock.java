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
<<<<<<< HEAD
    private Integer quantity;

=======
    private Integer quant;
>>>>>>> origin/master
    @OneToOne
    private Product product;

    public Stock() {
    }

<<<<<<< HEAD
    public Stock(Long id, Integer quantity, Product product) {
        this.id = id;
        this.quantity = quantity;
=======
    public Stock(Long id, Integer quant, Product product) {
        this.id = id;
        this.quant = quant;
>>>>>>> origin/master
        this.product = product;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

<<<<<<< HEAD
    public Integer getQuantity() {
        return   quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
=======
    public Integer getQuant(Integer quant) {
        return this.quant;
    }

    public void setQuant(Integer quant) {
        this.quant = quant;
>>>>>>> origin/master
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
<<<<<<< HEAD
                ", quantity=" + quantity +
=======
                ", quant=" + quant +
>>>>>>> origin/master
                ", product=" + product +
                '}';
    }
}
<<<<<<< HEAD


=======
>>>>>>> origin/master

package com.store.stockMovement;

import com.store.provider.Provider;
import com.store.stock.Stock;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "stockMovement")
public class StockMovement implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer newQuantity;
    @ManyToOne
    @JoinColumn(name = "provider_id")
    private Provider provider;

    @OneToMany
    private List<Stock> stocks;

    public StockMovement() {
    }

    public StockMovement(Long id, Integer newQuantity, Provider provider, List<Stock> stocks) {
        this.id = id;
        this.newQuantity = newQuantity;
        this.provider = provider;
        this.stocks = stocks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNewQuantity() {
        return newQuantity;
    }

    public void setNewQuantity(Integer newQuantity) {
        this.newQuantity = newQuantity;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }

    @Override
    public String toString() {
        return "StockMovement{" +
                "id=" + id +
                ", newQuantity=" + newQuantity +
                ", provider=" + provider +
                ", stocks=" + stocks +
                '}';
    }
}

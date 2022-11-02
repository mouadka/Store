package com.store.stockMovement;

import com.store.stock.Stock;

import javax.persistence.*;
import java.util.List;
@Entity
public class StockMovement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany 
    private List<Stock> stocks;

    public StockMovement() {
    }

    public StockMovement(Long id, List<Stock> stocks) {
        this.id = id;
        this.stocks = stocks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
                ", stocks=" + stocks +
                '}';
    }
}

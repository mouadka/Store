package com.store.stock;

import com.store.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface StockRepository
        extends JpaRepository<Stock, Long> {
}

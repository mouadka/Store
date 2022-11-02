package com.store.stockMovement;

import com.store.stock.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface StockMovementRepository
        extends JpaRepository<StockMovement, Long> {
}

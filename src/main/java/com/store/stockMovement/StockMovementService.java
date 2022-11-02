package com.store.stockMovement;

import com.store.stock.Stock;
import com.store.stock.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StockMovementService {

    @Autowired
    public final StockMovementRepository stockMovementRepository;
    @Autowired
    public final StockRepository stockRepository;

    public StockMovementService(StockRepository stockRepository, StockMovementRepository stockMovementRepository) {
        this.stockRepository = stockRepository;
        this.stockMovementRepository = stockMovementRepository;
    }

    public List<StockMovement> getStockMovement(){

        return stockMovementRepository.findAll();
    }

    public void addNewStockMovement(StockMovement stockMovement){

        System.out.println("service: "+ stockMovement);
        List<Stock> stocks = stockMovement.getStocks();
        for (Stock s : stocks){
            System.out.println(s);
            Long stockId = s.getId();
            Stock stock = stockRepository.getReferenceById(stockId);
            int oldQuantity = stock.getQuantity();
            int newQuantity = oldQuantity + s.getQuantity();
            stock.setQuantity(newQuantity);
            stockMovementRepository.save(stockMovement);    

        }

        stockMovementRepository.save(stockMovement);
    }

}

package com.store.stockMovement;

import com.store.stock.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/stockMovement")
public class StockMovementController {
    @Autowired
    private StockMovementService stockMovementService;

    public StockMovementController(StockMovementService stockMovementService) {
        this.stockMovementService = stockMovementService;
    }
    @GetMapping
    public List<StockMovement> getStockMovement(){

        return stockMovementService.getStockMovement();
    }
    @PostMapping
    public void addStockMovement(@RequestBody StockMovement stockMovement){

        stockMovementService.addNewStockMovement(stockMovement);

    }


}

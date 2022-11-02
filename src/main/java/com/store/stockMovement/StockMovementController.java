package com.store.stockMovement;

import com.store.stock.Stock;
import com.store.stock.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/stockmovement")
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
    public void addStock(@RequestBody StockMovement stockMovement){

        System.out.println("controller: "+ stockMovement);

        stockMovementService.addNewStockMovement(stockMovement);

    }


}

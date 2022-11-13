package com.store.stock;

import com.store.product.Product;
import com.store.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/stock")
public class StockController {
    @Autowired
    private StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }
    @GetMapping
    public List<Stock> getStock(){

        return stockService.getStock();
    }
    @PostMapping
    public void addStock(@RequestBody Stock stock){
        System.out.println("controller "+ stock);
        stockService.addNewStock(stock);

    }


}

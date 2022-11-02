package com.store.stock;

import com.store.product.Product;
import com.store.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StockService {

    @Autowired
    public final ProductRepository productRepository;
    @Autowired
    public final StockRepository stockRepository;

    public StockService(StockRepository stockRepository, ProductRepository productRepository) {
        this.stockRepository = stockRepository;
        this.productRepository = productRepository;
    }

    public List<Stock> getStock(){

        return stockRepository.findAll();
    }

    public void addNewStock(Stock stock){
        System.out.println("service1 "+ stock);

        Long productId = stock.getProduct().getId();
        Product product = productRepository.getReferenceById(productId);
        System.out.println(product);
        stock.setProduct(product);
        System.out.println("service 2 "+ stock);

        stockRepository.save(stock);
    }
    public void deleteStock(Long stockId){
        boolean exists = stockRepository.existsById(stockId);
        if(!exists){
            throw new IllegalStateException("stock with ID "+ stockId + " does not exist");
        }
        stockRepository.deleteById(stockId);
    }

//    public void updateProduct( Long productId, Product product){
//        for(int i = 0; i < getProducts().size(); i++){
//            Product p = getProducts().get(i);
//            if(p.getId().equals(productId)){
//                getProducts().set(i,product);
//            }
//        }
//    }
    @Transactional
    public void updateStock(Long stockId,
                              int quant     ){
        Stock stock = stockRepository.findById(stockId)
                .orElseThrow(()-> new IllegalStateException("Not Found"));
        stock.getQuant(quant);

    }
}

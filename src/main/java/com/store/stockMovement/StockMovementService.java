package com.store.stockMovement;

import com.store.provider.Provider;
import com.store.provider.ProviderRepository;
import com.store.stock.Stock;
import com.store.stock.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StockMovementService {

    @Autowired
    public final ProviderRepository providerRepository;
    @Autowired
    public final StockMovementRepository stockMovementRepository;
    @Autowired
    public final StockRepository stockRepository;

    public StockMovementService(StockRepository stockRepository,
                                ProviderRepository providerRepository,
                                StockMovementRepository stockMovementRepository) {
        this.stockRepository = stockRepository;
        this.providerRepository = providerRepository;
        this.stockMovementRepository = stockMovementRepository;
    }

    public List<StockMovement> getStockMovement(){

        return stockMovementRepository.findAll();
    }

    public void addNewStockMovement(StockMovement stockMovement){

        //implementing stock

       List<Long> stocksId

        //implementing provider
        Long providerId = stockMovement.getProvider().getId();
        Provider provider = providerRepository.getReferenceById(providerId);
        stockMovement.setProvider(provider);

        //saving both stock and provider
        stockMovementRepository.save(stockMovement);

    }

}

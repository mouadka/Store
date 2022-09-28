package com.store.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Service
public class ProductService {

    @Autowired
    public final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public void addNewProduct(Product product){
        productRepository.save(product);
    }
    public void deleteProduct(Long productId){
        boolean exists = productRepository.existsById(productId);
        if(!exists){
            throw new IllegalStateException("product with ID "+ productId + " does not exist");
        }
        productRepository.deleteById(productId);
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
    public void updateProduct(Long productId,
                              String name,
                              String brand,
                              Integer stock,
                              Double price){
        Product product = productRepository.findById(productId)
                .orElseThrow(()-> new IllegalStateException("Not Found"));
        if(name != null && !Objects.equals(product.getName(),name)){
            product.setName(name);
        }
        if(brand != null && !Objects.equals(product.getBrand(),brand)) {
            product.setBrand(brand);
        }
       if(stock != null && stock != product.getStock()) {
            product.setStock(stock);
        }
        if(price != null && price != product.getPrice()){
            product.setPrice(price);
        }

    }
}

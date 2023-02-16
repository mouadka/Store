package com.store.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping
    public List<Product> getProducts(){

        return productService.getProducts();
    }
    @PostMapping
    public void addProduct(@RequestBody Product product){
        productService.addNewProduct(product);

    }

    @DeleteMapping(path = "{productId}")
    public void deleteProduct(@PathVariable("productId") Long productId){
        productService.deleteProduct(productId);
    }

    @PutMapping(path = "{productId}")
    public void updateProduct(@PathVariable("productId") Long productId,
                              @RequestParam(required = false) String name,
                              @RequestParam(required = false)String brand,
                              @RequestParam(required = false) Double price){
        productService.updateProduct(productId, name, brand, price);
    }
//    @RequestMapping(value="/{productId}", method = RequestMethod.PUT)
//    public void updateProduct(@RequestBody Product product,@PathVariable Long productId){
//        productService.updateProduct(productId, product);

    //}
}

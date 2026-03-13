package com.loopcodes.gereciamentoecommerce.Controller;


import com.loopcodes.gereciamentoecommerce.Entitys.Product;
import com.loopcodes.gereciamentoecommerce.Service.ProductService;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")


public class ProductController {
    @Autowired
    private ProductService productService;


    @PostMapping
    public Product createProduct(@RequestBody Product product){return productService.create(product);}


    @GetMapping
    public List<Product> getAllProduct(){return productService.findAll();}

    @GetMapping("/{id}")
    public Product getProductbyid(@PathVariable Long id){
        return productService.findById(id);
    }
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id,@RequestBody Product productDetails){
        return productService.update(id,productDetails);
    }
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.delete(id);
    }



}

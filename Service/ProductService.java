package com.loopcodes.gereciamentoecommerce.Service;


import com.loopcodes.gereciamentoecommerce.Entitys.Product;
import com.loopcodes.gereciamentoecommerce.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product create(Product product){
        return productRepository.save(product);
    }

    public List<Product> findAll(){return productRepository.findAll();}

    public Product findById(Long id){
        return productRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Product not finded"));
    }
    public Product update(Long id, Product productDetails){
        Product product = findById((id));
        product.setName(productDetails.getName());
        product.setTipy(productDetails.getTipy());
        product.setCuster(productDetails.getCuster());
        product.setQuant(productDetails.getQuant());

        return productRepository.save(product);
    }
    public void delete(Long id){productRepository.deleteById(id);}
}

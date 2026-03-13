package com.loopcodes.gereciamentoecommerce.Repository;

import com.loopcodes.gereciamentoecommerce.Entitys.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}

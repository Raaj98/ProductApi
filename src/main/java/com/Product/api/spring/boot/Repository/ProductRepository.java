package com.Product.api.spring.boot.Repository;

import com.Product.api.spring.boot.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Optional<Product> findByName(String product_name);
}

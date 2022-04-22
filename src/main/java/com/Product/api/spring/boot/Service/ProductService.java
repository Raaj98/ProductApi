package com.Product.api.spring.boot.Service;

import com.Product.api.spring.boot.Entity.Product;
import com.Product.api.spring.boot.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void addProduct (Product product){
        productRepository.save(product);
    }

    public List<Product> addProducts(List<Product> products){
        return productRepository.saveAll(products);
    }

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public Optional <Product> getProductById(int product_id){
        return productRepository.findById(product_id);
    }

    public Optional<Product> getProductByName(String Product_name){
        return productRepository.findByName(Product_name);
    }

    public Product updateProduct(Product product,int product_id){
        product.setId(product_id);
        return productRepository.save(product);
    }

    public void deleteProduct(int product_id){
        productRepository.deleteById(product_id);
    }
}

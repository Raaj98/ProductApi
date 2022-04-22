package com.Product.api.spring.boot.Controller;

import com.Product.api.spring.boot.Entity.Product;
import com.Product.api.spring.boot.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/product")
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }

    @PostMapping("/products")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return productService.addProducts(products);
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @GetMapping("/productById/{product_id}")
    public Optional<Product> getProductById(@PathVariable ("product_id") int product_id){
        return productService.getProductById(product_id);
    }

    @GetMapping("/productByName/{product_name}")
    public Optional<Product> getProductByName(@PathVariable("product_name") String product_name){
        return productService.getProductByName(product_name);
    }

    @PutMapping("/product/{product_id}")
    public Product updateProduct(@RequestBody Product product,@PathVariable int product_id){
        return  productService.updateProduct(product,product_id);
    }

    @DeleteMapping("/product/{product_id}")
    public void deleteProduct(@PathVariable int product_id){
        productService.deleteProduct(product_id);
    }
}

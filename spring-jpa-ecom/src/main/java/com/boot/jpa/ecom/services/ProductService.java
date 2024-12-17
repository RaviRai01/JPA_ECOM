package com.boot.jpa.ecom.services;

import com.boot.jpa.ecom.entities.Product;
import com.boot.jpa.ecom.repositories.ProductRepository;
import com.boot.jpa.ecom.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;


    public ProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    public Product create (Product product){
        Product savedProduct = productRepository.save(product);
        return savedProduct;
    }
    //find all
    public List<Product> all(){
        List<Product> all = productRepository.findAll();
        return all;
    }
    // find by id
    public Product byId(int productId) {
       // Product product = productRepository.findById(productId).get();
        // To through our own execption
        Product product = productRepository.findById(productId).orElseThrow(()-> new RuntimeException("Product not found with id " + productId));
       // Product product = productRepository.findById(productId).get();
        return product;




    }
    //Delete
    public void delete(int productId){
        Product product = productRepository.findById(productId).get();
         productRepository.delete(product);
    }
   // public List<Product> getProductByPrice(double price){
     //   List<Product> byPrice = productRepository.findByPrice(price);
       // return byPrice;
   // }

}

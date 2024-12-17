package com.boot.jpa.ecom.repositories;

import com.boot.jpa.ecom.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {

// (1)CRUD is already there



    // (2) Custom Method  (Custom finder methods)
    // we have follow PROTOCOL in this method

    // Select * FROM product WHERE title LIKE '%';
    //Test:
    List<Product> findByTitleContaining(String title);

    List<Product> findByPrice(double price);


    List<Product> findByTitleAndPrice(String title, double price);
    List<Product> findByIsLive(boolean isLive);

    int countByPrice(double price);


       boolean existsByTitle(String title);  // To Check if any field exixt or not


    // (3) Query Methods

    @Query("select p from Product p")
 List<Product> getMyCustomQueryProducts();


    @Query(nativeQuery = true, value = "select * from jpa_products")
     List<Product> getMyCustomNativeQueryProducts();


    // Parameter

  //  @Query("select p from Product p WHERE p.title =:title and p.price =:price")
   // List <Product> getProductByTitle(@Param("title") String title, @Param("price") double price);



}
 
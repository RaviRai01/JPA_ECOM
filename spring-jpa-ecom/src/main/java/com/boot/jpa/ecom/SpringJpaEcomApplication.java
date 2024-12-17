package com.boot.jpa.ecom;

import com.boot.jpa.ecom.entities.Product;
import com.boot.jpa.ecom.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaEcomApplication implements CommandLineRunner {
	@Autowired
	private ProductService productService;

	public static void main(String[] args)
	{
		SpringApplication.run(SpringJpaEcomApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Application Starting");
//

		Product product = new Product();
	//product.setTitle("Iphone 16 pro max");
	//	product.setDescription("This is a powerful smartphone");
	//	product.setPrice(160000);
	//	product.setLive(false);


		Product product1 = productService.create(product);
		System.out.println(product1);
	      System.out.println("Product Created");

		//To See all data comment above code of created product and use bellow code
		//productService.all().forEach(System.out::println); // Select Query has executed

		// To get single product comment above code also
		System.out.println(productService.byId(1));

	}
}


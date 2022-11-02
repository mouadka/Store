package com.store;

import com.store.product.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Random;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);



//		boolean client=false;
//		boolean provider=false;
//
//		Random random = new Random();
//		Product p1 = new Product("Perly", "Jaouda",100,2.5);
//
//		do{
//			client = random.nextBoolean();
//			p1.setStock(p1.getStock()-1);
//		}while(client);
//
//		System.out.println("after client purchase");
//		System.out.println(p1.toString());
//
//		do{
//			provider = random.nextBoolean();
//			p1.setStock(p1.getStock()+1);
//		}while(provider);
//
//		System.out.println("after provider action");
//		System.out.println(p1.toString());
//
//
	}


}

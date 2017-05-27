package com.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookstore.domain.User;

@SpringBootApplication
public class BookstoreAngularApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BookstoreAngularApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		User user1 = new User();
		user1.setFirstName("Yadnyesh");
		user1.setLastName("BharatJuvekar");
		user1.setUsername("yb");
		

		
	}
	
	
}

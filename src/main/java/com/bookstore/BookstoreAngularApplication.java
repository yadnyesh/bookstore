package com.bookstore;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookstore.config.SecurityUtility;
import com.bookstore.domain.User;
import com.bookstore.domain.security.Role;
import com.bookstore.domain.security.UserRole;

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
		user1.setPassword(SecurityUtility.passwordEncoder().encode("p"));
		user1.setEmail("yadnyesh.juvekar@gmail.com");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1 = new Role();
		role1.setRoleId(1);
		role1.setName("ROLE_USER");
		userRoles.add(new UserRole(user1, role1));

		userService.createUser(user1, userRoles);
		
		userRoles.clear();
		
		User user2 = new User();
		user2.setFirstName("Admin");
		user2.setLastName("Admin");
		user2.setUsername("admin");
		user2.setPassword(SecurityUtility.passwordEncoder().encode("p"));
		user2.setEmail("admin@gmail.com");
		Set<UserRole> userRoles2 = new HashSet<>();
		Role role2 = new Role();
		role1.setRoleId(0);
		role1.setName("ROLE_ADMIN");
		userRoles2.add(new UserRole(user2, role2));

		userService.createUser(user2, userRoles);
		
		userRoles.clear();
		
	}
	
	
}

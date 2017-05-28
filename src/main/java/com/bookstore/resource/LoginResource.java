package com.bookstore.resource;

import org.springframework.web.bind.annotation.RestController;

import com.bookstore.domain.User;

@RestController
public class LoginResource {

	@Autowired
	private User user;
	
}

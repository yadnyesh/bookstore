package com.bookstore.resource;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.service.UserService;

@RestController
public class LoginResource {

	@Autowired
	private UserService userService;
	
	public Map<String, String> token(HttpSession session,)
	
}

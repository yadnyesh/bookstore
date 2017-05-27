package com.bookstore.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class UserSecurityService implements UserDetailsService{
		private static final Logger LOG = LoggerFactory.getLogger(UserSecurityService.class);
		
}

package com.bookstore.config;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class RequestFilter {
	
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) {

}

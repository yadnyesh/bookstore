package com.bookstore.domain.security;

import java.io.Serializable;

import javax.persistence.Entity;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Authority implements GrantedAuthority, Serializable{
	private static final long serialVersionUID = 123123L;
	
	private final String authority;
	
	public Authority(String authority) {
		this.authority = authority;
	}

	@Override
	public String getAuthority() {
		return authority;
	}
	
	
}

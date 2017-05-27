package com.bookstore.domain.security;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_role")
public class UserRole implements Serializable{

	private static final long serialVersionUID = 800000L;
	
	private User user;
	
	private Role role;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userRoleId;
	
	public UserRole(){}

	public UserRole(Long userRoleId) {
		super();
		this.userRoleId = userRoleId;
	}
	
	
	
}

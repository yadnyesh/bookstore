package com.bookstore.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.bookstore.domain.security.UserRole;

@Entity
public class User implements Serializable{

	private static final long serialVersionUID = 112398147L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Id", nullable=false, updatable=false)
	private Long id;

	private String username;
	private String password;
	private String firstName;
	private String lastName;
	
	private String email;
	private String phone;
	private boolean enabled = true;
	
	@OneToMany(mapped = "user", cascade=CascadeType.ALL)
	private Set<UserRole> userRoles = new HashSet<>();
}

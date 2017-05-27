package com.bookstore.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User implements Serializable{

	private static final long serialVersionUID = 112398147L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;

	
}

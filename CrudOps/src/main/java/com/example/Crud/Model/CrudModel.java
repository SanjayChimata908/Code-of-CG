package com.example.Crud.Model;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Entity;

@Entity
public class CrudModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String Name;
	private String Email;
	public Long getId() {
		return Id;
	}
	public String getName() {
		return Name;
	}
	public String getEmail() {
		return Email;
	}
	public void setId(Long id) {
		Id = id;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	
}

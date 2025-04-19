package com.example.demo.Model;

public class User {

	private int Id;
	private String Name;
	private int age;
	private String email;
	
	public User(int id, String name, int age, String email) {
		super();
		Id = id;
		Name = name;
		this.age = age;
		this.email = email;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

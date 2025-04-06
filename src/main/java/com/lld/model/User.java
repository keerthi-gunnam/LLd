package com.lld.model;

public class User {
	private final String id;
	private String name;
	private String email;
	
	public User(String name,String email) {
			
		this.id=IdGenerator.generateID();
		this.name=name;
		this.email=email;
		
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
}
	

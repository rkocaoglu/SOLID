package com.rk.srp.bad;

public class User {
	private Long id;
	private String name;
	private String street;
	private String city;
	private String username;

	// Getters, setters

	public void changeAddress(String street, String city) {
		// logic
	}

	public void login(String username) {
		// logic
	}

	public void logout(String username) {
		// logic
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
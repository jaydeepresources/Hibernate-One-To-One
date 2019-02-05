package com.component.mapping;

public class User {

	int id;
	String name;
	String username;
	String password;
	String email;

	Account account;

	public User() {

	}

	public User(int id, String name, String username, String password, String email, Account account) {
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.account = account;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", email="
				+ email + ", account=" + account + "]";
	}

}

package com.component.mapping;

public class Account {

	int id;
	String displayName;
	String location;

	User user;

	public Account() {

	}

	public Account(int id, String displayName, String location, User user) {
		this.id = id;
		this.displayName = displayName;
		this.location = location;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", displayName=" + displayName + ", location=" + location + ", user=" + user + "]";
	}

}

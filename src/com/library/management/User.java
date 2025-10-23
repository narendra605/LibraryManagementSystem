package com.library.management;

public class User {
	private String name;
	private int userId;

	public User() {

	}

	public User(String name, int userId) {
		this.name = name;
		this.userId = userId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getUserId() {
		return userId;
	}

	@Override
	public String toString() {
		return "[ Name: " + name + " UserId: " + userId + " ]";
	}

}

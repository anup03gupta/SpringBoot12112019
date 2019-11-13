package com.zensar.springbootapp.entity;

public class User {
	
	private int userId;
	private String userName;
	private int userAge;
	private String email;
	
	public User() {
		super();
	}


	public User(int userId, String userName, int userAge, String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.email = email;
	}
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + ", email=" + email + "]";
	}

}

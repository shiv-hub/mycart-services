package com.mycartservices.model;

public class UserLogged {

	private String userName;
	private String token;
	private String firstName;
	private String lastName;
	private int roleId;
	private String email;
	private String phone1;
	private String phone2;
	private long uid;
		
	public UserLogged() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public UserLogged(String userName, String token, String firstName, String lastName, int roleId, String email,
			String phone1, String phone2, long uid) {
		super();
		this.userName = userName;
		this.token = token;
		this.firstName = firstName;
		this.lastName = lastName;
		this.roleId = roleId;
		this.email = email;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.uid = uid;
	}
	
	
	
	
	
}

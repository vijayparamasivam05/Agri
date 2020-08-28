package com.agri;
import java.io.*;
import java.util.*;

public class User {
	
	private String user_name;
	private String email_id;
	private String password;
	private long mobile_number;
	
	public User(String user_name, String email_id, String password, long mobile_number) {
		super();
		this.user_name = user_name;
		this.email_id = email_id;
		this.password = password;
		this.mobile_number = mobile_number;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}

	@Override
	public String toString() {
		return "User [user_name=" + user_name + ", email_id=" + email_id + ", password=" + password + ", mobile_number="
				+ mobile_number + "]";
	}

}

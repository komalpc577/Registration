package com.app.Registration.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private String username;
	private int age;
	private String gender;
	private String hobbies;
	private String password;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String username, int age,String gender, String hobbies, String password) {
		super();
		this.id = id;
		this.username = username;
		this.age = age;
		this.gender=gender;
		this.hobbies = hobbies;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public int getAge() {
		return age;
	}
	public String getHobbies() {
		return hobbies;
	}
	public String getPassword() {
		return password;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
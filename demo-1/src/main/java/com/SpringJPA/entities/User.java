package com.SpringJPA.entities;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class User {

	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	
	private String Name;
	
	private String City;

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

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", Name=" + Name + ", City=" + City + "]";
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, String city) {
		super();
		Id = id;
		Name = name;
		City = city;
	}
	
	
}

package com.example.demo.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.database.base.DbEntity;



@Entity
@Table(name = "address")
@Inheritance
public class Address extends DbEntity {

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Column(name = "street_number")
	private String streetNumber;

	@Column(name = "street_name")
	private String street;

	@Column(name = "zipcode")
	private String zipcode;

	@Column(name = "city")
	private String city;

	//@OneToMany(mappedBy = "owner", targetEntity = User.class)
	@OneToMany(targetEntity = User.class, mappedBy = "address")
	private List<User> users;


}

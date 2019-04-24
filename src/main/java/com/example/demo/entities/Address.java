package com.example.demo.entities;

import java.util.ArrayList;

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

	@Column(name = "street_number")
	private String streetNumber;

	@Column(name = "street_name")
	private String street;

	@Column(name = "zipcode")
	private String zipcode;

	@Column(name = "city")
	private String city;

	@OneToMany(mappedBy = "owner")
	private ArrayList<User> users;


}

package com.example.demo.entities;

import com.example.demo.database.base.DbEntity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product")
@Inheritance
public class Product extends DbEntity{

	@Column(name = "name")
    private String name;

	@Column(name = "serialId")
    private String serialId;

	@Column(name = "price")
    private Double price;

	@Column(name = "eatable")
    private Boolean eatable;

	@ManyToMany
	private List<User> users;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSerialId() {
		return serialId;
	}

	public void setSerialId(String serialId) {
		this.serialId = serialId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Boolean getEatable() {
		return eatable;
	}

	public void setEatable(Boolean eatable) {
		this.eatable = eatable;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
}

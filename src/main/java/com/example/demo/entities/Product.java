package com.example.demo.entities;

import com.example.demo.database.base.DbEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
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
}

package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.demo.database.base.DbEntity;

@Entity
@Table(name = "user")
@Inheritance
public class User extends DbEntity {

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "number_children")
    private Integer nbChildren;

    @Column(name = "happy")
    private Boolean happy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private Address address;

    public User() {
		super();
	}

	public User(String firstname, String lastname, Integer nbChildren, Boolean happy) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.nbChildren = nbChildren;
		this.happy = happy;
	}

	public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getNbChildren() {
		return nbChildren;
	}

	public void setNbChildren(Integer nbChildren) {
		this.nbChildren = nbChildren;
	}

	public Boolean getHappy() {
		return happy;
	}

	public void setHappy(Boolean happy) {
		this.happy = happy;
	}


}

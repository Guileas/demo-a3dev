package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

import com.example.demo.database.base.DbEntity;

@Entity
@Table(name = "role")
@Inheritance
public class Role extends DbEntity{

	@Column(name = "name")
    private String name;

	@Column(name = "tag")
    private String tag;

	@Column(name = "rights")
    private Integer rights;

	@Column(name = "isRoot")
    private Boolean isRoot;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Integer getRights() {
		return rights;
	}

	public void setRights(Integer rights) {
		this.rights = rights;
	}

	public Boolean getIsRoot() {
		return isRoot;
	}

	public void setIsRoot(Boolean isRoot) {
		this.isRoot = isRoot;
	}

}

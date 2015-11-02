package com.test.entity;

import java.util.Set;

/**
 * 岗位
 * 
 * @author SevenKey
 * 
 */

public class Role {
	private Long id;// 主键id
	private String name; // 岗位名
	private String description; // 岗位描述
	private Set<User> users; // 岗位下用户

	public Role(Long id, String name, String description, Set<User> users) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.users = users;
	}

	public Role() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", description="
				+ description + ", users=" + users + "]";
	}

}

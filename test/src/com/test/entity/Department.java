package com.test.entity;

import java.util.Set;

/**
 * 部门
 * 
 * @author SevenKey
 * 
 */
public class Department {
	private Long id; // 主键 id
	private String name; // 部门名
	private String description; // 描述
	private Set<User> users; // 部门下用户
	private Department parent; // 上级部门
	private Set<Department> children; // 下级部门

	public Department(Long id, String name, String description,
			Set<User> users, Department parent, Set<Department> children) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.users = users;
		this.parent = parent;
		this.children = children;
	}

	public Department() {
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

	public Department getParent() {
		return parent;
	}

	public void setParent(Department parent) {
		this.parent = parent;
	}

	public Set<Department> getChildren() {
		return children;
	}

	public void setChildren(Set<Department> children) {
		this.children = children;
	}

	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", description="
				+ description + ", users=" + users + ", parent=" + parent
				+ ", children=" + children + "]";
	}

}

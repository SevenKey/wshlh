package com.test.entity;

import java.util.Set;

/**
 * 用户
 * 
 * @author SevenKey
 * 
 */
public class User {
	private Long id; // 主键id
	private Department department;// 所属部门
	private Set<Role> roles;// 所属岗位
	private String loginName;// 登陆名
	private String passwrold;// 密码
	private String name;// 姓名
	private String gender;// 性别
	private String phoneNumber;// 电话号码
	private String email;// 邮箱
	private String description;// 描述

	public User() {
	}

	public User(Long id, Department department, Set<Role> roles,
			String loginName, String passwrold, String name, String gender,
			String phoneNumber, String email, String description) {
		this.id = id;
		this.department = department;
		this.roles = roles;
		this.loginName = loginName;
		this.passwrold = passwrold;
		this.name = name;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPasswrold() {
		return passwrold;
	}

	public void setPasswrold(String passwrold) {
		this.passwrold = passwrold;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String toString() {
		return "User [id=" + id + ", department=" + department + ", roles="
				+ roles + ", loginName=" + loginName + ", passwrold="
				+ passwrold + ", name=" + name + ", gender=" + gender
				+ ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", description=" + description + "]";
	}

}

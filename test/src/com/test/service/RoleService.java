package com.test.service;

import java.util.List;

import com.test.entity.Role;

public interface RoleService {

	public List<Role> finAll();

	public void add(Role role);

	public void delete(Long id);

	public Role findById(Long id);

	public void update(Role model);

}

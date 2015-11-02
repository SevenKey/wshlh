package com.test.dao;

import java.util.List;

import com.test.entity.Role;

public interface RoleDao {

	public List<Role> findAll();

	public void save(Role role);

	public void delete(Long id);

	public Role findById(Long id);

	public void update(Role model);

}

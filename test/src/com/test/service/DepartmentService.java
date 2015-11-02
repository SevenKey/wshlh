package com.test.service;

import java.util.List;

import com.test.entity.Department;


public interface DepartmentService {

	public List<Department> findAll();

	public void save(Department model);

	public Department findById(Long id);

	public void update(Department model);

	public void delete(Long id);

}

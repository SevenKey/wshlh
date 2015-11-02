package com.test.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.DepartmentDao;
import com.test.entity.Department;
import com.test.service.DepartmentService;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
	@Resource
	DepartmentDao departmentDao;

	public List<Department> findAll() {
		return departmentDao.findAll();
	}

	public void save(Department model) {
		departmentDao.save(model);
	}

	public Department findById(Long id) {
		return departmentDao.findById(id);
	}

	public void update(Department model) {
		departmentDao.update(model);
	}

	public void delete(Long id) {
		departmentDao.delete(id);
	}

}

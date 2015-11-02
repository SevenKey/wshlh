package com.test.dao.impl;

import org.springframework.stereotype.Repository;

import com.test.base.BaseDaoImpl;
import com.test.dao.DepartmentDao;
import com.test.entity.Department;

@Repository
public class DepartmentDaoImpl extends BaseDaoImpl<Department> implements
		DepartmentDao {

}

package com.test.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.RoleDao;
import com.test.entity.Role;
import com.test.service.RoleService;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {
	@Resource
	private RoleDao roleDao;

	public List<Role> finAll() {
		return roleDao.findAll();
	}

	public void add(Role role) {
		roleDao.save(role);
	}

	public void delete(Long id) {
		roleDao.delete(id);
	}

	public Role findById(Long id) {
		return roleDao.findById(id);
	}

	public void update(Role model) {
		roleDao.update(model);
	}
}

package com.test.base;

import java.util.List;

public interface BaseDao<T> {
	// 增
	public void save(T entity);

	// 删
	public void delete(Long id);

	// 改
	public void update(T entity);

	// 通过id查找一个
	public T findById(Long id);

	// 查找全部
	public List<T> findAll();

	// 通过多个id查找
	public List<T> findByIds(Long[] ids);
}

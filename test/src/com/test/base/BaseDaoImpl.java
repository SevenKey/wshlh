package com.test.base;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BaseDaoImpl<T> implements BaseDao<T> {
	@Resource
	private SessionFactory sessionFactory;

	private Class<T> clazz;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public BaseDaoImpl(){
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
		clazz = (Class<T>) pt.getActualTypeArguments()[0];
	}

	/**
	 * 保存一个实体
	 */
	public void save(T entity) {
		getSession().save(entity);
	}

	/**
	 * 删除一个实体
	 */
	public void delete(Long id) {
		T obj = findById(id);
		getSession().delete(obj);
	}

	/**
	 * 更新一个实体
	 */
	public void update(T entity) {
		getSession().update(entity);
	}

	/**
	 * 通过id查找一个实体
	 */
	@SuppressWarnings("unchecked")
	public T findById(Long id) {
		return (T) getSession().get(clazz, id);
	}

	/**
	 * 查找全部实体
	 */
	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return getSession().createQuery("FROM " + clazz.getSimpleName()).list();
	}

	/**
	 * 通过多个id查找多个实体
	 */
	@SuppressWarnings("unchecked")
	public List<T> findByIds(Long[] ids) {
		return (List<T>) getSession().createQuery(
				"FROM " + clazz.getSimpleName() + " WHERE id IN (ids)")
				.setParameter("ids", ids);
	}

}

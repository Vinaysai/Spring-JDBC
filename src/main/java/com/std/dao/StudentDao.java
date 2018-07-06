package com.std.dao;

import java.util.List;

import com.std.model.BeanClass;

public interface StudentDao {

	public int insert(BeanClass student);
	public int update(BeanClass student);
	public int delete(int id);
	public List<BeanClass> findAll();
	
}

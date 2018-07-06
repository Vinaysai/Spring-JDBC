package com.std.service;

import java.util.List;

import com.std.model.BeanClass;

public interface StudentService {

	public String insert(BeanClass s);
	public int update(BeanClass s);
	public int delete(int id);
	public List<BeanClass> findAll();
	

}

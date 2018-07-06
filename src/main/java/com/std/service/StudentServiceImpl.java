package com.std.service;

import java.util.List;

import com.std.dao.StudentDao;
import com.std.model.BeanClass;

public class StudentServiceImpl implements StudentService{

	StudentDao dao;
	
	public void setDao(StudentDao dao) {
		this.dao = dao;
	}

	public String insert(BeanClass s) {

	int n=dao.insert(s);
	
	if(n!=0)
	{
		return s.getId()+""+s.getName()+""+s.getCollege();
		
	}
	else
	
		return "no record inserted";
	
	}

	public int update(BeanClass s) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<BeanClass> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}

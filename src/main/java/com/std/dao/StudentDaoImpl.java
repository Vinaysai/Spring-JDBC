package com.std.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.std.model.BeanClass;

public class StudentDaoImpl implements StudentDao {
	JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public int insert(BeanClass s) {

		int n = jt
				.update("insert into student values(" + s.getId() + ",'" + s.getName() + "','" + s.getCollege() + "')");

		return n;
	}

	public int update(BeanClass s) {
		jt.update("update table student");
		return 0;
	}

	public int delete(int id) {
		return 0;
	}

	public List<BeanClass> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

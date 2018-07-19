package com.std.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.std.model.BeanClass;
import com.std.service.StudentServiceImpl;

public class TestClass {
	public static void main(String args[]) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

		StudentServiceImpl ss = (StudentServiceImpl) ac.getBean("StudentService", StudentServiceImpl.class);

		BeanClass bc = new BeanClass();
		bc.setId(537);
		bc.setName("Vinaysai");
		bc.setCollege("SVCET");
		System.out.println(ss.insert(bc));

	}

}

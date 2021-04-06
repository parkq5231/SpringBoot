package com.company.app;

import static org.junit.Assert.assertNotNull;

import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.company.app.config.BeanConfiguration;
import com.company.app.config.DBConfiguration;
import com.company.app.config.MybatisConfiguration;
import com.company.app.emp.service.Emp;
import com.company.app.emp.service.EmpService;
import com.company.app.emp.service.impl.EmpMapper;

@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
//java 기반 bean 설정
@ContextConfiguration(classes = { DBConfiguration.class, MybatisConfiguration.class, BeanConfiguration.class })
public class EmpMapperClient {
	@Autowired
	EmpMapper empMapper;
	@Autowired
	EmpService empService;

	@Test
	@Rollback
	public void insert() {
		Emp emp = Emp.builder().employeeId("301")//
				.firstName("kim").lastName("bab")//
				.email("kimbab2").hireDate(new Date(System.currentTimeMillis()))//
				.jobId("IT_PROG").build();//

		empService.insertEmp(emp);
		emp = empMapper.getEmp(emp);
		// 결과값에 따라 test여부 결정
		assertNotNull(emp);

	}// end of insert
}// end of class

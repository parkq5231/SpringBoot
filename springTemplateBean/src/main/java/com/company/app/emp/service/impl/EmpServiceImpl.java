package com.company.app.emp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.app.emp.service.Emp;
import com.company.app.emp.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {

	
	EmpMapper empMapper;

	@Autowired
	public EmpServiceImpl(EmpMapper empMapper) {// constructor 방식
		this.empMapper = empMapper;
	}

	@Override
	public void insertEmp(Emp emp) {
		empMapper.insertEmp(emp);
	}
}

package com.company.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.company.app.emp.service.EmpService;
import com.company.app.emp.service.impl.EmpMapper;
import com.company.app.emp.service.impl.EmpServiceImpl;

@Configuration
@ComponentScan(basePackages = "com.company") // bean이 여러개일 때 자동으로 등록해주는 기능
public class BeanConfiguration {

	// @Bean // 직접 bean설정
	public EmpService empService(EmpMapper empMapper) {
		return new EmpServiceImpl(empMapper);
	}
}

package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.config.BootstrapMode;

@Configuration // java방식의 설정을 의미
@EnableJpaRepositories(bootstrapMode = BootstrapMode.DEFERRED)//bean 등록 시점을 의미 Spring data -> 4.5.2. Java Configuration
public class RepositoryConfig {
	
}

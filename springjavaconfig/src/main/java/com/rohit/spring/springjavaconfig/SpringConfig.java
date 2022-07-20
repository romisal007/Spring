package com.rohit.spring.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration
@Import(Dao.class)
public class SpringConfig {
	
	@Bean(initMethod = "init",destroyMethod = "destroy")
	@Scope("prototype")
	public Service service() {
		return new Service();
	}
}

package com.hcl.javabased.springjavabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

	@Bean(name = "employeeObj")
	public Employee getEmployee() {
		return new Employee("Tejaswini");

	}
}

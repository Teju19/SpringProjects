package com.hcl.javabased.springjavabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		Employee employeeObj = (Employee) context.getBean("employeeObj");
		String employeeName = employeeObj.getEmployeeName();

		System.out.println("Employee name: " + employeeName);
	}

}
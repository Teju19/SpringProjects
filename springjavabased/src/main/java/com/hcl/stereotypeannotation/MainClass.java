package com.hcl.stereotypeannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/hcl/stereotypeannotation/spring.xml");

		EmployeeController controller = (EmployeeController) context.getBean("employeeController");

		System.out.println(controller);
	}

}

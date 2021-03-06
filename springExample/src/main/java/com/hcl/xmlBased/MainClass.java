package com.hcl.xmlBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/hcl/xmlBased/spring.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee.geteName() + " " + employee.geteDesignation());
		System.out.println(employee.getProject().getpName());
		
		System.out.println(employee);
		System.out.println(employee.getProject());
		System.out.println(employee.getProject());
		System.out.println();
		
		Project project= (Project) context.getBean("project");
		Project project1= (Project) context.getBean("project");
		System.out.println();
		System.out.println(project);
		System.out.println(project1);
		
		context.registerShutdownHook();
	}

}

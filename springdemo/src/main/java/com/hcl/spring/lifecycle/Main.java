package com.hcl.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/hcl/spring/lifecycle/spring.xml");
		Table t1 = (Table) context.getBean("t1");
		System.out.println(t1);

		context.registerShutdownHook();
	}

}

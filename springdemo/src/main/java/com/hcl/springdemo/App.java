package com.hcl.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
       AbstractApplicationContext context =new ClassPathXmlApplicationContext("com/hcl/springdemo/spring.xml");
       Emp emp1 =context.getBean("emp1", Emp.class);
       
       System.out.println(emp1);
       context.registerShutdownHook();
       
    }
}

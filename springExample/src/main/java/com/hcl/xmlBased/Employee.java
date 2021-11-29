package com.hcl.xmlBased;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean {
	private String eName;
	private String eDesignation;
	private Project project;

	public Employee() {
		System.out.println("Employee Default Constructor called");
	}

	public Employee(String eName, String eDesignation, Project project) {
		super();
		this.eName = eName;
		this.eDesignation = eDesignation;
		this.project= project;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteDesignation() {
		return eDesignation;
	}

	public void seteDesignation(String eDesignation) {
		this.eDesignation = eDesignation;
	}
	
	public void customInitMethod() {
		System.out.println("Inside customInitMethod");
	}
	public void customDestroyMethod() {
		System.out.println("Inside customDestroyMethod");
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertiesSet");
		
	}

	public void destroy() throws Exception {
		System.out.println("Inside destroy");
		
	}
	

}

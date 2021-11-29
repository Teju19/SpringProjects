package com.hcl.xmlBased;

public class Project {
	private String pName;
	private int pDuration;

	public Project() {
		System.out.println("Project Default Constructor called");
	}

	public Project(String pName, int pDuration) {
		super();
		this.pName = pName;
		this.pDuration = pDuration;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpDuration() {
		return pDuration;
	}

	public void setpDuration(int pDuration) {
		this.pDuration = pDuration;
	}

}

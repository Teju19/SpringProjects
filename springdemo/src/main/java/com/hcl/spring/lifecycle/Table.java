package com.hcl.spring.lifecycle;

public class Table {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;

		System.out.println("Setting Price");
	}

	@Override
	public String toString() {
		return "Table [price=" + price + "]";
	}

	public void init() {

		System.out.println("Inside Init Method");

	}

	public void destroy() {
		System.out.println("Inside Destroy Method");
	}

}

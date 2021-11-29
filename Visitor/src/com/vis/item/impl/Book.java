package com.vis.item.impl;

import com.item.Item;
import com.visitor.ShoppingCartVisitor;

public class Book implements Item {

	private String name;
	private double price;
	private String isbnNumber;

	public Book(String name, String isbnNumber, double price) {
		super();
		this.name = name;
		this.price = price;
		this.isbnNumber = isbnNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	public void setIsbnNumber(String isbnNumber) {
		this.isbnNumber = isbnNumber;
	}

	@Override
	public double accept(ShoppingCartVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}

}

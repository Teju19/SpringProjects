package com.vis.item.impl;

import com.item.Item;
import com.visitor.ShoppingCartVisitor;

public class Fruit implements Item {

	private String name;
	private double priceperkg;
	public int weight;

	public Fruit(String name, double priceperkg, int weight) {
		super();
		this.name = name;
		this.priceperkg = priceperkg;
		this.weight = weight;
	}

	public double getPriceperkg() {
		return priceperkg;
	}

	public void setPriceperkg(double priceperkg) {
		this.priceperkg = priceperkg;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public double accept(ShoppingCartVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}

}

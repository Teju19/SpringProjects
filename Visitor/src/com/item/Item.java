package com.item;

import com.visitor.ShoppingCartVisitor;

public interface Item {
	public double accept(ShoppingCartVisitor visitor);

}

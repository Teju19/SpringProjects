package com.visitor;

import com.vis.item.impl.Book;
import com.vis.item.impl.Fruit;

public interface ShoppingCartVisitor {
	public double visit(Book book);

	public double visit(Fruit fruit);

}

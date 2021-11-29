package com.visitor;

import com.vis.item.impl.Book;
import com.vis.item.impl.Fruit;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	@Override
	public double visit(Book book) {
		// TODO Auto-generated method stub
		double cost = 0.0;
		if (book.getPrice() > 500) {
			cost = book.getPrice() - 100;
		} else {
			cost = book.getPrice();
		}

		System.out.println("Book:" + book.getName() + "Book isbn:" + book.getIsbnNumber() + "cost:" + cost);

		return cost;
	}

	@Override
	public double visit(Fruit fruit) {
		// TODO Auto-generated method stub
		double cost = fruit.getPriceperkg() * fruit.getWeight();
		System.out.println("Fruit:" + fruit.getName() + "cost:" + fruit.getPriceperkg());

		return cost;
	}

}

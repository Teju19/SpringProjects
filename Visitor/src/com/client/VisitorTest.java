package com.client;

import com.item.Item;
import com.visitor.*;
import com.vis.item.impl.Book;
import com.vis.item.impl.Fruit;
import com.visitor.ShoppingCartVisitorImpl;

public class VisitorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item items[] = new Item[] { new Book("core java", "878767", 123), new Book("java", "8784327", 446),
				new Fruit("mango", 20, 200), new Fruit("orange", 25, 400), };

		double totalCost = calculateTotalCost(items);
		System.out.println("Total Cost:" + totalCost);
	}

	private static double calculateTotalCost(Item[] items) {
		ShoppingCartVisitorImpl shoppingcartvisitor = new ShoppingCartVisitorImpl();
		double totalCost = 0.0;
		for (Item item1 : items) {
			totalCost += item1.accept(shoppingcartvisitor);
		}
		return totalCost;
	}
}

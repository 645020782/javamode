package com.utstar.iterator.dinermenu;

import java.util.Iterator;

public class CookiesMenu implements MenuI{
	private MenuItemI[] items;
	private int count = 0;
	public CookiesMenu(){
		items = new MenuItemI[10];
		addItem("bread", "this is bread", true, 1.0);
		addItem("meat bread", "this is meat bread", false, 2.0);
		addItem("beef bread", "this is beef bread", false, 3.0);
		addItem("egg", "this is vegetable", true, 2.0);
	}
	public void addItem(String name,String description,boolean isVegetarian,double price){
		MenuItemI menuItem = new MenuItemI(name, description, isVegetarian, price);
		items[count] = menuItem;
		count++;
	}
	@Override
	public Iterator createIterator() {
		CookiesIterator cookiesIterator = new CookiesIterator(items);
		return cookiesIterator;
	}

}

package com.utstar.iterator.dinermenu;

import java.util.ArrayList;
import java.util.Iterator;

public class DinerMenu implements Menu{
	private ArrayList<MenuItem> items = new ArrayList<MenuItem>();
	public DinerMenu(){
		addItem("rice", "this is rice", true, 1.0);
		addItem("meat", "this is meat", false, 5.0);
		addItem("beef", "this is beef", false, 7.0);
		addItem("vegetable", "this is vegetable", true, 2.0);
	}
	public void addItem(String name,String description,boolean isVegetarian,double price){
		MenuItem menuItem = new MenuItem(name, description, isVegetarian, price);
		items.add(menuItem);
	}
	@Override
	public Iterator createIterator() {
		DinerIterator dinerIterator = new DinerIterator(items);
		return dinerIterator;
	}

}

package com.utstar.iterator.dinermenu;

import java.util.ArrayList;
import java.util.Iterator;

public class DinerIterator implements Iterator<MenuItemI>{
	private ArrayList<MenuItemI> items;
	private int count = 0;
	
	public DinerIterator(ArrayList<MenuItemI> items) {
		super();
		this.items = items;
	}
	@Override
	public boolean hasNext() {
		if(count<=items.size()-1){
			return true;
		}else{
			return false;
		}
	}
	@Override
	public MenuItemI next() {
		MenuItemI menuItem = items.get(count);
		count++;
		return menuItem;
	}
	@Override
	public void remove() {
		throw new UnsupportedClassVersionError();
	}
	
}

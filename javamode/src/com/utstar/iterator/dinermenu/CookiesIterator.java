package com.utstar.iterator.dinermenu;

import java.util.Iterator;

public class CookiesIterator implements Iterator<MenuItemI>{
	private MenuItemI[] items;
	private int count = 0;
	public CookiesIterator(MenuItemI[] items) {
		super();
		this.items = items;
	}
	@Override
	public boolean hasNext() {
		if(count<=items.length-1&&items[count]!=null){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public MenuItemI next() {
		MenuItemI menuItem = items[count];
		count++;
		return menuItem;
	}

	@Override
	public void remove() {
		throw new UnsupportedClassVersionError();
	}

}

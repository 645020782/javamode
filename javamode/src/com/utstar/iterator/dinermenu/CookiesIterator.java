package com.utstar.iterator.dinermenu;

import java.util.Iterator;

public class CookiesIterator implements Iterator<MenuItem>{
	private MenuItem[] items;
	private int count = 0;
	public CookiesIterator(MenuItem[] items) {
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
	public MenuItem next() {
		MenuItem menuItem = items[count];
		count++;
		return menuItem;
	}

	@Override
	public void remove() {
		throw new UnsupportedClassVersionError();
	}

}

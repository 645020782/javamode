package com.utstar.iterator.dinermenu;

import java.util.Iterator;

import com.sun.xml.internal.ws.server.UnsupportedMediaException;

public class NullIterator implements Iterator {

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Object next() {
		return null;
	}

	@Override
	public void remove() {
		throw new UnsupportedMediaException();
	}

}

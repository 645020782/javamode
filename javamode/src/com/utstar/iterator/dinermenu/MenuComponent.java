package com.utstar.iterator.dinermenu;

import java.util.Iterator;

public abstract  class MenuComponent {
	public String getName(){
		throw new UnsupportedOperationException();
	};
	public float getPrice(){
		throw new UnsupportedOperationException();
	};
	public String getDescription(){
		throw new UnsupportedOperationException();
	};
	public boolean isVegetarian(){
		throw new UnsupportedOperationException();
	};
	public MenuComponent getChild(int index){
		throw new UnsupportedOperationException();
	};
	public Iterator createIterator(){
		throw new UnsupportedOperationException();
	};
	public void add(MenuComponent menu){
		throw new UnsupportedOperationException();
	};
	public void remove(MenuComponent menu){
		throw new UnsupportedOperationException();
	};
	public void print(){
		throw new UnsupportedOperationException();
	};
}

package com.utstar.iterator.dinermenu;

public class Waitress {
	private MenuComponent menu;
	public Waitress(MenuComponent menu) {
		super();
		this.menu = menu;
	}
	public void printMenu(){
		menu.print();
	}
}

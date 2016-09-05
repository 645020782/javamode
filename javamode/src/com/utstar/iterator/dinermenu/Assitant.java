package com.utstar.iterator.dinermenu;

import java.util.Iterator;

public class Assitant {
	public void printMenu(){
		CookiesMenu cookiesMenu = new CookiesMenu();
		DinerMenu dinerMenu = new DinerMenu();
		System.out.println("=====breakfast=====");
		printMenu(cookiesMenu);
		System.out.println("=====diner=====");
		printMenu(dinerMenu);
	}
	private void printMenu(Menu menu){
		Iterator it = menu.createIterator();
		while(it.hasNext()){
			MenuItem next = (MenuItem)it.next();
			System.out.println(next);
		}
	}
}

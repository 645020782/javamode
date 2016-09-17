package com.utstar.iterator.dinermenu;

public class MentTest {

	public static void main(String[] args) {
		MenuComponent menu1 = new Menu("PANCAKE HOUSE MENU","BREAKFSST");
		MenuComponent menu2 = new Menu("Lunch HOUSE MENU","Lunch");
		MenuComponent menu3 = new Menu("Dinner HOUSE MENU","Dinner");
		MenuComponent menu4 = new Menu("Dessert HOUSE MENU","Dessert");
		MenuComponent menuall = new Menu("MENUALL","ALL MENU");
		menu1.add(new MenuItem("rice", "this is rice", true, 1));
		menu2.add(new MenuItem("meat", "this is meat", false, 5));
		menu3.add(new MenuItem("beef", "this is beef", false, 7));
		menu4.add(new MenuItem("vegetable", "this is vegetable", true, 2));
		menuall.add(menu1);
		menuall.add(menu2);
		menuall.add(menu3);
		menuall.add(menu4);
		Waitress waitress = new Waitress(menuall);
		waitress.printMenu();
	}

}

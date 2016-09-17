package com.utstar.iterator.dinermenu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent{
	private String name;
	private String description;
    private ArrayList<MenuComponent> menuList = new ArrayList<MenuComponent>();
	public Menu(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public MenuComponent getChild(int index) {
		return menuList.get(index);
	}
	@Override
	public Iterator createIterator() {
		return new CompositeIterator(menuList.iterator());
	}
	@Override
	public void add(MenuComponent menu) {
		menuList.add(menu);
	}
	@Override
	public void remove(MenuComponent menu) {
		menuList.remove(menu);
	}
	@Override
	public void print() {
		System.out.print("\n"+getName());
		System.out.println(","+getDescription());
		System.out.println("==================");
		Iterator it = menuList.iterator();
		while(it.hasNext()){
			MenuComponent component = (MenuComponent) it.next();
			component.print();
		}
		
	}
	
}

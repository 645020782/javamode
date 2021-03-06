package com.utstar.iterator.dinermenu;

import java.util.Iterator;

public class MenuItem extends MenuComponent{
	private String name;
	private float price;
	private String description;
	private boolean isVegetarian;
	public MenuItem(String name, String description,
			boolean isVegetarian, float price) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.isVegetarian = isVegetarian;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isVegetarian() {
		return isVegetarian;
	}
	public void setVegetarian(boolean isVegetarian) {
		this.isVegetarian = isVegetarian;
	}
	@Override
	public Iterator createIterator() {
		return new NullIterator();
	}
	@Override
	public void print() {
		System.out.print("\n"+getName());
		System.out.print("\n"+getDescription());
		System.out.print("\n"+getPrice());
		System.out.print("\n"+isVegetarian());
	}
	
}

package com.utstar.factory.pizza;

public abstract class PizzaShop {
	public Pizza orderPizza(String type){
		Pizza pizza=createPizza(type);
		pizza.bake();
		pizza.cut();
		pizza.pack();
		return pizza;
	}
	public abstract Pizza createPizza(String type);
}

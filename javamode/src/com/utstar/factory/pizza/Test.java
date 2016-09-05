package com.utstar.factory.pizza;

public class Test {
	public static void main(String[] args){
		PizzaShop shop = new ChinesePizzaShop();
		Pizza pizza = shop.orderPizza("cheese");
		pizza.bake();
	}
}

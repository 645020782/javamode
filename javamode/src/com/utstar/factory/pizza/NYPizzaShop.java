package com.utstar.factory.pizza;

public class NYPizzaShop extends PizzaShop{
	
	@Override
	public Pizza createPizza(String type) {
		NYPizzaIngredientFactory factory = new NYPizzaIngredientFactory();
		NYPizza nyPizza = new NYPizza(factory);
		return nyPizza;
	}

}

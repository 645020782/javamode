package com.utstar.factory.pizza;

public class NYPizza extends Pizza{
	private PizzaIngredientFactory factory;
	
	public NYPizza(PizzaIngredientFactory factory) {
		super();
		this.factory = factory;
	}

	@Override
	public void prepare() {
		factory.creatDough();
		
	}

}

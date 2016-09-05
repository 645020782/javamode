package com.utstar.factory.pizza;

public class ChinesePizzaShop extends PizzaShop{

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if("cheese".equals(type)){
			pizza = new CheesePizza();
		}else if("seafood".equals(type)){
			pizza = new SeafoodPizza();
		}
		return pizza;
	}

}

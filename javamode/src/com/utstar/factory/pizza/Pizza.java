package com.utstar.factory.pizza;

public abstract class Pizza {
	public abstract void prepare();
	public void bake(){
		System.out.println("the pizza is baking");
	}
	public void cut(){
		System.out.println("the pizza is cuting");
	}
	public void pack(){
		System.out.println("the pizza is packing");
	}
}

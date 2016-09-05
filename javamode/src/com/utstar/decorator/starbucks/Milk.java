package com.utstar.decorator.starbucks;

public class Milk extends Condiments{
	private Beverage beverage;
	public Milk(Beverage beverage){
		this.beverage=beverage;
		description="milk";
	}
	@Override
	public String getDescription() {
		return description+"-"+beverage.getDescription();
	}

	@Override
	public double cost() {
		return 0.5+beverage.cost();
	}

}

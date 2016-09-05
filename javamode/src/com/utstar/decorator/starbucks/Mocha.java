package com.utstar.decorator.starbucks;

public class Mocha extends Condiments{
	private Beverage beverage;
	public Mocha(Beverage beverage){
		this.beverage=beverage;
		description="mocha";
	}
	@Override
	public String getDescription() {
		return description+"-"+beverage.getDescription();
	}

	@Override
	public double cost() {
		return 1.0+beverage.cost();
	}

}

package com.utstar.decorator.starbucks;

public abstract class Beverage {
	String description="Unknown Beverage";
	public String getDescription() {
		return description;
	}
	public abstract double cost();
}

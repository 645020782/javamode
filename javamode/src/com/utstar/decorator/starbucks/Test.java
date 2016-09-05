package com.utstar.decorator.starbucks;

public class Test {
	public static void main(String[] args){
		DarkRoast dr = new DarkRoast();
		Milk m = new Milk(dr);
		Mocha mc = new Mocha(m);
		System.out.println(mc.getDescription());
		System.out.println(mc.cost());
	}
}

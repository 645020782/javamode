package com.utstar.state.gumballmachine;

public class Test {
	public static void main(String[] args){
		GumballMachine gumballMachine = new GumballMachine(5);
		System.out.println(gumballMachine.getCount());
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine.getCount());
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine.getCount());
	}
}

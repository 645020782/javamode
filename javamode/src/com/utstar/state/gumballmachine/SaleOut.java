package com.utstar.state.gumballmachine;

public class SaleOut implements State{
	private GumballMachine gumballMachine;
	public SaleOut(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("gumball is sale out!!");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("gumball is sale out!!");
	}

	@Override
	public void turnCrank() {
		System.out.println("gumball is sale out!!");
	}

	@Override
	public void dispense() {
		System.out.println("gumball is sale out!!");
	}

}

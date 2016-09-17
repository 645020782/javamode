package com.utstar.state.gumballmachine;

public class HasQuarter implements State{
	private GumballMachine gumballMachine;
	public HasQuarter(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("the machine already have a quarter!!");
		
	}

	@Override
	public void ejectQuarter() {
		System.out.println("the machine eject quarter!!");
		gumballMachine.setCurrentState(gumballMachine.getNoQuarter());
	}

	@Override
	public void turnCrank() {
		System.out.println("the machine turn!!");
		gumballMachine.setCurrentState(gumballMachine.getSale());
	}

	@Override
	public void dispense() {
		System.out.println("no gumball dispense!");
	}

}

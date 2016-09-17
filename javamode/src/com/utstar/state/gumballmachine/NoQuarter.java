package com.utstar.state.gumballmachine;

public class NoQuarter implements State{
	private GumballMachine gumballMachine;
	
	public NoQuarter(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("insert the quarter!!");
		gumballMachine.setCurrentState(gumballMachine.getHasQuarter());
		
	}

	@Override
	public void ejectQuarter() {
		System.out.println("no quarter eject!!");
	}

	@Override
	public void turnCrank() {
		System.out.println("can`t turn!!");
	}

	@Override
	public void dispense() {
		System.out.println("no gumball dispense!!");
	}

}

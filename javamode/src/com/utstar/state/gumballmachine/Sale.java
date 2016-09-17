package com.utstar.state.gumballmachine;

public class Sale implements State{
	private GumballMachine gumballMachine;
	
	public Sale(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("the machine already have quarter!!");
		
	}

	@Override
	public void ejectQuarter() {
		System.out.println("the machine already turn!!");
	}

	@Override
	public void turnCrank() {
		System.out.println("the machine can`t turn again!!");
	}

	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		if(gumballMachine.getCount()>0){
			gumballMachine.setCurrentState(gumballMachine.getNoQuarter());
		}else{
			System.out.println("gumball is sale out!!");
			gumballMachine.setCurrentState(gumballMachine.getSaleOut());
		}
		
	}

}

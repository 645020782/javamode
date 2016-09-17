package com.utstar.state.gumballmachine;

public class GumballMachine {
	private State hasQuarter;
	private State noQuarter;
	private State sale;
	private State saleOut;
	private State currentState;
	private int count ;
	public GumballMachine(int count) {
		super();
		this.count = count;
		hasQuarter = new HasQuarter(this);
		noQuarter = new NoQuarter(this);
		sale = new Sale(this);
		saleOut = new SaleOut(this);
		if(count>0){
			currentState = noQuarter;
		}
	}
	public void insertQuarter(){
		currentState.insertQuarter();
	}
	public void ejectQuarter(){
		currentState.ejectQuarter();
	}
	public void turnCrank(){
		currentState.turnCrank();
		currentState.dispense();
	}
	public void releaseBall(){
		System.out.println("the gumball comes rolling out the slot!");
		if(count!=0){
			count = count - 1;
		}
	}
	public State getHasQuarter() {
		return hasQuarter;
	}
	public State getNoQuarter() {
		return noQuarter;
	}
	public State getSale() {
		return sale;
	}
	public State getSaleOut() {
		return saleOut;
	}
	public State getCurrentState() {
		return currentState;
	}
	public int getCount() {
		return count;
	}
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}
	
}

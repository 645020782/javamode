package com.utstar.observer.weatherstation;

public class PerssureBoard implements Observer,Show{
	private float perssure;
	private Subject weatherData;
	public PerssureBoard(Subject weatherData){
		this.weatherData=weatherData;
		this.weatherData.registerObserver(this);
	}
	@Override
	public void display() {
		System.out.println("Now perssure is :"+perssure);
	}

	@Override
	public void update(float temperature, float humidity, float perssure) {
		this.perssure=perssure;
		this.display();
	}

}

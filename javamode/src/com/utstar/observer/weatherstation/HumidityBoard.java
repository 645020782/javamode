package com.utstar.observer.weatherstation;

public class HumidityBoard implements Observer,Show{
	private float humidity;
	private Subject weatherData;
	public HumidityBoard(Subject weatherData){
		this.weatherData=weatherData;
		this.weatherData.registerObserver(this);
	}
	@Override
	public void display() {
		System.out.println("Now humidity is :"+humidity);
	}

	@Override
	public void update(float temperature, float humidity, float perssure) {
		this.humidity=humidity;
		this.display();
	}

}

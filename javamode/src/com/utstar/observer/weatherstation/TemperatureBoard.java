package com.utstar.observer.weatherstation;

public class TemperatureBoard implements Observer,Show{
	private float temperatrue;
	private Subject weatherData;
	public TemperatureBoard(Subject weatherData){
		this.weatherData=weatherData;
		this.weatherData.registerObserver(this);
	}
	@Override
	public void display() {
		System.out.println("Now temperatrue is :"+temperatrue);
	}

	@Override
	public void update(float temperature, float humidity, float perssure) {
		this.temperatrue=temperature;
		this.display();
	}

}

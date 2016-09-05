package com.utstar.observer.weatherstation;

public class Test {
	public static void main(String[] args){
		WeatherData wd=new WeatherData();
		HumidityBoard hb=new HumidityBoard(wd);
		TemperatureBoard tb=new TemperatureBoard(wd);
		PerssureBoard pb=new PerssureBoard(wd);
		wd.setMeasurementChange(26.5f, 30.05f, 25.05f);
		wd.setMeasurementChange(27.5f, 31.05f, 26.05f);
		wd.setMeasurementChange(28.5f, 32.05f, 27.05f);
	}
}

package com.utstar.observer.weatherstation;

import java.util.ArrayList;

public class WeatherData implements Subject{
	private boolean changeFlag;
	private float temperature;
	private float humidity;
	private float perssure;
	private ArrayList<Observer> observerList;

	public WeatherData(){
		this.observerList=new ArrayList<Observer>();
	}

	public boolean isChangeFlag() {
		return changeFlag;
	}

	public void setChangeFlag(boolean changeFlag) {
		this.changeFlag = changeFlag;
	}

	@Override
	public void registerObserver(Observer observer) {
		observerList.add(observer);
		
	}

	@Override
	public void delObserver(Observer observer) {
		boolean isExist=observerList.contains(observer);
		if(isExist){
			observerList.remove(observer);
		}
		
	}

	@Override
	public void notifyAllObserver() {
		for(Observer o:observerList){
			o.update(temperature, humidity, perssure);
		}
		this.setChangeFlag(false);
		
	}

	@Override
	public void setChange() {
		this.setChangeFlag(true);
	}
	
	public void setMeasurementChange(float temperature,float humidity,float perssure){
		this.setTemperature(temperature);
		this.setPerssure(perssure);
		this.setHumidity(humidity);
		this.setChange();
		if(isChangeFlag()){
			this.notifyAllObserver();
		}
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getPerssure() {
		return perssure;
	}

	public void setPerssure(float perssure) {
		this.perssure = perssure;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	
}

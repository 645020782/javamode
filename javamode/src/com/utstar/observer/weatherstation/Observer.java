package com.utstar.observer.weatherstation;

public interface Observer {
	public void update(float temperature,float humidity,float perssure);
}

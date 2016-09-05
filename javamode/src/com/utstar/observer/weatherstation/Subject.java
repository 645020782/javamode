package com.utstar.observer.weatherstation;

public interface Subject {
	public void registerObserver(Observer observer);
	public void delObserver(Observer observer);
	public void notifyAllObserver();
	public void setChange();
}

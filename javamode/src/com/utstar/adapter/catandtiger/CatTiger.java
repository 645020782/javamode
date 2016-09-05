package com.utstar.adapter.catandtiger;

public class CatTiger implements Tiger{
	private Cat cat;
	
	public CatTiger(Cat cat) {
		super();
		this.cat = cat;
	}

	@Override
	public void runFast() {
		cat.run();
	}

	@Override
	public void bigPower() {
		cat.power();
	}
	
}

package com.utstar.singleton.myobject;

public class MyObject {
	private static volatile MyObject singleton = null;
	private MyObject(){}
	public static MyObject getInstance(){
		if(singleton==null){
			synchronized (MyObject.class) {
				singleton = new MyObject();
			}
		}
		return singleton;
	}
	public void say(){
		System.out.println("hello !!");
	}
}

package com.rk.di.bad;

public class Car {

	DieselEngine engine;

	public void drive() {
		String engineStart = engine.start();
		System.out.println(engineStart);
	}
}
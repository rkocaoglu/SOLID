package com.rk.di.good;

public class AutoCar implements Car {

	Engine engine;

	public AutoCar(Engine engine) {
		this.engine = engine;
	}

	@Override
	public void drive() {

		String engineStart = engine.start();
		System.out.println(engineStart);

	}
}
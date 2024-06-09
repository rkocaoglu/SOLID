package com.rk.di.good;

public class Test {

	public static void main(String[] args) {
		Engine engine = new ElectricEngine();
		Car car = new AutoCar(engine);
		car.drive();

	}

}

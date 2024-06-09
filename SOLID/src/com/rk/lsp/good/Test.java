package com.rk.lsp.good;

public class Test {

	public static void main(String[] args) {

		Shape rectangle = new Rectangle(10, 5);
		System.out.println("Rectangle Area:" + rectangle.area());
		Shape square = new Square(5);
		System.out.println("Square Area:" + square.area());

	}

}

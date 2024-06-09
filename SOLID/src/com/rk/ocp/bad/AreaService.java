package com.rk.ocp.bad;

import java.util.List;

public class AreaService {
	public double calculateArea(List<Object> shapes) {
		double area = 0;
		for (Object shape : shapes) {
			if (shape instanceof Rectangle) {
				Rectangle rect = (Rectangle) shape;
				area += (rect.getLength() * rect.getHeight());
			} else if (shape instanceof Circle) {
				Circle circle = (Circle) shape;
				double radius = circle.getRadius();
				area += radius * radius * Math.PI;
			} else {
				throw new RuntimeException("Shape not supported");
			}
		}
		return area;
	}
}
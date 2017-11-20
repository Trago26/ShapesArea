package org.itstep.service.impl;
import org.itstep.service.Shape;
public class Circle implements Shape {
	
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}
     public Circle() {
     }
     
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
}

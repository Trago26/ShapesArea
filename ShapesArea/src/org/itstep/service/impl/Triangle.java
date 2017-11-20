package org.itstep.service.impl;

import org.itstep.service.Shape;

public class Triangle implements Shape {
	private int base;
	private int height;
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public double getArea () {
		
		  return base*height/2;
	}
	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}
  
}

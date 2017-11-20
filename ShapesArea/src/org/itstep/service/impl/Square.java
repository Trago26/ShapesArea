package org.itstep.service.impl;

import org.itstep.service.Shape;

public class Square implements Shape {
	
	private int side;

	public int getSide() {
		return side;
	}
	

	public void setSide(int side) {
		this.side = side;
	}


	@Override
	public double getArea() {
		
		return side;
	}
	
	public Square() {
		
	}


	public Square(int side) {
		super();
		this.side = side;
	}

}

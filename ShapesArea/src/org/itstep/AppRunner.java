package org.itstep;

import org.itstep.service.impl.Circle;
import org.itstep.service.impl.Square;
import org.itstep.service.impl.Triangle;

public class AppRunner {

	public static void main(String[] args) {
		
		System.out.println("Домашня робота №2");
		System.out.println("Площа круга:");
		
		Circle circle1 = new Circle(5);
		Circle circle2 = new Circle(10);
		
		System.out.println("Area of first circle is " + circle1.getArea() + "mm");
		System.out.println("Area of second circle is " + circle2.getArea() + "mm");
		
		
	    System.out.println("Площа квадрата:");
	    
	    Square square1 = new Square(15);
	    Square square2 = new Square(20);
	    
        System.out.println("Area of first square is " + square1.getArea() + "mm");
        System.out.println("Area of second square is " + square2.getArea() + "mm");
        
        
        System.out.println("Площа трикутника:");
        
        
        Triangle triangle1 = new Triangle(25, 25);
        Triangle triangle2 = new Triangle(30, 30);
        
        System.out.println("Area of first triangle is " + triangle1.getArea() + "mm");
        System.out.println("Area of second triangle is " + triangle2.getArea() + "mm");

	}

}

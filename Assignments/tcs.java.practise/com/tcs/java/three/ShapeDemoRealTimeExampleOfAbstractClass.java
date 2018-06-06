package com.tcs.java.three;

abstract class Shape{
	abstract public float area();
}

class Circle extends Shape{

	int radius;
	Circle(int radius){
		this.radius=radius;
	}
	
	@Override
	public float area() {
		// TODO Auto-generated method stub
		return (float) (Math.PI*this.radius*this.radius);
	}
	
}

class Square extends Shape{
	
	int side;
	Square(int side){
		this.side=side;
	}

	@Override
	public float area() {
		// TODO Auto-generated method stub
		return side*side;
	}
	
}

public class ShapeDemoRealTimeExampleOfAbstractClass {

	public static float calculateArea(Shape s){
		return s.area();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle(5);
		float circleArea=calculateArea(c);
		float squareArea=calculateArea(new Square(5));
		
		System.out.println("Area of a Circle= "+circleArea);
		System.out.println("Area of a Square= "+squareArea);
	}
}

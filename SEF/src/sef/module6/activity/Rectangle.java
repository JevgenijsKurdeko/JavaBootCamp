package sef.module6.activity;

public class Rectangle extends Shape{
	
	double length;
	double breadth;
	
	public Rectangle(){
		System.out.println("I am a Rectangle default Constructor");
	}
	
	public Rectangle(double len, double br, String col){
		super.color = col;
		this.length = len;
		this.breadth = br;
	}
	
	

	@Override
	double calculateArea() {
		double area = length * breadth;
		return area;
	}

	@Override
	double calculatePerimeter() {
		double perimeter = 2 * (length + breadth);
		return perimeter;
	}
	

}

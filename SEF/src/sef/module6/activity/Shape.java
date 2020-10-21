package sef.module6.activity;

public abstract class  Shape {

	public String color;
	
	public Shape() {
		System.out.println("I am a Shape default constraction");
	}
	
	// Complete the code and Add abstract method calculateArea() and calculatePerimeter() with return type as double
	abstract double calculateArea();
	abstract double calculatePerimeter();
	
	
	
	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}
	
}

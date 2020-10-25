package sef.module6.activity;

public class AbstractionActivity {

	public static void main(String[] args) {
		
		Shape shape = new Rectangle(5, 6, "WHITE");
		
		System.out.println("Area of Rectangle is " + shape.calculateArea());
		System.out.println("Perimeter of Square " + shape.calculatePerimeter());
		System.out.println("Color of Rectangle is " + shape.color);

	}

}

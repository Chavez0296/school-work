import java.util.Scanner;
import java.lang.*; 
/* 
@Author: Luis Chavez @Version 5/6/2022
*/
public class Exercise11_01{
	public static class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	/** Construct a default geometric object */
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}

	/** Construct a geometric object with the specified color
	  * and filled value */
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	/** Return colot */
	public String getColor() {
		return color;
	}

	/** Set a new color */
	public void setColor(String color) {
		this.color = color;
	}

	/** Return filled. Since filled is boolean,
		its getter method is named isFilled */
	public boolean isFilled() {
		return filled;
	}

	/** Set a new filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Get dateCreated */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	/** Return a string representation of this object */
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + 
			" and filled: " + filled;
	}
}




	public static class Triangle
		extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;

	/** Construct default Triangle object */
	Triangle() {
		side1 = side2 = side3 = 1.0;
	}

	/** Construct a triangle with specified side1, side2 and side3 */
	Triangle(double side1, double side2, double side3) { 
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	/** Return side1 */
	public double getSide1() {
		return side1;
	}

	/** Return side2 */
	public double getSide2() {
		return side2;
	}

	/** Return side3 */
	public double getSide3() {
		return side3;
	}

	/** Return area of this triangle */
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
	  double total = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    return total;
	}

	/** Return perimeter of this triangle */
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	/** Return a string description for the triangle */
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
			" side3 = " + side3;
	}
}

	
	
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter three sides of the triangle
		System.out.print("Enter three side of the triangle: ");
		double side1 = input.nextDouble();		
		double side2 = input.nextDouble();		
		double side3 = input.nextDouble();

		// Prompt the user to enter a color
		System.out.print("Enter a color: ");
		String color = input.next();

		// Prompt the user to enter whether the triangle is filled
		System.out.print("Is the triangle filled (true / false)? ");
		boolean filled = input.nextBoolean();

		// Create triangle object with user input
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);

		System.out.println(triangle.toString());
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("Color: " + triangle.getColor());
		System.out.println("Triangle is " + (triangle.isFilled() ? "" : " not ") 
			+ "filled");
	}
}
/*
command>javac Exercise11_01.java
Compiled successful

command>java Exercise11_01
Enter three side of the triangle: 34.5
56.4
36.9
Enter a color: black
Is the triangle filled (true / false)? Triangle: side1 = 34.5 side2 = 56.4 side3 = 36.9
Area: 616.7889833646517
Perimeter: 127.80000000000001
Color: black
Triangle is filled


command>
 */
package javabasics;

public class Shape {
double side;
double length;
double breadth;
public Shape(double side) {
	this.side= side;
}
public Shape(double length,double breadth) {
	
	if(length > 0.0 && length < 20.0) {
			
	this.length=length;
	this.breadth=breadth;
	}

else
	{
		System.out.println("sorry this statement should not greater then 0.0 and less then 20.0");
		
	}}
	public double findAreaofRectangle() {
		return  length * breadth;
	}

	
	


public static void main(String[] args)
{
	Shape square=new Shape(10);
	Shape rectangle = new Shape(12,6.25);
	System.out.println(rectangle.findAreaofRectangle());
			
}
}

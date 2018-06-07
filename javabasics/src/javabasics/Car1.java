package javabasics;

public class Car1 {
	public String name;
	public String model;
	
	public Car1() {
	
		System.out.println("empty cons of car ");
	}
	public Car1(String name) {
		
		System.out.println("1 arg con of car");
	}
	public Car1(String name,String model) {
		this("CarName");
		System.out.println("2 arg cons of car");
	}
	
	public static void main(String[] args) {
		Car1 car=new Car1("bmw");
		
		
	}
	
 
}

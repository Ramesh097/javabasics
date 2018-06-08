package com.poly;

public class PolyTest {
	
			public static void main(String[] args) {
				PolyTest pt=new PolyTest();
				final Taxi tc=new Taxi();
				SportsCar sc=new SportsCar();
				PoliceCar pc=new PoliceCar();
				
				pt.brake(pc);
				pt.brake(sc);
				pt.brake(tc);
				
				
				
			}
			public void brake(Car car) {
				  car.Brake();
				
			}
		
}

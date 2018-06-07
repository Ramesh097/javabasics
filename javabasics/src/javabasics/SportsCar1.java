package javabasics;


	public class SportsCar1 extends Car1 {
		String carType;
		String sourceOfCar;
		public SportsCar1() {
			System.out.println("empty cons in sportscar ");
		}
		public SportsCar1(String carType,String sourceOfCar) {
			System.out.println("2 arg cons of sports");
		}
		
	public static void main(String[] args) {
		SportsCar1 c1=new SportsCar1("Sedon","India");
		
	}
	}

package javabasics;

import java.util.Scanner;

public class PosNeg {
	public static void main(String[] args) {
		int Number;
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Enter the number ");
		 Number = scan.nextInt();
		 scan.close();
		 if(Number > 0) {
			 System.out.println("Given num is positive");
		 }else
		 {
			 System.out.println("Given num is negative");

		 }
	}
}

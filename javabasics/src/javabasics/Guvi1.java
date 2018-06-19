package ramesh;

import java.util.Scanner;

public class Guvi1 {
public static void main(String[] args) {
	int Number;
	 Scanner scan = new Scanner(System.in);
	 Number = scan.nextInt();
	 System.out.println("Enter the number ");
	 scan.close();
	 if(Number > 0) {
		 System.out.println("Given num is positive");
	 }else
	 {
		 System.out.println("Given num is negative");

	 }
}
}


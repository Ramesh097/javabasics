package javabasics;
import java.util.Scanner;
public class Multiple {
	  static int first;
	 static int second;
	  public boolean ISmultiple() {
		if(second%first==0) {
			return true;
		}
		else {
		  
		  return false;
		}}
		  public static void main(String args[]) 
		  {
			  Scanner s=new Scanner(System.in);
			  first=s.nextInt();
			  second=s.nextInt();
			  Multiple m=new Multiple();
			  System.out.println(m.ISmultiple());
		  }
	  }


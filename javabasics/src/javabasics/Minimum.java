package javabasics;

public class Minimum {

public static void main(String args[]) {
	 int a[]= {3,4,5,2,33,24,2};
	int max=a[0];
	
	for(int i=1;i<a.length-1;i++)
	{
		if(max<a[i])
		{
			max=a[i];
		}
		
	}
	System.out.println(max);
	
}
}

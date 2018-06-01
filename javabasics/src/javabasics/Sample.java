package javabasics;

public class Sample {
 public static void main(String[] args)
{int N=4545;
int t=N;
int arr[]=new int[10];
int i=0;
while(t>0) {
	int remainder = t % 10;
	arr[i] = remainder;
	i++;
	t=t/10;
}
for(i=0; i<10;i++) {
	//System.out.println("fsdf");
	System.out.println(arr[i]);
}
	 }
}

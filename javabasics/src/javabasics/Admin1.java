package javabasics;

public class Admin1 {
	public static void main(String args[]){
		Invoice invoice1=new Invoice();
		invoice1.setPartNumber("aaa");
		invoice1.setPardDiscriptionn("apple");
		invoice1.setQuantity(10);
		invoice1.setPrice(-500);
		invoice1.invoiceamount();
		System.out.println(invoice1.getPardDiscriptionn());
		System.out.println(invoice1.getPartNumber());
		System.out.println(invoice1.getPrice());
		System.out.println(invoice1.getQuantity());
		
		
		
		
	}
}

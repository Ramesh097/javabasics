package javabasics;

public class Invoice {
String partNumber;
String pardDiscriptionn;
int quantity;
double price;
public String getPartNumber() {
	return partNumber;
}
public void setPartNumber(String partNumber) {
	this.partNumber = partNumber;
}
public String getPardDiscriptionn() {
	return pardDiscriptionn;
}
public void setPardDiscriptionn(String pardDiscriptionn) {
	this.pardDiscriptionn = pardDiscriptionn;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	if(quantity<0)
		this.quantity=0;
	
	else
	{
	this.quantity = quantity;
}}
public double getPrice()
{
	return price;
}
public void setPrice(double price)
{
	if(price<0)
		this.price=0;
	else
	{
	this.price = price;
}}
public void invoiceamount()
{
	
			double amount=price*quantity;
			System.out.println(amount);
}
}



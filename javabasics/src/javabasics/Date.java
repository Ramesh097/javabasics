package javabasics;

public class Date {
int Day;
int Month;
int Year;
public int getDay() {
	return Day;
}
public void setDay(int day) {
	Day = day;
}
public int getMonth() {
	return Month;
}
public void setMonth(int month) {
	Month = month;
}
public int getYear() {
	return Year;
}
public void setYear(int year) {
	Year = year;
}
public void displayDate() {
	System.out.println(Day+"/"+Month+"/"+Year);
}
}

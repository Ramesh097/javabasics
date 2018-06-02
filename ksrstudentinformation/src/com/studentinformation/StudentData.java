package com.studentinformation;

public class StudentData {
public  static void main(String[]args) {
	Student studentone=new Student();
	studentone.setFirstName("Ramesh");
	studentone.setLastName("Aanji");
	studentone.setId(001);
	studentone.setGender("male");
	studentone.setBranch("Btech");
	studentone.setDept("It");
	System.out.println(studentone.toString());
	Student studenttwo=new Student();
	studenttwo.setFirstName("manoj");
	studenttwo.setLastName("kumar");
	studenttwo.setId(002);
	studenttwo.setGender("male");
	studenttwo.setBranch("Btech");
	studenttwo.setDept("It");
	System.out.println(studenttwo.toString());
	Student studentthree=new Student();
	studentthree.setFirstName("selva");
	studentthree.setLastName("kiruba");
	studentthree.setId(69);
	studentthree.setGender("transgender");
	studentthree.setBranch("Be");
	studentthree.setDept("EceCs");
	System.out.println(studentthree.toString());
	
	
}

}

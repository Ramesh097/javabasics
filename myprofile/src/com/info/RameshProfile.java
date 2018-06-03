package com.info;

public class RameshProfile implements IProfile {

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstants.FIRST_NAME+"Ramesh");
		System.out.println(ProfileConstants.LAST_NAME+"aanji");
		System.out.println("Age:21");

	}

	@Override
	public void myHobbies() {

		System.out.println("watching movies.");
		System.out.println("browsing.");

	}
	

}

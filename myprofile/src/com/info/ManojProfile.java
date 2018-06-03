package com.info;

public class ManojProfile implements IProfile
{

	@Override
	public void myHobbies() {
		System.out.println(ProfileConstants.FIRST_NAME+"Manoj");
		System.out.println(ProfileConstants.LAST_NAME+"Kumar");
		System.out.println("Age:21");

		
	}

	@Override
	public void myBasicInfo() {
		
		System.out.println("playing with babies.");
		System.out.println("playing with pets.");

	}

}

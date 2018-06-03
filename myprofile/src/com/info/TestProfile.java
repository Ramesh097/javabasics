package com.info;



public class TestProfile {
	static void PrintProfile(IProfile Profile) {
		Profile.myBasicInfo();
		Profile.myHobbies();
	}
     public static void main(String[]args) {
    	 IProfile myProfile = new RameshProfile();
    	 TestProfile.PrintProfile(myProfile);
    	 IProfile myProfile1 = new ManojProfile();
    	 TestProfile.PrintProfile(myProfile1);
    	  
     }
}

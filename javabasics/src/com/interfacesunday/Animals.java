package com.interfacesunday;

public abstract class Animals implements Travel {
    
	
	public class Dog extends Animals {
		@Override
		public int getspeed() {
			return 0;
		}
	}
      public class Cat extends Animals {
  		@Override
  		public int getspeed() {
  			return 0;
  		}
  	} 
      public class Rabbit extends Animals {
  		@Override
  		public int getspeed() {
  			return 0;
  		}
  	}
}

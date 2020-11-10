package com.qa.qacommunity.polymorphism.childclass;

import com.qa.qacommunity.polymorphism.Vehicle;

public class Car1 extends Vehicle {

		//Attributes
		public boolean isFast;
		
		
		//Constructor
		public Car1() {
			
			super();
			this.isFast = true;
		}

		//Overloaded constructor
		public Car1 (String type, int numOfWheels, String colour, boolean isFast) {
			super(type, numOfWheels, colour);
			this.isFast = isFast;
		}
		
		//Methods
		public boolean isFast() {
			return isFast;
		}
		
		public void setisFast(boolean isFast) {
			this.isFast = isFast;
		}

}

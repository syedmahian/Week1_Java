package com.qa.qacommunity.Polymorphism2.childClass;

import com.qa.qacommunity.Polymorphism2.Vehicle;

public class Car extends Vehicle {
	
	//Attributes
	public boolean isFast;
	
	//Constructors
	
	public Car() {
		
		super();
		this.isFast = true;
	}
	
	public Car(String name, String colour, int numOfSeats, boolean isFast) {
		
		super(name, colour, numOfSeats);
		this.isFast= isFast;
	}


	
	
	//Methods
	
	public boolean isFast() {
		return isFast;
	}

	public void setFast(boolean isFast) {
		this.isFast = isFast;
	}
}

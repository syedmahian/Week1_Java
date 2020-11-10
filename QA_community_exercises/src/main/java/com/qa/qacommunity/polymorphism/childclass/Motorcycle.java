package com.qa.qacommunity.polymorphism.childclass;

import com.qa.qacommunity.polymorphism.Vehicle;

public class Motorcycle extends Vehicle {
	
	//Attributes
	
	public String style = "";
	
	//Constructor
	
	public Motorcycle() {
		super();
		this.style = "Cruiser";
		
	}

	public Motorcycle(String type, int numOfWheels, String colour, ) {
		
	}
}

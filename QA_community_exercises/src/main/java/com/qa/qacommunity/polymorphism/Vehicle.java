package com.qa.qacommunity.polymorphism;


public class Vehicle {

	// Attribute
	public String type;
	public int numOfWheels;
	public String colour;
	
	//Constructor
	
	public Vehicle(){
		super();
		
		
	}
	
	//Overloaded Constructor
	
	public Vehicle(String type, int numOfWheels, String colour) {
		
		super();
		this.type = type;
		this.numOfWheels = numOfWheels;
		this.colour = colour;
	
	}


	
	//Methods
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
}

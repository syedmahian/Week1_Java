package com.qa.qacommunity.Polymorphism2;

public class Vehicle {
	
	//Attributes
	
	protected String name;
	protected String colour;
	protected int numOfSeats;
	
	
	//Constructors
	
	public Vehicle() {
		super();
		this.name = "Car";
		this.colour = "Silver";
		this.numOfSeats = 5;
	}
	
	public Vehicle(String name, String colour, int numOfSeats) {
		
		super();
		this.name = name;
		this.colour = colour;
		this.numOfSeats = numOfSeats;
	}

	
	
	//Methods
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

}

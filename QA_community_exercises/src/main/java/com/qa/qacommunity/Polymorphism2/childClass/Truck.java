package com.qa.qacommunity.Polymorphism2.childClass;

import com.qa.qacommunity.Polymorphism2.Vehicle;

public class Truck extends Vehicle{
	
	//Attributes
	public int bootCapacity;
	
	//Constructors
	
	public Truck() {
		super();
		this.bootCapacity = 300;
	}
	
	public Truck(String name, String colour, int numOfSeats, int bootCapacity) {
		
		super(name, colour, numOfSeats);
		this.bootCapacity = bootCapacity;
		
	}

	//Methods
	public int getBootCapacity() {
		return bootCapacity;
	}

	public void setBootCapacity(int bootCapacity) {
		this.bootCapacity = bootCapacity;
	}
	
	

}

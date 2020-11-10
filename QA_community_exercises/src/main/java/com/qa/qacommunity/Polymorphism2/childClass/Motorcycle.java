package com.qa.qacommunity.Polymorphism2.childClass;

import com.qa.qacommunity.Polymorphism2.Vehicle;

public class Motorcycle extends Vehicle {
	
	//Attribute 
	
	public String style;
	
	//Constructor
	
	public Motorcycle() {
		
		super();
		this.style = "Cruiser";
		
	}
	
	public Motorcycle(String name, String colour, int numOfSeats, String style) {
		super(name, colour, numOfSeats);
		this.style= style;
		
	}

	
	//Methods
	
	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}
	
	
	
	
}


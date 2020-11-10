package com.qa.qacommunity.inheritance;

import com.qa.qacommunity.inheritance.childClass.Lion;

public class Animal {
	
	//Attributes
	protected String name;
	protected int numOfLegs;
	protected boolean isPredator;
	
	//Constructor
	public Animal(){
		this.name = "Tiger";
		this.numOfLegs = 4;
		this.isPredator = true;
		
	}
	
	public Animal(String name, int numOfLegs, boolean isPredator) {
		super();
		this.name = name;
		this.numOfLegs = numOfLegs;
		this.isPredator = isPredator;
		
	}

	
	
	
	//Methods
	
	
	
		
	//Getters and Setters	
	
	public  String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumOfLegs() {
		return numOfLegs;
	}

	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}

	public boolean isPredator() {
		return isPredator;
	}

	public void setPredator(boolean isPredator) {
		this.isPredator = isPredator;
	}
}

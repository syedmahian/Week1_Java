package com.qa.qacommunity.inheritance.childClass;

import com.qa.qacommunity.inheritance.Animal;

public class Lion extends Animal {
	
	//Attributes
	public boolean hasClaws;
	
	
	//Constructor
	public Lion(String name, int numOfLegs, boolean isPredator, boolean hasClaw) {
		
		super(name, numOfLegs, isPredator);
		this.hasClaws = hasClaw;
	}

	//Overloaded constructor
	public Lion(String name, int numOfLegs, boolean isPredator) {
		super(name, numOfLegs, isPredator);
		this.hasClaws = true;
	}

	//Methods
	
	public boolean isHasClaws() {
		return hasClaws;
	}


	public void setHasClaws(boolean hasClaws) {
		this.hasClaws = hasClaws;
	}

}

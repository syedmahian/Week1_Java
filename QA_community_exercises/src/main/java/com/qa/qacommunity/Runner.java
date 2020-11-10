package com.qa.qacommunity;

import com.qa.qacommunity.inheritance.childClass.Lion;

public class Runner {

public static void main(String[] args) {
		
		Lion character1 = new Lion("Lion", 4, true, true);
		
		System.out.println("I am a " + character1.getName());
	
}
}
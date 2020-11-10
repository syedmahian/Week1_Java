package com.qa.qacommunity.Polymorphism2;
import java.util.ArrayList;
import com.qa.qacommunity.Polymorphism2.Vehicle;


public class Garage extends Vehicle{
	
	public static void main(String[]args) {
		
		ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
		vehicleList.add(Motorcycle);
		vehicleList.add(Car);
		vehicleList.add(Truck);
		
	for (Vehicle handle: vehicleList) {
		
		handle.drive()
		}
		
	String selectMotorcycle = vehicleList.get(0).getName();
	String selectCar = vehicleList.get(1).getName();
	String selectTruck = vehicleList.get(2).getName();
	
	System.out.println(selectMotorcycle);
	System.out.println(selectCar);
	System.out.println(selectTruck);
	
	
	}

}

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
	ArrayList<String> cars = new ArrayList<>();
	
	cars.add("Volkswage");
	cars.add("Mazda");
	cars.add("BMW");
	cars.add("Mercedes");
	
	for(String i: cars) {
		
		System.out.println(i);
		}
	// get from ArrayList
	cars.get(3);
	
	// set in ArrayList
	cars.set(1, "Jaguar");
	
	
	}
}

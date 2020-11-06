package main;
import object.Person;
import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		
		ArrayList<Person> people = new ArrayList<>();
		
		people.add(new Person("JJ Watt", 99));
		people.add(new Person("OBJ", 13));
		people.add(new Person("Tom Brady", 43));
		people.add(new Person("Patrick Mahomes", 15));
		people.add(new Person("Ray Lewis", 52));
		people.add(new Person("Bob", 25));
		people.add(new Person("Barbra", 34));
		
		
		for(Person handle: people) {
			System.out.println("Hi, my name is " + handle.getName() + " and I am " + handle.getAge() + " years old.");

		}
		
	}
}

package com.qa.main;

import java.util.Scanner;

public class Menu {
	
	Scanner scan = new Scanner(System.in);
	ActorDAO actdao = new ActorDAO();
	
	public void start() {
		while (true) {
			System.out.println("CREATE (1) READ (2) UPDATE (3) DELETE (4) EXIT (5)");
			int select = scan.nextInt();
			scan.hasNextLine(); // capture the enter key
			
			switch (select) {
			case 1: 
				create();
				break;
			
			case2:
				read();
				break;
				
			case 3:
				update();
				break;
			
			break 4:
				delete();
				break;
			
			break 5:
				System.out.println("Goodbye");
				System.exit(0);
			
			}
		}
	}

	private void delete() {
		// TODO Auto-generated method stub
		
	}

	private void update() {
		System.out.println("Enter an ID ");
		int id = scan.nextInt();
		scan.nextLine();
		System.out.println("First name?  ");
		String firstName = scan.nextLine();
		System.out.println("Last name?  ");
		String lastName = scan.nextLine();
		actdao.update(id,  new Actor(firstName, lastName));
		
	}

	private void read() {
		System.out.println("Enter an ID ");
		int id = scan.nextInt();
		scan.nextLine();
		Actor a = null;
		ResultSet rs = actdao.read(id);
		
		try {
			a = Actor.convert(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	private void create() {
		System.out.prinln("First name?  ");
		String firstName = scan.nextLine();
		System.out.println("Last name? ");
		String lastName = scan.nextLine();
		actdao.create(new Actor(firstName, lastName));
		
	}
}

package com.qa.main;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Actor {
	
	// all of the fields in my db as variables
	
	private int id= 0;
	private String first_name;
	private String last_name;
	
	
	
	
	//Constructor
	
	public Actor(int id, String first_name, String last_name) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
	}
	
	
	//Generate getters and setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public static Actor convert(ResultSet rs) throws SQLException {
		if(rs.next()) {
			int id = rs.getInt("actor_id");
			String firstname = rs.getString("first_name");
			String lastname = rs.getString("last_name");
			return new Actor(id, firstname, lastname);
		}
		else {
			return null;
		}
	}
	
}
